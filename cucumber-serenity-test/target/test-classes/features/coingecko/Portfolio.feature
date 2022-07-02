@PortfolioFeature @Regression
Feature: Testing Portfolio Feature

  @Positive
  Scenario: User wants to create a new portfolio
    Given User is on coingecko homepage
    When User clicks on the Portfolio tab
    Then User should be able to see the Signup and Login Button
