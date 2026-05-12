Feature: Search and place order for product
  Scenario Outline: scerch Experience for product search in both home and offer page
    Given User is on GreenCart Landing Page
    When User search with shortname <Name> and extracted actual name of product
    Then User search for <Name> in offer page to check if product exist with same name.
    And validate productname in offer page matches with landing page
    And Quit browser

    Examples:
    | Name |
    | Tom  |
    | Stra  |
    | pot |