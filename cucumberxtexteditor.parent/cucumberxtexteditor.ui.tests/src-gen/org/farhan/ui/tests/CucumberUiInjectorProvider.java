/*
 * generated by Xtext 2.32.0
 */
package org.farhan.ui.tests;

import com.google.inject.Injector;
import cucumberxtexteditor.ui.internal.CucumberxtexteditorActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CucumberUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CucumberxtexteditorActivator.getInstance().getInjector("org.farhan.Cucumber");
	}

}
