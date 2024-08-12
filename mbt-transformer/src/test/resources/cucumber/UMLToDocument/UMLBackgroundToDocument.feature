@debug
Feature: UML Background To Document

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
#      And The mbt-transformer plugin, Process.adoc file, Background  section will be as follows
#          |  Name | Description |
#          | Setup | Desc line 1 |
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is valid |

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is valid |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid

            Scenario: Submit 3
               Given The Object3 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |
          | Submit 3 | Given The Object3 page is valid |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object1 page is valid |
          | Setup | Given The Object2 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                           Step |
          | Submit | Given The Object page is valid |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
              Given The Object3 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object1 page is valid |
          | Setup | Given The Object2 page is valid |
          | Setup | Given The Object3 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                           Step |
          | Submit | Given The Object page is valid |

