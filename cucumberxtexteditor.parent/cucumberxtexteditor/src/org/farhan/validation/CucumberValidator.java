/*
 * generated by Xtext 2.32.0
 */
package org.farhan.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.farhan.cucumber.AbstractScenario;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.StepTable;
import org.farhan.mbt.validation.MBTEdgeValidator;
import org.farhan.mbt.validation.MBTVertexValidator;

public class CucumberValidator extends AbstractCucumberValidator {

	public static final String INVALID_NAME = "invalidName";
	public static final String INVALID_HEADER = "invalidHeader";
	public static final String INVALID_STEP_TYPE = "invalidStepType";

	// Validate if the Step is a valid vertice with input or edge, FAST is when the
	// file is modified
	@Check(CheckType.FAST)
	public void checkStepName(Step step) {

		// TODO the quickfix here is to identify which regex is broken and put an
		// example in place
		if (!MBTEdgeValidator.isValid(step.getName()) && !MBTVertexValidator.isValid(step.getName())) {
			// TODO instead of this error message, give the parts breakdown to see what's
			// missing
			error(MBTVertexValidator.getErrorMessage(), CucumberPackage.Literals.STEP__NAME, INVALID_NAME);
		}
		// TODO apply validation to Given/Then vs When
		AbstractScenario as = (AbstractScenario) step.eContainer();
	}

	@Check(CheckType.FAST)
	public void checkStepTableName(StepTable stepTable) {
		// TODO Add table column row validation, each row should have the max number of
		// columns
		// TODO make tests for this
		for (Cell header : stepTable.getRows().get(0).getCells()) {
			if (!Character.isUpperCase(header.getName().charAt(0))) {
				warning("Table header names should start with a capital: " + header.getName(),
						CucumberPackage.Literals.STEP_TABLE__ROWS, INVALID_HEADER, header.getName());
			}
		}
	}

	// Validate if the Abstract Scenario is a valid path, NORMAL is when the file is
	// saved
	@Check(CheckType.NORMAL)
	public void checkScenario(Scenario scenario) {

		// TODO validate that state and transition validation are applied to Given/Then
		// and When respectively
		// For And, But and *, the last GWT should apply. The quickfix here is to change
		// the keyword
		// TODO also check that there's a sequence of GWT or G(G|A|B)*W(W|A|B)*T(T|A|B)*
		// and not (G|W|T|A|B)*
		if (!Character.isUpperCase(scenario.getName().charAt(0))) {
			warning("Scenario name should start with a capital", CucumberPackage.Literals.ABSTRACT_SCENARIO__NAME,
					INVALID_NAME);
		}
	}

	// Validate if the Feature is a valid graph, EXPENSIVE is when the
	// validation menu item is selected
	@Check(CheckType.EXPENSIVE)
	public void checkFeature(Feature feature) {
		// TODO validate that feature file name and feature name are the same.
		if (!Character.isUpperCase(feature.getName().charAt(0))) {
			warning("Feature name should start with a capital", CucumberPackage.Literals.FEATURE__NAME, INVALID_NAME);
		}
	}

}
