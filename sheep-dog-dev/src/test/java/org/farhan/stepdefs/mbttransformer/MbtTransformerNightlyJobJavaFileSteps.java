package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerNightlyJobJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acme/NightlyJob.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeNightlyJobJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("NightlyJobJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("NightlyJobJavaFile").setPath("src/test/java/org/farhan/objects/acme/NightlyJob.java");
        MbtTransformerFactory.get("NightlyJobJavaFile").assertInputOutputs("Content", docString);
    }
}
