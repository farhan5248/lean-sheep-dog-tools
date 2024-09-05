/*
 * generated by Xtext 2.32.0
 */
package org.farhan.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.farhan.cucumber.Cell;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.StepTable;
import org.farhan.helper.StepDefinitionHelperOld;
import org.farhan.helper.StepHelper;

public class CucumberValidator extends AbstractCucumberValidator {

	public static final String INVALID_NAME = "invalidName";
	public static final String INVALID_HEADER = "invalidHeader";
	public static final String INVALID_STEP_TYPE = "invalidStepType";
	public static final String MISSING_STEP_DEF = "invalidStepType";

	@Check(CheckType.FAST)
	public void checkStepName(Step step) {

		if (step.getName() != null) {
			// TODO the quickfix here is to identify which regex is broken and put an
			// example in place
			if (!StepHelper.isValid(step.getName())) {
				// TODO instead of this error message, give the parts breakdown to see what's
				// missing
				error(StepHelper.getErrorMessage(), CucumberPackage.Literals.STEP__NAME, INVALID_NAME);
			} else {
				// if it's valid, then check if the the step def exists, if not call the
				// generator in the quick fix
				String problems = StepDefinitionHelperOld.getProblems(step);
				if (!problems.isEmpty()) {
					warning(problems, CucumberPackage.Literals.STEP__NAME, MISSING_STEP_DEF, step.getName());
				}
			}
		}
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

	@Check(CheckType.NORMAL)
	public void checkScenario(Scenario scenario) {

		// TODO the first step should have a component. If not, there should be a
		// background for which this should also be true
		// TODO also check that there's a sequence of GWT or G(G|A|B)*W(W|A|B)*T(T|A|B)*
		// and not (G|W|T|A|B)*
		if (!Character.isUpperCase(scenario.getName().charAt(0))) {
			warning("Scenario name should start with a capital", CucumberPackage.Literals.ABSTRACT_SCENARIO__NAME,
					INVALID_NAME);
		}
	}

	@Check(CheckType.EXPENSIVE)
	public void checkFeature(Feature feature) {
		// TODO validate that feature file name and feature name are the same.
		if (!Character.isUpperCase(feature.getName().charAt(0))) {
			warning("Feature name should start with a capital", CucumberPackage.Literals.FEATURE__NAME, INVALID_NAME);
		}
	}

}
