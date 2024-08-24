/*
 * generated by Xtext 2.32.0
 */
package org.farhan.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.farhan.parser.antlr.internal.InternalCucumberParser;
import org.farhan.services.CucumberGrammarAccess;

public class CucumberParser extends AbstractAntlrParser {

	@Inject
	private CucumberGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCucumberParser createParser(XtextTokenStream stream) {
		return new InternalCucumberParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Feature";
	}

	public CucumberGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
