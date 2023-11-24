/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.And;
import org.xtext.example.mydsl.myDsl.Asterisk;
import org.xtext.example.mydsl.myDsl.Background;
import org.xtext.example.mydsl.myDsl.But;
import org.xtext.example.mydsl.myDsl.Cell;
import org.xtext.example.mydsl.myDsl.Example;
import org.xtext.example.mydsl.myDsl.Given;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Row;
import org.xtext.example.mydsl.myDsl.Scenario;
import org.xtext.example.mydsl.myDsl.ScenarioOutline;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.myDsl.Then;
import org.xtext.example.mydsl.myDsl.When;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case MyDslPackage.ASTERISK:
				sequence_Asterisk(context, (Asterisk) semanticObject); 
				return; 
			case MyDslPackage.BACKGROUND:
				sequence_Background(context, (Background) semanticObject); 
				return; 
			case MyDslPackage.BUT:
				sequence_But(context, (But) semanticObject); 
				return; 
			case MyDslPackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case MyDslPackage.EXAMPLE:
				sequence_Example(context, (Example) semanticObject); 
				return; 
			case MyDslPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case MyDslPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case MyDslPackage.SCENARIO_OUTLINE:
				sequence_ScenarioOutline(context, (ScenarioOutline) semanticObject); 
				return; 
			case MyDslPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case MyDslPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			case MyDslPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case MyDslPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns And
	 *     And returns And
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Asterisk
	 *     Asterisk returns Asterisk
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_Asterisk(ISerializationContext context, Asterisk semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenario returns Background
	 *     Background returns Background
	 *
	 * Constraint:
	 *     (name=Phrase statements+=Statement* steps+=Step*)
	 * </pre>
	 */
	protected void sequence_Background(ISerializationContext context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns But
	 *     But returns But
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_But(ISerializationContext context, But semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     (cell='|' name=Phrase)
	 * </pre>
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CELL__CELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CELL__CELL));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CELL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CELL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getCellVerticalLineKeyword_0_0(), semanticObject.getCell());
		feeder.accept(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Example returns Example
	 *
	 * Constraint:
	 *     (tags+=Tag* name=Phrase statements+=Statement* rows+=Row+)
	 * </pre>
	 */
	protected void sequence_Example(ISerializationContext context, Example semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Given
	 *     Given returns Given
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (tags+=Tag* name=Phrase statements+=Statement* abstractScenarios+=AbstractScenario*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Row returns Row
	 *
	 * Constraint:
	 *     cells+=Cell+
	 * </pre>
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenario returns ScenarioOutline
	 *     ScenarioOutline returns ScenarioOutline
	 *
	 * Constraint:
	 *     (tags+=Tag* name=Phrase statements+=Statement* steps+=Step* examples+=Example+)
	 * </pre>
	 */
	protected void sequence_ScenarioOutline(ISerializationContext context, ScenarioOutline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenario returns Scenario
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (tags+=Tag* name=Phrase statements+=Statement* steps+=Step*)
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Tag returns Tag
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Tag(ISerializationContext context, Tag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TAG__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Then
	 *     Then returns Then
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_Then(ISerializationContext context, Then semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns When
	 *     When returns When
	 *
	 * Constraint:
	 *     name=Phrase
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STEP__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
