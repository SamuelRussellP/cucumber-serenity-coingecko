@HeaderNavigationFeature@Regression
Feature: Testing Coingecko Header Navigation Feature

  @Positive
  Scenario: User wants to language settings
    Given User is on coingecko homepage
    When User changes language to "Bahasa Indonesia"
    And User clicks on "Bahasa Indonesia" in the language suggestions section
    Then User should see the language changed to "ID"

  @Positive
  Scenario: User wants to change currency
    Given User is on coingecko homepage
    When User changes currency to "EUR"
    And User clicks on "EUR" in the currency suggestions section
    Then User should see the currency changed to "EUR"