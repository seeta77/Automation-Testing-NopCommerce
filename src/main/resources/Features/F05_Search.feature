@Smoke
Feature: users shall be able to search for products with different parameters

  Scenario: user could search using product name

    Given user in home page
    And click on search field link

    When user redirected to search page
    And user type the search keyword "Apple" and click on search button

    Then results size is more than zero

  Scenario: user could search using sku

    Given user in home page
    And click on search field link

    When user redirected to search page
    And user type the search keyword "AP_MBP_13" and click on search button

    Then results size is more than zero
