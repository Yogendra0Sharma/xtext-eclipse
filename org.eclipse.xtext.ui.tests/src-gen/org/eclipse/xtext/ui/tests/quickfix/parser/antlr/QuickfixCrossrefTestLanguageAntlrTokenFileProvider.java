/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.quickfix.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QuickfixCrossrefTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/quickfix/parser/antlr/internal/InternalQuickfixCrossrefTestLanguage.tokens");
	}
}
