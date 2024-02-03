package org.farhan.objects.mbtTransformer;

import org.farhan.common.objects.MbtTransformerGoal;
import org.farhan.mbt.asciidoctorgraph.ConvertAsciiDoctorToGraphMojo;
import org.farhan.mbt.core.Utilities;
import org.junit.jupiter.api.Assertions;

public class MbtTransformerAsciidoctorToGraphGoal extends MbtTransformerGoal {

	public void transition() {
        try {
        	ConvertAsciiDoctorToGraphMojo mojo = new ConvertAsciiDoctorToGraphMojo();
            mojo.mojoGoal();
        } catch (Exception e) {
            Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
        }
	}
}
