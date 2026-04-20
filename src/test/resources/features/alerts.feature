@alerts
Feature: Handle the alert

  Background:
    Given go to page alert "https://demoqa.com/alerts"

  Scenario: Click alert and verify the message
    When  click the first button
    Then  the message display

  Scenario: Click second alert and the message display after 5 second
    When  click the second button
    Then  the message display after 5 second And   click button OK


  Scenario: Click thirst button and we see do you confirm

    When  click the thirst button
    Then  the popup display


  Scenario: Click fourth button and enter your name
    When  click the fourth button
    Then  the popup displayed