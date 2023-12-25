package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.JavaSteps;
import org.farhan.objects.claimproject.BlahDataTablePageStepsFile;
import org.farhan.objects.claimproject.ClaimProjectFactory;

import io.cucumber.java.en.And;

public class BlahDataTablePageStepsFileSteps extends JavaSteps {

	@And("^The claim project, src/test/java/org/farhan/stepdefs/blah/blahDataTablePageSteps.java file will be as follows$")
	public void TheClaimProjectBlahDataTablePageStepsJavaFileIsAsFollows(String docString) {
		BlahDataTablePageStepsFile o = (BlahDataTablePageStepsFile) ClaimProjectFactory.get("BlahDataTablePageStepsFile");
		o.setBaseDir("claim");
		o.setPath("src/test/java/org/farhan/stepdefs/blah/blahDataTablePageSteps.java");
		o.assertContents(docString);
	}
}
