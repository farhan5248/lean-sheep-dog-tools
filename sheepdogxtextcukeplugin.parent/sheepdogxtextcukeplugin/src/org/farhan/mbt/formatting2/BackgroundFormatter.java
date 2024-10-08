package org.farhan.mbt.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.cucumber.Background;
import org.farhan.mbt.services.CucumberGrammarAccess;
import org.farhan.mbt.services.CucumberGrammarAccess.BackgroundElements;

public class BackgroundFormatter extends AbstractScenarioFormatter {

	public BackgroundFormatter(Background theBackground) {
		super(theBackground);
	}

	@Override
	protected AbstractParserRuleElementFinder getAccess(CucumberGrammarAccess ga) {
		return ga.getBackgroundAccess();
	}

	@Override
	protected Keyword getKeyword(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getBackgroundKeyword_0();
	}

	@Override
	protected RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getEOLTerminalRuleCall_2();
	}

	@Override
	protected RuleCall getPhraseRuleCall(AbstractParserRuleElementFinder a) {
		return ((BackgroundElements) a).getNamePhraseParserRuleCall_1_0();
	}

	@Override
	protected void formatTags(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		// Nothing to do here
	}

	@Override
	protected void formatExamples(IFormattableDocument doc, CucumberGrammarAccess ga, CucumberFormatter df) {
		// Nothing to do here
	}

}
