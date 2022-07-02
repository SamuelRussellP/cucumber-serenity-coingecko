package org.shirokuma.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.shirokuma.pages.CoingeckoHomePage;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class AccessingPriceDataSteps{

    @Autowired
    CoingeckoHomePage coingeckoHomePage;
    
    @Then("User should be able to access price data for Cryptocurrencies")
    public void userShouldBeAbleToAccessPriceDataForCryptocurrencies() {
        assertThat("Crypto price data is not visible", coingeckoHomePage.isCryptocurrencyPriceDataVisible(),equalTo(true));
    }

    @When("User clicks on the Categories tab buton")
    public void userClicksOnTheCategoriesTabButon() {
        coingeckoHomePage.clickCryptocurrencyTabBtn();
        coingeckoHomePage.clickCategoriesBtn();

    }

    @Then("User should be able to access price data for Categories")
    public void userShouldBeAbleToAccessPriceDataForCategories() {
        assertThat("Category price data is not visible", coingeckoHomePage.isCategoriesPriceDataVisible(),equalTo(true));
    }

    @When("User clicks on the Exchanges tab buton")
    public void userClicksOnTheExchangesTabButon() {
        coingeckoHomePage.clickExchangesTabBtn();
        coingeckoHomePage.clickCryptoExchangesBtn();
    }

    @Then("User should be able to access price data for Exchanges")
    public void userShouldBeAbleToAccessPriceDataForExchanges() {
        assertThat("Exchange price data is not visible", coingeckoHomePage.isCryptoExchangesPriceDataVisible(),equalTo(true));
    }
}
