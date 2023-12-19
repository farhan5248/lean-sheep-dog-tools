package org.farhan.objects.common;

import java.io.File;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.conv.core.Project;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.CommentFactory;
import org.farhan.mbt.conv.uml.ElementImportFactory;
import org.farhan.mbt.conv.uml.PackageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.PropertyFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.LifelineFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.UMLProject;
import org.junit.jupiter.api.Assertions;

public abstract class UMLFile extends FileObject {

	protected Model theSystem;

	public void assertExists() {

		super.assertExists();
		try {
			theSystem = UMLProject.initProject(keyValue.get("model"));
			theSystem = UMLProject.importUMLFiles(theSystem, new File(Project.baseDir + Project.umlDir));
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertClassExists(String className) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Assertions.assertTrue(theClass != null, "Class " + className + " doesn't exist");
	}

	protected void assertClassCommentValue(String className, String commentBody) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Comment comment = CommentFactory.getComment(theClass, 0);
		Assertions.assertTrue(comment != null, "Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());
	}

	protected void assertClassAliasValue(String className, String alias) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImportByAlias(theClass, alias);
		Assertions.assertTrue(elementImport != null, "Alias " + alias + " doesn't exist");
	}

	protected void assertClassImportedElementValue(String className, String importedElement) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		ElementImport elementImport = ElementImportFactory.getElementImport(theClass, importedElement);
		Assertions.assertTrue(elementImport != null, "Imported Element " + importedElement + " doesn't exist");
	}

	protected void assertClassPropertyNameExists(String className, String propertyName) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null, "Property Name " + propertyName + " doesn't exist");
	}

	protected void assertClassPropertyTypeValue(String className, String propertyName, String propertyType) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Property property = PropertyFactory.getProperty(theClass, propertyName);
		Assertions.assertTrue(property != null, "Property Name " + propertyName + " doesn't exist");
		Assertions.assertEquals(propertyType, property.getType().getQualifiedName());
	}

	protected void assertInteractionNameExists(String className, String interactionName) {
		Class theClass = (Class) PackageFactory.getPackagedElement(keyValue.get("model") + "::" + className, theSystem);
		Interaction interaction = InteractionFactory.getInteraction(theClass, interactionName, false);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");
	}

	protected void assertInteractionNameExists(String interactionName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Assertions.assertTrue(interaction != null, "Interaction " + interactionName + " doesn't exist");
	}

	protected void assertInteractionParameterNameValue(String interactionName, String parameterName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Parameter parameter = ParameterFactory.getParameter(interaction, parameterName);
		Assertions.assertTrue(parameter != null, "Parameter " + parameterName + " doesn't exist");
	}

	protected void assertInteractionCommentValue(String interactionName, String commentBody) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Comment comment = CommentFactory.getComment(interaction, 0);
		Assertions.assertTrue(comment != null, "Comment " + commentBody + " doesn't exist");
		Assertions.assertEquals(commentBody, comment.getBody());
	}

	protected void assertInteractionMessageValue(String interactionName, String messageName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		Assertions.assertTrue(message != null, "Message " + messageName + " doesn't exist");
	}

	protected void assertInteractionMessageArgumentNameExists(String interactionName, String messageName,
			String argumentName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		ValueSpecification vs = ArgumentFactory.getArgument(message, argumentName);
		Assertions.assertTrue(vs != null, "Argument Name " + argumentName + " doesn't exist");
	}

	protected void assertInteractionAnnotationNameExists(String interactionName, String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		EAnnotation annotation = null;
		for (EAnnotation e : interaction.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Assertions.assertTrue(annotation != null, "Annotation " + annotationName + " doesn't exist");
	}

	protected void assertInteractionAnnotationDetailExists(String interactionName, String annotationName,
			String annotationDetail) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		EAnnotation annotation = null;
		for (EAnnotation e : interaction.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Entry<String, String> detail = null;
		for (Entry<String, String> d : annotation.getDetails()) {
			String e = d.getKey() + " -> " + d.getValue();
			if (e.contentEquals(annotationDetail)) {
				detail = d;
				break;
			}
		}
		Assertions.assertTrue(detail != null, "Annotation Detail " + annotationDetail + " doesn't exist");
	}

	protected void assertInteractionMessageAnnotationNameExists(String interactionName, String messageName,
			String annotationName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		EAnnotation annotation = null;
		for (EAnnotation e : message.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Assertions.assertTrue(annotation != null, "Annotation " + annotationName + " doesn't exist");
	}

	protected void assertInteractionMessageAnnotationDetailExists(String interactionName, String messageName,
			String annotationName, String annotationDetail) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Message message = MessageFactory.getMessage(interaction, messageName);
		// TODO make an AnnotationFactory
		EAnnotation annotation = null;
		for (EAnnotation e : message.getEAnnotations()) {
			if (e.getSource().contentEquals(annotationName)) {
				annotation = e;
				break;
			}
		}
		Entry<String, String> detail = null;
		for (Entry<String, String> d : annotation.getDetails()) {
			String e = d.getKey() + " -> " + d.getValue();
			if (e.contentEquals(annotationDetail)) {
				detail = d;
				break;
			}
		}
		Assertions.assertTrue(detail != null, "Annotation Detail " + annotationDetail + " doesn't exist");
	}

	protected void assertInteractionLifelineExists(String interactionName, String lifelineName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		Assertions.assertTrue(lifeline != null, "Lifeline " + lifelineName + " doesn't exist");
	}

	protected void assertInteractionLifelineRepresentsValue(String interactionName, String lifelineName,
			String lifelineRepresents) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		Lifeline lifeline = LifelineFactory.getLifeline(interaction, lifelineName);
		ConnectableElement represents = lifeline.getRepresents();
		Assertions.assertTrue(represents != null, "Lifeline Represents " + lifelineName + " doesn't exist");
		Assertions.assertEquals(lifelineRepresents, represents.getQualifiedName());
	}

	protected void assertInteractionMessageOccurenceExists(String interactionName, String messageOccurenceName) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Assertions.assertTrue(messageOccurence != null, "Message Occurence " + messageOccurenceName + " doesn't exist");
	}

	protected void assertInteractionLifelineCoveredValue(String interactionName, String messageOccurenceName,
			String lifelineCovered) {
		Interaction interaction = (Interaction) PackageFactory
				.getPackagedElement(keyValue.get("model") + "::" + interactionName, theSystem);
		MessageOccurrenceSpecification messageOccurence = MessageFactory.getMessageOccurence(interaction,
				messageOccurenceName);
		Lifeline covered = messageOccurence.getCovered(lifelineCovered);
		Assertions.assertTrue(covered != null, "Lifeline Covered " + lifelineCovered + " doesn't exist");
		Assertions.assertEquals(lifelineCovered, covered.getName());
	}
}
