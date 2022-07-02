@SearchCryptoFeature @Regression
Feature: Testing Cryptocurrency Search Feature

  @Positive
  Scenario: User wants to search for a valid cryptocurrency by typing in the search field.
    Given User is on coingecko homepage
    When User clicks on the search field
    And User types in "BTC" as valid cryptocurrency
    And User clicks on the suggested corresponding crypto
    Then User shall see the valid "BTC" cryptocurrency page

  @Negative
  Scenario: User wants for an invalid cryptocurrency by typing in the search field.
    Given User is on coingecko homepage
    When User clicks on the search field
    And User types in "RDM" as invalid cryptocurrency
    Then User shall see the "No Results Found" message

  @Negative
  Scenario: User wants for an invalid cryptocurrency by typing in the search field.
    Given User is on coingecko homepage
    When User clicks on the search field
    And User types in "12345" as invalid cryptocurrency
    Then User shall see the "No Results Found" message