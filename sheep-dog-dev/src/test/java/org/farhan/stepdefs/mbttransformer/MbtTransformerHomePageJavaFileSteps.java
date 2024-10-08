package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerHomePageJavaFileSteps {

    @Given("^The mbt-transformer plugin, src/test/java/org/farhan/objects/acme/HomePage.java file will be created as follows$")
    public void theMbtTransformerPluginSrcTestJavaOrgFarhanObjectsAcmeHomePageJavaFileWillBeCreatedAsFollows(String docString) {
        MbtTransformerFactory.get("HomePageJavaFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("HomePageJavaFile").setPath("src/test/java/org/farhan/objects/acme/HomePage.java");
        MbtTransformerFactory.get("HomePageJavaFile").assertInputOutputs("Content", docString);
    }
}
