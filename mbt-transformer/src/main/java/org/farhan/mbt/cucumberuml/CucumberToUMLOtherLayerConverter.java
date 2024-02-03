package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.cucumber.CucumberJavaFile;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.AnnotationFactory;
import org.farhan.mbt.uml.ArgumentFactory;
import org.farhan.mbt.uml.ClassFactory;
import org.farhan.mbt.uml.CommentFactory;
import org.farhan.mbt.uml.ElementImportFactory;
import org.farhan.mbt.uml.InteractionFactory;
import org.farhan.mbt.uml.MessageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLProject;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.Statement;

public class CucumberToUMLOtherLayerConverter extends ToUMLOtherLayerConverter {

	private CucumberJavaFile aCucumberJavaFile;
	// TODO move this to the super class
	private String layer;

	CucumberProject sourceProject;

	public CucumberToUMLOtherLayerConverter(String layer, CucumberProject sourceProject, UMLProject targetProject) {
		this.layer = layer;
		this.sourceProject = sourceProject;
		this.targetProject = targetProject;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void convertObjects() throws Exception {
		super.convertObjects();
		if (sourceProject.secondLayerName.contentEquals(getLayer())) {
			linkLayerFiles(getLayer());
		}
	}

	@Override
	final protected void selectLayerObjects() {
		ArrayList<Class> upperLayerClasses = null;
		ArrayList<ConvertibleObject> layerFiles = null;
		if (sourceProject.secondLayerName.contentEquals(getLayer())) {
			upperLayerClasses = targetProject.getLayerClasses(sourceProject.firstLayerName);
			// TODO this is inefficient, it's reading every file unnecessarily, move the
			// call to read() here. The same applies to the first layer. Basically move file
			// reading out of the project to the converters to be more selective
			layerFiles = sourceProject.getLayerObjects(sourceProject.secondLayerName);
		} else if (sourceProject.thirdLayerName.contentEquals(layer)) {
			upperLayerClasses = targetProject.getLayerClasses(sourceProject.secondLayerName);
			layerFiles = sourceProject.getLayerObjects(sourceProject.thirdLayerName);
		}
		// Instead of reading a file twice, make a short list to save time reading each
		// file
		HashMap<String, Class> layerClassShortList = new HashMap<String, Class>();
		for (Class c : upperLayerClasses) {
			for (ElementImport ei : c.getElementImports()) {
				Class importedClass = (Class) ei.getImportedElement();
				layerClassShortList.put(importedClass.getQualifiedName(), importedClass);
			}
		}
		for (int i = layerFiles.size() - 1; i >= 0; i--) {
			if (!isFileSelected(layerFiles.get(i), layerClassShortList)) {
				layerFiles.remove(i);
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getLayerObjects(String layer) {
		return sourceProject.getLayerObjects(layer);
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, HashMap<String, Class> layerClassShortList) {
		CucumberJavaFile cjf = (CucumberJavaFile) convertibleFile;
		String qName = convertJavaPathToQualifiedName(cjf.getFile().getAbsolutePath());
		return layerClassShortList.containsKey(qName);
	}

	@Override
	protected Class convertObject(ConvertibleObject layerFile) throws Exception {
		aCucumberJavaFile = (CucumberJavaFile) layerFile;
		String qualifiedName = convertAbsolutePathToQualifiedName(aCucumberJavaFile.getFile().getAbsolutePath());
		Class layerClass = ClassFactory.getClass(targetProject.theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertImports(Class layerClass) throws Exception {
		if (aCucumberJavaFile.javaClass.getTypes().size() > 0) {
			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
			Optional<Comment> comment = aCucumberJavaFile.javaClass.getType(0).getComment();
			if (comment.isPresent()) {
				CommentFactory.getComment(layerClass, comment.get().getContent());
			}
			for (ImportDeclaration i : aCucumberJavaFile.javaClass.getImports()) {
				i.getNameAsString();
				if (!i.getNameAsString().endsWith("Factory")) {
					// Don't include the factory import because it's a detail of dependency
					// injection is implemented
					String anImportName = convertImportNameToQualifiedName(i.getNameAsString());
					ElementImportFactory.getElementImport(layerClass, anImportName);
				}
			}
		}
	}

	@Override
	protected void convertBehaviours(Class layerClass) throws Exception {
		for (MethodDeclaration md : aCucumberJavaFile.javaClass.getType(0).getMethods()) {
			// TODO determine if this interaction is empty
			Interaction anInteraction = InteractionFactory.getInteraction(layerClass, md.getNameAsString(), true);

			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
			String body;
			if (md.getJavadocComment().isPresent()) {
				body = md.getJavadocComment().get().getContent().replace(" * ", "");
			} else {
				body = "";
			}
			// TODO this should replace the existing comment, not add more
			anInteraction.createOwnedComment().setBody(body);
			if (md.getAnnotations().size() > 0) {
				AnnotationFactory.getAnnotation(anInteraction, md.getAnnotation(0).toString());
			}
			for (Parameter p : md.getParameters()) {
				// TODO this should probably empty out the parameters if any exist
				ParameterFactory.getParameter(anInteraction, p.getNameAsString(), "", "in");
			}
			convertInteractionMessages(anInteraction, md.getBody().get().getStatements());
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {
		// TODO if there's already a body, don't add the java code to it, just do
		// nothing
		for (Object o : steps) {
			Statement s = (Statement) o;
			if (s.getChildNodes().get(0) instanceof MethodCallExpr) {
				MethodCallExpr mce = (MethodCallExpr) s.getChildNodes().get(0);
				convertMessage(anInteraction, mce);
			}
		}
	}

	// TODO this is a duplicate method from UMLToCucumberOtherLayerConverter.
	private boolean isSecondLayer(Class layerClass) {
		if (layerClass.getQualifiedName().contains("::" + sourceProject.secondLayerName + "::")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		MethodCallExpr mce = (MethodCallExpr) o;
		Class owningClass = (Class) anInteraction.getOwner();
		// TODO change this, don't store how the DI is achieved in the UML model
		// TODO When creating the ElementImport, for now I'm assuming the class is
		// directly under the app package name and not anywhere else. In the future make
		// the search smarter and look through all the classes in the package. That will
		// also assume that the class name is unique
		if (isSecondLayer(owningClass)) {
			String qualifiedName = getObjectQualifiedNameFromFactory(mce);
			ElementImportFactory.getElementImport(owningClass, qualifiedName);
			Class importedClass = ClassFactory.getClass(targetProject.theSystem, qualifiedName);
			Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, mce.getName().asString());
			mce.getArguments();
			for (Expression e : mce.getArguments()) {
				String arg = "";
				if (e instanceof NameExpr) {
					arg = e.asNameExpr().getNameAsString();
				} else if (e instanceof StringLiteralExpr) {
					arg = "\"" + e.asStringLiteralExpr().asString().replace("\"", "\\\"") + "\"";
				} else if (e instanceof BinaryExpr) {
					arg = e.asBinaryExpr().toString();
				} else if (e instanceof ObjectCreationExpr) {
					arg = e.asObjectCreationExpr().toString();
				} else if (e instanceof MethodCallExpr) {
					arg = e.asMethodCallExpr().toString();
				} else {
					// TODO throw an exception to find new expressions
					arg = e.asNameExpr().getNameAsString();
				}
				// when reading java source, the name of the arguments isn't known so I use the
				// value as the name
				ArgumentFactory.getArgument(theMessage, arg, arg, true);
			}
		} else {
			// TODO handle layer 3 java code
		}
	}

	private String getObjectQualifiedNameFromFactory(MethodCallExpr mce) {
		// Get the app name from the factory class
		String appName = mce.getChildNodes().getFirst().getChildNodes().getFirst().toString().replace("Factory", "")
				.toLowerCase();
		// get the object name from the argument of the factory class
		String objectName = mce.getChildNodes().getFirst().getChildNodes().getLast().toString().replace("\"", "");
		// make the qualified name
		String qualifiedName = targetProject.theSystem.getName() + "::" + targetProject.thirdLayerName + "::" + appName
				+ "::" + objectName;
		return qualifiedName;
	}

	@Override
	protected String convertQualifiedNameToAbsolutePath(String qualifiedName) {
		return null;
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		return convertJavaPathToQualifiedName(pathName);
	}

	@Override
	protected String convertQualifiedNameToImportName(String qualifiedName) {
		// TODO preserve org.farhan
		return qualifiedName.replace("pst::", "org::farhan::").replace("::", ".");
	}

	@Override
	protected String convertImportNameToQualifiedName(String importName) {
		// TODO preserve org.farhan
		String qualifiedName = importName.replace(".", "::");
		if (qualifiedName.startsWith("org::farhan::")) {
			return qualifiedName.replace("org::farhan::", "pst::");
		} else {
			return "pst::" + qualifiedName;
		}
	}

	private String convertJavaPathToQualifiedName(String pathName) {
		String qualifiedName = pathName.trim();
		qualifiedName = qualifiedName.replace(".java", "");
		qualifiedName = qualifiedName.replace(
				sourceProject.getLayerDir(sourceProject.secondLayerName).getAbsolutePath(),
				sourceProject.secondLayerName);
		qualifiedName = qualifiedName.replace(sourceProject.getLayerDir(sourceProject.thirdLayerName).getAbsolutePath(),
				sourceProject.thirdLayerName);
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::" + qualifiedName;
		return qualifiedName;
	}
}
