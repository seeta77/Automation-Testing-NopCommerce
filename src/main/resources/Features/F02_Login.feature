@Smoke
Feature: guest user could Login with valid credentials

  Scenario: guest user could Login with valid credentials

    Given user click on login tab
    And navigates to login page

    When user enter "test4@gmail.com" and "P@ssw0rd"
    And user click on login button

    Then user could login successfully by going to home page and “My account” tab isDisplayed

