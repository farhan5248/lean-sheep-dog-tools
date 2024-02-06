package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.Examples;
import org.farhan.cucumber.Line;
import org.farhan.cucumber.Row;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.ScenarioOutline;
import org.farhan.cucumber.Statement;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLGherkinConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.cucumber.CucumberFeatureWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class FeatureToUMLConverter extends ToUMLGherkinConverter {

	private UMLClassWrapper ucw;
	private CucumberProject source;

	public FeatureToUMLConverter(String layer, CucumberProject source, UMLProject target) {
		this.layer = layer;
		this.source = source;
		this.target = target;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void convertObjects() throws Exception {
		super.convertObjects();
		linkLayerFiles(getLayer());
	}

	@Override
	protected void selectObjects() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(source.getDir(layer), source.getFileExt(layer));
		for (File f : files) {
			source.createObject(f.getAbsolutePath()).load();
			if (!isFileSelected(source.getObjects(layer).getLast(), source.tags)) {
				source.getObjects(layer).removeLast();
			}
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return source.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		// TODO source and target files should be stored in this class, there's no need
		// to pass them around.
		CucumberFeatureWrapper cfw = (CucumberFeatureWrapper) theObject;
		String qualifiedName = convertObjectName(cfw.getFile().getAbsolutePath());

		ucw = (UMLClassWrapper) target.createObject(qualifiedName);
		ucw.theClass.createOwnedComment().setBody(convertStatementsToString(cfw.theFeature.getStatements()));
	}

	@Override
	protected void convertImports(ConvertibleObject theObject) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject theObject) throws Exception {

		CucumberFeatureWrapper ufw = (CucumberFeatureWrapper) theObject;
		Background b = null;
		for (AbstractScenario as : ufw.theFeature.getAbstractScenarios()) {
			if (as instanceof Background) {
				b = (Background) as;
				continue;
			}
			resetCurrentContainerObject();
			Interaction anInteraction = createInteraction(ucw.theClass, as);
			if (as instanceof Scenario) {
				Scenario s = (Scenario) as;
				convertTagsToParameters(anInteraction, s.getTags());
			}
			// TODO apply example data to step data table
			if (as instanceof ScenarioOutline) {
				ScenarioOutline so = (ScenarioOutline) as;
				convertTagsToParameters(anInteraction, so.getTags());
				convertExamplesToAnnotations(anInteraction, so);
			}
			// If there is a background, add its steps first
			if (b != null) {
				convertInteractionMessages(anInteraction, b.getSteps());
			}
			convertInteractionMessages(anInteraction, as.getSteps());
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {
		for (Object o : steps) {
			Step cs = (Step) o;
			String messageName = cs.getName();
			if (Validator.validateStepText(messageName)) {
				setCurrentMachineAndState(messageName);
				convertMessage(anInteraction, cs);
			} else {
				throw new Exception("Step (" + cs.getName() + ") is not valid, use Xtext editor to correct it first. ");
			}
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		Step s = (Step) o;
		Message theMessage = convertStepToMessage(anInteraction, s);
		convertDataTableToArgument(s, theMessage);
		convertDocStringToArgument(s, theMessage);
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(source.getFileExt(source.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(source.getDir(source.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	private void convertDocStringToArgument(Step s, Message theMessage) {
		if (s.getTheDocString() != null) {
			ValueSpecification vs = createArgument(theMessage, "docString", "", true);
			EList<Line> lines = s.getTheDocString().getLines();
			for (int i = 0; i < lines.size(); i++) {
				createAnnotation(vs, "docString", String.valueOf(i), lines.get(i).getName());
			}
		}
	}

	private void convertDataTableToArgument(Step s, Message theMessage) {
		if (s.getTheStepTable() != null) {
			ValueSpecification vs = createArgument(theMessage, "dataTable", "", true);
			EList<Row> rows = s.getTheStepTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + " |";
				}
				createAnnotation(vs, "dataTable", String.valueOf(i), value);
			}
		}
	}

	private Message convertStepToMessage(Interaction anInteraction, Step step) {
		Class owningClass = (Class) anInteraction.getOwner();
		String nextLayerName = getNextLayerClassName();
		UMLClassWrapper ucwi = (UMLClassWrapper) target.createObject(nextLayerName);
		Class nextLayerClass = ucwi.theClass;
		createElementImport(owningClass, nextLayerClass);
		owningClass.createOwnedAttribute(nextLayerClass.getName(), nextLayerClass);
		Message theMessage = getMessage(anInteraction, nextLayerClass, step.getName());
		return theMessage;
	}

	private String getNextLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = convertNextLayerClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + source.SECOND_LAYER + "::" + Utilities.toLowerCamelCase(getFSMName()) + "::"
				+ secondLayerClassName;
		return secondLayerClassName;
	}

	private boolean isFileSelected(ConvertibleObject convertibleFile, String layerSelectionCriteria) throws Exception {

		CucumberFeatureWrapper ufw = (CucumberFeatureWrapper) convertibleFile;
		if (isTagged(ufw.theFeature.getTags(), layerSelectionCriteria)) {
			return true;
		}
		for (AbstractScenario a : ufw.theFeature.getAbstractScenarios()) {
			if (a instanceof Scenario) {
				if (isTagged(((Scenario) a).getTags(), layerSelectionCriteria)) {
					return true;
				}
			} else if (a instanceof ScenarioOutline) {
				if (isTagged(((ScenarioOutline) a).getTags(), layerSelectionCriteria)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isTagged(EList<Tag> tags, String layerSelectionCriteria) {
		for (Tag t : tags) {
			if (t.getName().trim().contentEquals(layerSelectionCriteria)) {
				return true;
			}
		}
		return false;
	}

	private void convertExamplesToAnnotations(Interaction anInteraction, ScenarioOutline so) {
		for (Examples e : so.getExamples()) {
			EList<Row> rows = e.getTheExamplesTable().getRows();
			for (int i = 0; i < rows.size(); i++) {

				String value = "";
				for (int j = 0; j < rows.get(i).getCells().size(); j++) {
					value += rows.get(i).getCells().get(j).getName() + "|";
				}
				createAnnotation(anInteraction, e.getName(), String.valueOf(i), value);
			}
		}
	}

	private void convertTagsToParameters(Interaction anInteraction, EList<Tag> tags) {
		for (Tag a : tags) {
			getParameter(anInteraction, a.getName().replace("@", ""), "", "in");
		}
	}

	private Interaction createInteraction(Class layerClass, AbstractScenario as) {
		Interaction anInteraction = getInteraction(layerClass, as.getName(), true);
		anInteraction.setName(anInteraction.getName());
		anInteraction.createOwnedComment().setBody(convertStatementsToString(as.getStatements()));
		return anInteraction;
	}

	private String convertStatementsToString(EList<Statement> eList) {
		String contents = "";
		for (Statement s : eList) {
			contents += s.getName() + "\n";
		}
		return contents.trim();
	}
}
