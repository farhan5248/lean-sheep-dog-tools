package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.java.en.Given;

public class ClaimBlahDocStringPageStepsJavaFileSteps extends TestSteps {

    @Given("^The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows$")
    public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
        ClaimFactory.get("BlahDocStringsPageStepsFile").assertAttributes(docString);
    }
}
