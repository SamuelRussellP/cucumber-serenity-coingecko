@AccessingPriceDataFeature @Regression
Feature: Testing Accessing Price Data Feature

  @Positive
  Scenario: User wants to access price data for Cryptocurrencies
    Given User is on coingecko homepage
    Then User should be able to access price data for Cryptocurrencies

  @Positive
  Scenario: User wants to access price data for Categories
    Given User is on coingecko homepage
    When User clicks on the Categories tab buton
    Then User should be able to access price data for Categories

  @Positive
  Scenario: User wants to access price data for Exchanges
    Given User is on coingecko homepage
    When User clicks on the Exchanges tab buton
    Then User should be able to access price data for Exchanges