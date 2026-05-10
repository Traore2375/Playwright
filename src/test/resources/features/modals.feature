@modals
Feature: Modal Dialog Management

  Scenario: Verify Small and Large Modal dialogs

    Given the user navigates to "https://demoqa.com/modal-dialogs"

    When the user opens
    Then the dialog should be displayed
    And the modal text should match the expected text
    When the user closes the

    And the user opens the "Large Modal"
    Then the "Large Modal" dialog should be displayed
    And the user captures the modal content
    And the modal text should match the expected text
    When the user closes the "Large Modal"

    Then all modal dialog validations should pass