package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginServiceTestingFeatureFileSteps {

    @Given("^The mbt-maven-plugin plugin, src/test/resources/cucumber/Service Testing.feature file is as follows$")
    public void theMbtMavenPluginPluginSrcTestResourcesCucumberServiceTestingFeatureFileIsAsFollows(String docString) {
        MbtMavenPluginFactory.get("ServiceTestingFeatureFile").setInputOutputs("Content", docString);
    }
}
