@checkbox
Feature: Checkbox automation

  Scenario: Select checkbox options
    Given I navigate to "https://demoqa.com/checkbox" and open the checkbox section
    When I click on the expand button and I select the "Desktop" checkbox and I choose "Notes" and I choose "Commands"
    Then I should see the message "notes"