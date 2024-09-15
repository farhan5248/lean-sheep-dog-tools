/*
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.farhan.mbt.generator.CucumberOutputConfigurationProvider;

import com.google.inject.Binder;
import com.google.inject.Singleton;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class CucumberRuntimeModule extends AbstractCucumberRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IOutputConfigurationProvider.class).to(CucumberOutputConfigurationProvider.class)
				.in(Singleton.class);
	}
}
