package org.shirokuma.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.shirokuma.pages.CoingeckoHomePage;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PortfolioSteps {

    @Autowired
    CoingeckoHomePage coingeckoHomePage;

    @When("User clicks on the Portfolio tab")
    public void userClicksOnThePortfolioTab() {
        coingeckoHomePage.clickPortfolioBtn();
    }

    @Then("User should be able to see the Signup and Login Button")
    public void userShouldBeAbleToSeeTheSignupAndLoginButton() {
        assertThat("Sign Up Button is not visible", coingeckoHomePage.isSignUpBtnVisible(),equalTo(true));
        assertThat("Login Button is not visible", coingeckoHomePage.isLogInBtnVisible(),equalTo(true));
    }
}
