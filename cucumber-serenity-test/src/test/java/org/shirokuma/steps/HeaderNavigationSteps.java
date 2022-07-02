package org.shirokuma.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.shirokuma.pages.CoingeckoHomePage;

public class HeaderNavigationSteps {

    CoingeckoHomePage coinGeckoHomePage = new CoingeckoHomePage();

    @Given("User is on coingecko homepage")
    public void userIsOnCoingeckoHomepage() {
        coinGeckoHomePage.open();
    }

    @When("User changes language to {string}")
    public void userChangesLanguageTo(String arg0) {
        coinGeckoHomePage.clickLanguageBtn();
    }

    @And("User clicks on {string} in the language suggestions section")
    public void userClicksOnInTheLanguageSuggestionsSection(String arg0) {
        coinGeckoHomePage.clickIndonesianSuggestionBtn();
    }

    @And("User clicks on {string} in the currency suggestions section")
    public void userClicksOnInTheCurrencySuggestionsSection(String arg0) {
        coinGeckoHomePage.clickEuroCurrencySuggestionBtn();
    }

    @Then("User should see the language changed to {string}")
    public void userShouldSeeTheLanguageChangedTo(String arg0) {
        Assert.assertEquals(arg0, coinGeckoHomePage.getLanguageHeader());
    }

    @When("User changes currency to {string}")
    public void userChangesCurrencyTo(String arg0) {
        coinGeckoHomePage.clickCurrencyBtn();
    }

    @Then("User should see the currency changed to {string}")
    public void userShouldSeeTheCurrencyChangedTo(String arg0) {
        Assert.assertEquals(arg0, coinGeckoHomePage.getCurrencyHeader());
    }
}
