package org.shirokuma.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.shirokuma.pages.CoingeckoHomePage;
import org.springframework.beans.factory.annotation.Autowired;

public class SearchCryptoFeatureSteps {

    @Autowired
    CoingeckoHomePage coingeckoHomePage;

    @When("User clicks on the search field")
    public void userClicksOnTheSearchField() {
        coingeckoHomePage.clickSearchBtn();
    }

    @And("User types in {string} as valid cryptocurrency")
    public void userTypesInAsValidCryptocurrency(String arg0) {
        coingeckoHomePage.typeSearchField(arg0);
    }

    @And("User clicks on the suggested corresponding crypto")
    public void userClicksOnTheSuggestedCorrespondingCrypto() {
        coingeckoHomePage.clickBtcSuggestion();
    }

    @Then("User shall see the valid {string} cryptocurrency page")
    public void userShallSeeTheValidCryptocurrencyPage(String arg0) {
        Assert.assertTrue(coingeckoHomePage.getCoinHeader().contains(arg0));
    }

    @And("User types in {string} as invalid cryptocurrency")
    public void userTypesInAsInvalidCryptocurrency(String arg0) {
        coingeckoHomePage.typeSearchField(arg0);
    }

    @Then("User shall see the {string} message")
    public void userShallSeeTheMessage(String arg0) {
        Assert.assertEquals(arg0, coingeckoHomePage.getErrorMessage());
    }
}
