/*
 * generated by Xtext 2.32.0
 */
package org.farhan.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CucumberGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTagParserRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFeatureKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Assignment cScenariosAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cScenariosScenarioParserRuleCall_4_0 = (RuleCall)cScenariosAssignment_4.eContents().get(0);
		
		//Feature:
		//    (tags+=Tag)* EOL
		//    'Feature:' title=Description
		//    // this is a 0 or more list of Scenario
		//    (scenarios+=Scenario)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(tags+=Tag)* EOL
		//'Feature:' title=Description
		//// this is a 0 or more list of Scenario
		//(scenarios+=Scenario)*
		public Group getGroup() { return cGroup; }
		
		//(tags+=Tag)*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }
		
		//Tag
		public RuleCall getTagsTagParserRuleCall_0_0() { return cTagsTagParserRuleCall_0_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
		
		//'Feature:'
		public Keyword getFeatureKeyword_2() { return cFeatureKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//// this is a 0 or more list of Scenario
		//(scenarios+=Scenario)*
		public Assignment getScenariosAssignment_4() { return cScenariosAssignment_4; }
		
		//Scenario
		public RuleCall getScenariosScenarioParserRuleCall_4_0() { return cScenariosScenarioParserRuleCall_4_0; }
	}
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTagsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTagsTagParserRuleCall_0_0 = (RuleCall)cTagsAssignment_0.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cScenarioKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleDescriptionParserRuleCall_3_0 = (RuleCall)cTitleAssignment_3.eContents().get(0);
		private final Assignment cStepsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepsStepParserRuleCall_4_0 = (RuleCall)cStepsAssignment_4.eContents().get(0);
		
		//Scenario:
		//    (tags+=Tag)* EOL
		//    'Scenario:' title=Description
		//    // this is a 0 or more list of Step
		//    (steps+=Step)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(tags+=Tag)* EOL
		//'Scenario:' title=Description
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Group getGroup() { return cGroup; }
		
		//(tags+=Tag)*
		public Assignment getTagsAssignment_0() { return cTagsAssignment_0; }
		
		//Tag
		public RuleCall getTagsTagParserRuleCall_0_0() { return cTagsTagParserRuleCall_0_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
		
		//'Scenario:'
		public Keyword getScenarioKeyword_2() { return cScenarioKeyword_2; }
		
		//title=Description
		public Assignment getTitleAssignment_3() { return cTitleAssignment_3; }
		
		//Description
		public RuleCall getTitleDescriptionParserRuleCall_3_0() { return cTitleDescriptionParserRuleCall_3_0; }
		
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Assignment getStepsAssignment_4() { return cStepsAssignment_4; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_4_0() { return cStepsStepParserRuleCall_4_0; }
	}
	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeywordAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cKeywordAlternatives_0_0 = (Alternatives)cKeywordAssignment_0.eContents().get(0);
		private final Keyword cKeywordGivenKeyword_0_0_0 = (Keyword)cKeywordAlternatives_0_0.eContents().get(0);
		private final Keyword cKeywordWhenKeyword_0_0_1 = (Keyword)cKeywordAlternatives_0_0.eContents().get(1);
		private final Keyword cKeywordThenKeyword_0_0_2 = (Keyword)cKeywordAlternatives_0_0.eContents().get(2);
		private final Keyword cKeywordAndKeyword_0_0_3 = (Keyword)cKeywordAlternatives_0_0.eContents().get(3);
		private final Keyword cKeywordButKeyword_0_0_4 = (Keyword)cKeywordAlternatives_0_0.eContents().get(4);
		private final Keyword cKeywordAsteriskKeyword_0_0_5 = (Keyword)cKeywordAlternatives_0_0.eContents().get(5);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleSentenceParserRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		
		//Step:
		//    keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence;
		@Override public ParserRule getRule() { return rule; }
		
		//keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence
		public Group getGroup() { return cGroup; }
		
		//keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*')
		public Assignment getKeywordAssignment_0() { return cKeywordAssignment_0; }
		
		//('Given' | 'When' | 'Then' | 'And' | 'But' | '*')
		public Alternatives getKeywordAlternatives_0_0() { return cKeywordAlternatives_0_0; }
		
		//'Given'
		public Keyword getKeywordGivenKeyword_0_0_0() { return cKeywordGivenKeyword_0_0_0; }
		
		//'When'
		public Keyword getKeywordWhenKeyword_0_0_1() { return cKeywordWhenKeyword_0_0_1; }
		
		//'Then'
		public Keyword getKeywordThenKeyword_0_0_2() { return cKeywordThenKeyword_0_0_2; }
		
		//'And'
		public Keyword getKeywordAndKeyword_0_0_3() { return cKeywordAndKeyword_0_0_3; }
		
		//'But'
		public Keyword getKeywordButKeyword_0_0_4() { return cKeywordButKeyword_0_0_4; }
		
		//'*'
		public Keyword getKeywordAsteriskKeyword_0_0_5() { return cKeywordAsteriskKeyword_0_0_5; }
		
		//title=Sentence
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }
		
		//Sentence
		public RuleCall getTitleSentenceParserRuleCall_1_0() { return cTitleSentenceParserRuleCall_1_0; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Description");
		private final Assignment cSentencesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSentencesSentenceParserRuleCall_0 = (RuleCall)cSentencesAssignment.eContents().get(0);
		
		//Description:
		//    (sentences+=Sentence)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(sentences+=Sentence)+
		public Assignment getSentencesAssignment() { return cSentencesAssignment; }
		
		//Sentence
		public RuleCall getSentencesSentenceParserRuleCall_0() { return cSentencesSentenceParserRuleCall_0; }
	}
	public class TagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Tag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTitleAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cTitleCommercialAtKeyword_0_0 = (Keyword)cTitleAssignment_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Tag:
		//    title='@' ID WS?;
		@Override public ParserRule getRule() { return rule; }
		
		//title='@' ID WS?
		public Group getGroup() { return cGroup; }
		
		//title='@'
		public Assignment getTitleAssignment_0() { return cTitleAssignment_0; }
		
		//'@'
		public Keyword getTitleCommercialAtKeyword_0_0() { return cTitleCommercialAtKeyword_0_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//WS?
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }
	}
	public class SentenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Sentence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Sentence:
		//    WORD+ EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//WORD+ EOL
		public Group getGroup() { return cGroup; }
		
		//WORD+
		public RuleCall getWORDTerminalRuleCall_0() { return cWORDTerminalRuleCall_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
	}
	
	
	private final FeatureElements pFeature;
	private final ScenarioElements pScenario;
	private final StepElements pStep;
	private final DescriptionElements pDescription;
	private final TagElements pTag;
	private final SentenceElements pSentence;
	private final TerminalRule tWS;
	private final TerminalRule tEOL;
	private final TerminalRule tID;
	private final TerminalRule tWORD;
	
	private final Grammar grammar;

	@Inject
	public CucumberGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pFeature = new FeatureElements();
		this.pScenario = new ScenarioElements();
		this.pStep = new StepElements();
		this.pDescription = new DescriptionElements();
		this.pTag = new TagElements();
		this.pSentence = new SentenceElements();
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.WS");
		this.tEOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.EOL");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.ID");
		this.tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.WORD");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.farhan.Cucumber".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Feature:
	//    (tags+=Tag)* EOL
	//    'Feature:' title=Description
	//    // this is a 0 or more list of Scenario
	//    (scenarios+=Scenario)*;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Scenario:
	//    (tags+=Tag)* EOL
	//    'Scenario:' title=Description
	//    // this is a 0 or more list of Step
	//    (steps+=Step)*;
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	//Step:
	//    keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}
	
	//Description:
	//    (sentences+=Sentence)+;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//Tag:
	//    title='@' ID WS?;
	public TagElements getTagAccess() {
		return pTag;
	}
	
	public ParserRule getTagRule() {
		return getTagAccess().getRule();
	}
	
	//Sentence:
	//    WORD+ EOL;
	public SentenceElements getSentenceAccess() {
		return pSentence;
	}
	
	public ParserRule getSentenceRule() {
		return getSentenceAccess().getRule();
	}
	
	//// This is leading whitespace
	//terminal WS:
	//    (' ' | '\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//// this is trailing whitespace
	//terminal EOL:
	//    ('\r\n' | '\n')+;
	public TerminalRule getEOLRule() {
		return tEOL;
	}
	
	//// .. needs the ecore import
	//terminal ID:
	//    ('a'..'z' | 'A'..'Z' | '0'..'9')+;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal WORD:
	//    WS ID;
	public TerminalRule getWORDRule() {
		return tWORD;
	}
}
