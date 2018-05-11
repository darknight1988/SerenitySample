Feature: Searching with multiple value on Google page.
  I want to use this template for my future project


  @tag2
  Scenario Outline: Searching multiple value
    Given I want to write a step with Danh
    When I check for the '<value>' in step
    Then I verify the status in step

    Examples: 
      | value      | 
      | TestingBDD | 
      | BDD vs KDD | 
