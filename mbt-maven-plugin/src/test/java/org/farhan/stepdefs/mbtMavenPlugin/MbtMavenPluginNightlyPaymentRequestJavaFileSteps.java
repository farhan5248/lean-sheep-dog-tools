package org.farhan.stepdefs.mbtMavenPlugin;

import org.farhan.common.MbtMavenPluginFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtMavenPluginNightlyPaymentRequestJavaFileSteps {

    @Given("^The src/test/java/org/farhan/objects/pharmacy/NightlyPaymentRequest.java file will be as follows$")
    public void theSrcTestJavaOrgFarhanObjectsPharmacyNightlyPaymentRequestJavaFileWillBeAsFollows(String docString) {
        MbtMavenPluginFactory.get("NightlyPaymentRequestJavaFile").assertInputOutputs("Content", docString);
    }
}
