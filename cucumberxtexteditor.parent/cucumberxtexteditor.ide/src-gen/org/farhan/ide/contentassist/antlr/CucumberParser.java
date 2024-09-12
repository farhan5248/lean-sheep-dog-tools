/*
 * generated by Xtext 2.32.0
 */
package org.farhan.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.farhan.ide.contentassist.antlr.internal.InternalCucumberParser;
import org.farhan.services.CucumberGrammarAccess;

public class CucumberParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CucumberGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CucumberGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getAlternatives(), "rule__Model__Alternatives");
			builder.put(grammarAccess.getAbstractScenarioAccess().getAlternatives(), "rule__AbstractScenario__Alternatives");
			builder.put(grammarAccess.getStepAccess().getAlternatives(), "rule__Step__Alternatives");
			builder.put(grammarAccess.getGivenAccess().getAlternatives_3(), "rule__Given__Alternatives_3");
			builder.put(grammarAccess.getWhenAccess().getAlternatives_3(), "rule__When__Alternatives_3");
			builder.put(grammarAccess.getThenAccess().getAlternatives_3(), "rule__Then__Alternatives_3");
			builder.put(grammarAccess.getAndAccess().getAlternatives_3(), "rule__And__Alternatives_3");
			builder.put(grammarAccess.getButAccess().getAlternatives_3(), "rule__But__Alternatives_3");
			builder.put(grammarAccess.getAsteriskAccess().getAlternatives_3(), "rule__Asterisk__Alternatives_3");
			builder.put(grammarAccess.getTEXT_LITERALAccess().getAlternatives(), "rule__TEXT_LITERAL__Alternatives");
			builder.put(grammarAccess.getStepObjectAccess().getGroup(), "rule__StepObject__Group__0");
			builder.put(grammarAccess.getStepDefinitionAccess().getGroup(), "rule__StepDefinition__Group__0");
			builder.put(grammarAccess.getStepParametersAccess().getGroup(), "rule__StepParameters__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_0(), "rule__Feature__Group_0__0");
			builder.put(grammarAccess.getBackgroundAccess().getGroup(), "rule__Background__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_0(), "rule__Scenario__Group_0__0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getGroup(), "rule__ScenarioOutline__Group__0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getGroup_0(), "rule__ScenarioOutline__Group_0__0");
			builder.put(grammarAccess.getExamplesAccess().getGroup(), "rule__Examples__Group__0");
			builder.put(grammarAccess.getExamplesAccess().getGroup_0(), "rule__Examples__Group_0__0");
			builder.put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
			builder.put(grammarAccess.getCellAccess().getGroup(), "rule__Cell__Group__0");
			builder.put(grammarAccess.getDocStringAccess().getGroup(), "rule__DocString__Group__0");
			builder.put(grammarAccess.getGivenAccess().getGroup(), "rule__Given__Group__0");
			builder.put(grammarAccess.getWhenAccess().getGroup(), "rule__When__Group__0");
			builder.put(grammarAccess.getThenAccess().getGroup(), "rule__Then__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getButAccess().getGroup(), "rule__But__Group__0");
			builder.put(grammarAccess.getAsteriskAccess().getGroup(), "rule__Asterisk__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
			builder.put(grammarAccess.getLineAccess().getGroup(), "rule__Line__Group__0");
			builder.put(grammarAccess.getStepObjectAccess().getNameAssignment_1(), "rule__StepObject__NameAssignment_1");
			builder.put(grammarAccess.getStepObjectAccess().getStatementsAssignment_3(), "rule__StepObject__StatementsAssignment_3");
			builder.put(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4(), "rule__StepObject__StepDefinitionsAssignment_4");
			builder.put(grammarAccess.getStepDefinitionAccess().getNameAssignment_1(), "rule__StepDefinition__NameAssignment_1");
			builder.put(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3(), "rule__StepDefinition__StatementsAssignment_3");
			builder.put(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4(), "rule__StepDefinition__StepParametersAssignment_4");
			builder.put(grammarAccess.getStepParametersAccess().getNameAssignment_1(), "rule__StepParameters__NameAssignment_1");
			builder.put(grammarAccess.getStepParametersAccess().getStatementsAssignment_3(), "rule__StepParameters__StatementsAssignment_3");
			builder.put(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4(), "rule__StepParameters__ParametersTableAssignment_4");
			builder.put(grammarAccess.getParametersTableAccess().getRowsAssignment(), "rule__ParametersTable__RowsAssignment");
			builder.put(grammarAccess.getFeatureAccess().getTagsAssignment_0_0(), "rule__Feature__TagsAssignment_0_0");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_2(), "rule__Feature__NameAssignment_2");
			builder.put(grammarAccess.getFeatureAccess().getStatementsAssignment_4(), "rule__Feature__StatementsAssignment_4");
			builder.put(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5(), "rule__Feature__AbstractScenariosAssignment_5");
			builder.put(grammarAccess.getBackgroundAccess().getNameAssignment_1(), "rule__Background__NameAssignment_1");
			builder.put(grammarAccess.getBackgroundAccess().getStatementsAssignment_3(), "rule__Background__StatementsAssignment_3");
			builder.put(grammarAccess.getBackgroundAccess().getStepsAssignment_4(), "rule__Background__StepsAssignment_4");
			builder.put(grammarAccess.getScenarioAccess().getTagsAssignment_0_0(), "rule__Scenario__TagsAssignment_0_0");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_2(), "rule__Scenario__NameAssignment_2");
			builder.put(grammarAccess.getScenarioAccess().getStatementsAssignment_4(), "rule__Scenario__StatementsAssignment_4");
			builder.put(grammarAccess.getScenarioAccess().getStepsAssignment_5(), "rule__Scenario__StepsAssignment_5");
			builder.put(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0(), "rule__ScenarioOutline__TagsAssignment_0_0");
			builder.put(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2(), "rule__ScenarioOutline__NameAssignment_2");
			builder.put(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4(), "rule__ScenarioOutline__StatementsAssignment_4");
			builder.put(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5(), "rule__ScenarioOutline__StepsAssignment_5");
			builder.put(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6(), "rule__ScenarioOutline__ExamplesAssignment_6");
			builder.put(grammarAccess.getExamplesAccess().getTagsAssignment_0_0(), "rule__Examples__TagsAssignment_0_0");
			builder.put(grammarAccess.getExamplesAccess().getNameAssignment_2(), "rule__Examples__NameAssignment_2");
			builder.put(grammarAccess.getExamplesAccess().getStatementsAssignment_4(), "rule__Examples__StatementsAssignment_4");
			builder.put(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5(), "rule__Examples__TheExamplesTableAssignment_5");
			builder.put(grammarAccess.getExamplesTableAccess().getRowsAssignment(), "rule__ExamplesTable__RowsAssignment");
			builder.put(grammarAccess.getStepTableAccess().getRowsAssignment(), "rule__StepTable__RowsAssignment");
			builder.put(grammarAccess.getRowAccess().getCellsAssignment_0(), "rule__Row__CellsAssignment_0");
			builder.put(grammarAccess.getCellAccess().getNameAssignment_1(), "rule__Cell__NameAssignment_1");
			builder.put(grammarAccess.getDocStringAccess().getLinesAssignment_2(), "rule__DocString__LinesAssignment_2");
			builder.put(grammarAccess.getGivenAccess().getNameAssignment_1(), "rule__Given__NameAssignment_1");
			builder.put(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0(), "rule__Given__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1(), "rule__Given__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getWhenAccess().getNameAssignment_1(), "rule__When__NameAssignment_1");
			builder.put(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0(), "rule__When__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1(), "rule__When__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getThenAccess().getNameAssignment_1(), "rule__Then__NameAssignment_1");
			builder.put(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0(), "rule__Then__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1(), "rule__Then__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getAndAccess().getNameAssignment_1(), "rule__And__NameAssignment_1");
			builder.put(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0(), "rule__And__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1(), "rule__And__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getButAccess().getNameAssignment_1(), "rule__But__NameAssignment_1");
			builder.put(grammarAccess.getButAccess().getTheStepTableAssignment_3_0(), "rule__But__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getButAccess().getTheDocStringAssignment_3_1(), "rule__But__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getAsteriskAccess().getNameAssignment_1(), "rule__Asterisk__NameAssignment_1");
			builder.put(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0(), "rule__Asterisk__TheStepTableAssignment_3_0");
			builder.put(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1(), "rule__Asterisk__TheDocStringAssignment_3_1");
			builder.put(grammarAccess.getStatementAccess().getNameAssignment_0(), "rule__Statement__NameAssignment_0");
			builder.put(grammarAccess.getTagAccess().getNameAssignment_1(), "rule__Tag__NameAssignment_1");
			builder.put(grammarAccess.getLineAccess().getNameAssignment_0(), "rule__Line__NameAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CucumberGrammarAccess grammarAccess;

	@Override
	protected InternalCucumberParser createParser() {
		InternalCucumberParser result = new InternalCucumberParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public CucumberGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
