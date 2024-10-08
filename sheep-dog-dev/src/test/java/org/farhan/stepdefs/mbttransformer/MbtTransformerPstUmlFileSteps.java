package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPstUmlFileSteps {

    @Given("^The mbt-transformer plugin, target/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetUmlPstUmlFileWillBePresent() {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs("Present");
    }

    @Given("^The target/uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theTargetUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The target/uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theTargetUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The target/uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theTargetUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The target/uml/pst.uml file Class section will be created as follows$")
    public void theTargetUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/uml/pst.uml file Class Annotations section will be created as follows$")
    public void theTargetUmlPstUmlFileClassAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassAnnotationsSection");
    }

    @Given("^The target/uml/pst.uml file Class Comments section will be created as follows$")
    public void theTargetUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassCommentsSection");
    }
}
