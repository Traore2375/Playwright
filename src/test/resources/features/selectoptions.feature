Feature: Select options feature automation

  Background:
    Given I navigate to "https://demoqa.com/select-menu"

  @smoke @ui @select
  Scenario: Select different options from select menu

    When I select "Group 2, option 1" from the group select dropdown
    And I select "Mrs." from the select one dropdown
    And I select "Red" from the old style select menu
    And I select the following colors in the multi-select dropdown
    And I select "audi" from the standard multi-select

    Then all selected values should be displayed correctly