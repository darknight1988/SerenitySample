@version:Release1
Feature: Making a sample of Serenity with Cucumber
  I want to use this template for my first demo

  @tag1
  Scenario: Open and search something in Google page
    Given I open the Chrome browser and navigation to Google page
    When I fill the keyword in Search dialog
    Then I check the output
    
    
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
