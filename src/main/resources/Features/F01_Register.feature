@Smoke
Feature: guest user could register with valid data successfully
  Scenario: user register with valid data
    Given user click on register tab
    And navigates to registration page
    When user use valid data in registration
    And click on register button
    Then user redirected to confirmation page
    And user registered successfully

