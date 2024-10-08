@debug
Feature: Validate Error

  Scenario: No steps have a component

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                    |
          | The Input file is present    |
          | The Input file is downloaded |
     When The scenario validation action is performed as follows
          | Selected Step |
          | 1             |
     Then The scenario validation dialog will be set as follows
          | Message                              |
          | The first step must have a component |

  Scenario: First step doesn't have a component

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                    |
          | The Input file is present                    |
          | The daily batchjob, Input file is downloaded |
     When The scenario validation action is performed as follows
          | Selected Step |
          | 1             |
     Then The scenario validation dialog will be set as follows
          | Message                              |
          | The first step must have a component |

  Scenario: First step does have a component

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file is downloaded              |
     When The scenario validation action is performed as follows
          | Selected Step |
          | 1             |
     Then The scenario validation dialog will be empty

