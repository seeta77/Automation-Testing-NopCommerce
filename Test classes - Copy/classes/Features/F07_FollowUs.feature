@Smoke
Feature: users could open followUs links

  Scenario: user opens facebook link
    When user opens facebook link
    Then nopCommerce facebook url shall be opened in new tab


  Scenario: user opens twitter link
    When user opens twitter link
    Then nopCommerce twitter url shall be opened in new tab


  Scenario: user opens rss link
    When user opens rss link
    Then nopCommerce rss url shall be opened in new tab


  Scenario: user opens youtube link
    When user opens youtube link
    Then nopCommerce youtube url shall be opened in new tab
