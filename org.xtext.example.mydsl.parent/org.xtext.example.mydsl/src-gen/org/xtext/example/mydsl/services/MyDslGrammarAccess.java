/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.services;

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
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamePhraseParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsStatementParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		private final Assignment cStepSetsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepSetsStepSetParserRuleCall_4_0 = (RuleCall)cStepSetsAssignment_4.eContents().get(0);
		
		//Model:
		//    'Feature:' name=Phrase EOL
		//    statements+=Statement*
		//    stepSets+=stepSet*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Feature:' name=Phrase EOL
		//statements+=Statement*
		//stepSets+=stepSet*
		public Group getGroup() { return cGroup; }
		
		//'Feature:'
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }
		
		//name=Phrase
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//Phrase
		public RuleCall getNamePhraseParserRuleCall_1_0() { return cNamePhraseParserRuleCall_1_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_2() { return cEOLTerminalRuleCall_2; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_3_0() { return cStatementsStatementParserRuleCall_3_0; }
		
		//stepSets+=stepSet*
		public Assignment getStepSetsAssignment_4() { return cStepSetsAssignment_4; }
		
		//stepSet
		public RuleCall getStepSetsStepSetParserRuleCall_4_0() { return cStepSetsStepSetParserRuleCall_4_0; }
	}
	public class StepSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.stepSet");
		private final RuleCall cBackgroundParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//stepSet:
		//    Background;
		@Override public ParserRule getRule() { return rule; }
		
		//Background
		public RuleCall getBackgroundParserRuleCall() { return cBackgroundParserRuleCall; }
	}
	public class BackgroundElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Background");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBackgroundKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamePhraseParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cStatementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStatementsStatementParserRuleCall_3_0 = (RuleCall)cStatementsAssignment_3.eContents().get(0);
		private final Assignment cStepsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepsStepParserRuleCall_4_0 = (RuleCall)cStepsAssignment_4.eContents().get(0);
		
		//Background:
		//    'Background:' name=Phrase EOL
		//    statements+=Statement*
		//    steps+=Step*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Background:' name=Phrase EOL
		//statements+=Statement*
		//steps+=Step*
		public Group getGroup() { return cGroup; }
		
		//'Background:'
		public Keyword getBackgroundKeyword_0() { return cBackgroundKeyword_0; }
		
		//name=Phrase
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//Phrase
		public RuleCall getNamePhraseParserRuleCall_1_0() { return cNamePhraseParserRuleCall_1_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_2() { return cEOLTerminalRuleCall_2; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_3() { return cStatementsAssignment_3; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_3_0() { return cStatementsStatementParserRuleCall_3_0; }
		
		//steps+=Step*
		public Assignment getStepsAssignment_4() { return cStepsAssignment_4; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_4_0() { return cStepsStepParserRuleCall_4_0; }
	}
	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cGivenKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cWhenKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Keyword cThenKeyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Keyword cAndKeyword_0_3 = (Keyword)cAlternatives_0.eContents().get(3);
		private final Keyword cButKeyword_0_4 = (Keyword)cAlternatives_0.eContents().get(4);
		private final Keyword cAsteriskKeyword_0_5 = (Keyword)cAlternatives_0.eContents().get(5);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNamePhraseParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Step:
		//    ('Given' | 'When' | 'Then' | 'And' | 'But' | '*') name=Phrase EOL?;
		@Override public ParserRule getRule() { return rule; }
		
		//('Given' | 'When' | 'Then' | 'And' | 'But' | '*') name=Phrase EOL?
		public Group getGroup() { return cGroup; }
		
		//('Given' | 'When' | 'Then' | 'And' | 'But' | '*')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'Given'
		public Keyword getGivenKeyword_0_0() { return cGivenKeyword_0_0; }
		
		//'When'
		public Keyword getWhenKeyword_0_1() { return cWhenKeyword_0_1; }
		
		//'Then'
		public Keyword getThenKeyword_0_2() { return cThenKeyword_0_2; }
		
		//'And'
		public Keyword getAndKeyword_0_3() { return cAndKeyword_0_3; }
		
		//'But'
		public Keyword getButKeyword_0_4() { return cButKeyword_0_4; }
		
		//'*'
		public Keyword getAsteriskKeyword_0_5() { return cAsteriskKeyword_0_5; }
		
		//name=Phrase
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//Phrase
		public RuleCall getNamePhraseParserRuleCall_1_0() { return cNamePhraseParserRuleCall_1_0; }
		
		//EOL?
		public RuleCall getEOLTerminalRuleCall_2() { return cEOLTerminalRuleCall_2; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Statement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamePhraseParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Statement:
		//    name=Phrase EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Phrase EOL
		public Group getGroup() { return cGroup; }
		
		//name=Phrase
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Phrase
		public RuleCall getNamePhraseParserRuleCall_0_0() { return cNamePhraseParserRuleCall_0_0; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
	}
	public class PhraseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Phrase");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Phrase:
		//    ID+;
		@Override public ParserRule getRule() { return rule; }
		
		//ID+
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final StepSetElements pStepSet;
	private final BackgroundElements pBackground;
	private final StepElements pStep;
	private final StatementElements pStatement;
	private final PhraseElements pPhrase;
	private final TerminalRule tID;
	private final TerminalRule tWS;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tEOL;
	
	private final Grammar grammar;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pStepSet = new StepSetElements();
		this.pBackground = new BackgroundElements();
		this.pStep = new StepElements();
		this.pStatement = new StatementElements();
		this.pPhrase = new PhraseElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ID");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.WS");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.SL_COMMENT");
		this.tEOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EOL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
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
	

	
	//Model:
	//    'Feature:' name=Phrase EOL
	//    statements+=Statement*
	//    stepSets+=stepSet*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//stepSet:
	//    Background;
	public StepSetElements getStepSetAccess() {
		return pStepSet;
	}
	
	public ParserRule getStepSetRule() {
		return getStepSetAccess().getRule();
	}
	
	//Background:
	//    'Background:' name=Phrase EOL
	//    statements+=Statement*
	//    steps+=Step*;
	public BackgroundElements getBackgroundAccess() {
		return pBackground;
	}
	
	public ParserRule getBackgroundRule() {
		return getBackgroundAccess().getRule();
	}
	
	//Step:
	//    ('Given' | 'When' | 'Then' | 'And' | 'But' | '*') name=Phrase EOL?;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}
	
	//Statement:
	//    name=Phrase EOL;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Phrase:
	//    ID+;
	public PhraseElements getPhraseAccess() {
		return pPhrase;
	}
	
	public ParserRule getPhraseRule() {
		return getPhraseAccess().getRule();
	}
	
	//terminal ID:
	//    '^'? ('a'..'z' | 'A'..'Z' | '_' | '.') ('a'..'z' | 'A'..'Z' | '_' | '.' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal WS:
	//    (' ' | '\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//// single line comment
	//terminal SL_COMMENT:
	//    '#' !('\r' | '\n')* EOL;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal EOL:
	//    ('\r\n')+;
	public TerminalRule getEOLRule() {
		return tEOL;
	}
}
