@Smoke
Feature: user could add products to shopping cart

  Scenario: success message is visible after adding product to shopping cart
    When user add product to shopping cart
    Then shopping cart notification success is visible

  Scenario: number of shopping cart items in home page is increased
    When user add product to shopping cart
    Then shopping cart notification success is visible
    And user get the number of the shopping cart items after adding product
    Then number of shopping cart items increased
    And user go to shopping cart page