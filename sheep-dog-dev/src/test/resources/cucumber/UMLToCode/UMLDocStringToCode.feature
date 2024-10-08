@debug
Feature: UML Doc String To Code

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is created as follows
                    \"\"\"
                    text1
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Steps Doc String section will be created as follows
          | Name   | Step                                        | Content |
          | Submit | Given The Object page is created as follows | text1   |

  Scenario: Layer 2

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is created as follows
                    \"\"\"
                    text1
                    text2
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                                    | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageIsCreatedAsFollows | docString      | String         |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Fields section will be created as follows
          | Method Name                                    | Statement                                                            |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setComponent("blah");                  |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setPath("Object");                     |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setInputOutputs("Content", docString); |

  Scenario: Layer 3

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is created as follows
                    \"\"\"
                    text1
                    text2
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Interface Name | Package                 |
          | ObjectPage     | org.farhan.objects.blah |
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Import            |
          | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name | Visibility | Return Type |
          | setContent  | public     | void        |
      And The mbt-transformer plugin, ObjectPage.java file Fields section will be created as follows
          | Method Name | Parameter Name | Parameter Type         |
          | setContent  | keyMap         | HashMap<String,String> |

