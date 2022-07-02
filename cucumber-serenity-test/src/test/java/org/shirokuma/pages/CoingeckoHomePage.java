package org.shirokuma.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.coingecko.com/")
public class CoingeckoHomePage extends PageObject {

    @FindBy(xpath = "//span[@class='tw-cursor-pointer text-black']")
    private WebElementFacade languageBtn;

    @FindBy(xpath = "//span[@class='text-black tw-cursor-pointer']")
    private WebElementFacade currencyBtn;

    @FindBy(xpath ="//a[9][@class=\"dropdown-item py-2\"][text()='Bahasa Indonesia']")
    private WebElementFacade indonesianSuggestionBtn;

    @FindBy(xpath ="//*[@id=\"currency-selector\"]/div/div/div[2]/input")
    private WebElementFacade currencyInputField;

    @FindBy(xpath ="//*[@id=\"currency-selector\"]/div/div/ul[3]/li[4]/div/div/span[1]")
    private WebElementFacade euroCurrencySuggestionBtn;

    @FindBy(xpath ="//tr[1]//td[5]")
    private WebElementFacade firstCryptoCurrencyPriceData;

    @FindBy(xpath="//td")
    private WebElementFacade firstCategoriesPriceData;

    @FindBy(xpath="//td")
    private WebElementFacade firstCryptoExchangesPriceData;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[1]/div[3]/ul/li[1]/div/a/span")
    private WebElementFacade cryptocurrencyTabBtn;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[1]/div[3]/ul/li[1]/div/div/div[2]/a[1]")
    private WebElementFacade categoriesBtn;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[1]/div[3]/ul/li[2]/div")
    private WebElementFacade exchangesTabBtn;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[1]/div[3]/ul/li[2]/div/div/a[1]")
    private WebElementFacade cryptoExchangesBtn;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[5]/div/div/div/div[1]/div")
    private WebElementFacade searchBtn;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[2]/div[5]/div/div/div/div[2]/div[1]/div[2]/input")
    private WebElementFacade searchField;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[2]/div[5]/div/div/div/div[2]/div[3]/div/ul[1]/li[1]/a/div/span[2]")
    private WebElementFacade btcSuggestion;

    @FindBy(xpath="/html/body/div[5]/div[4]/div[1]/div/div[1]/div[2]/div")
    private WebElementFacade coinHeader;

    @FindBy(xpath="//div[@class=\"p-2 text-sm\"]")
    private WebElementFacade errorMessage;

    @FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[2]/div[2]/div/a")
    private WebElementFacade portfolioBtn;

    @FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/div/button[1]")
    private WebElementFacade signUpBtn;

    @FindBy(xpath="/html/body/div[4]/div[3]/div/div[2]/div/button[2]")
    private WebElementFacade logInBtn;

    public void clickLanguageBtn() {
        languageBtn.click();
    }

    public void clickCurrencyBtn() {
        currencyBtn.click();
    }

    public void clickIndonesianSuggestionBtn() {
        indonesianSuggestionBtn.click();
    }

    public void clickCurrencyInputField() {
        currencyInputField.click();
    }

    public void typeCurrencyInputField(String keyword) {
        currencyInputField.type(keyword);
    }

    public void clickEuroCurrencySuggestionBtn() {
        euroCurrencySuggestionBtn.click();
    }

    public String getCurrencyHeader() {
        return currencyBtn.waitUntilVisible().getText().trim().toUpperCase();
    }

    public String getLanguageHeader() {
        return languageBtn.waitUntilVisible().waitUntilClickable().getText().trim().toUpperCase();
    }

    public boolean isCryptocurrencyPriceDataVisible(){
       return firstCryptoCurrencyPriceData.waitUntilVisible().isVisible();
    }

    public void clickCryptocurrencyTabBtn() {
        cryptocurrencyTabBtn.click();
    }

    public void clickCategoriesBtn() {
        categoriesBtn.click();
    }

    public boolean isCategoriesPriceDataVisible(){
        return firstCategoriesPriceData.waitUntilVisible().isVisible();
    }

    public void clickExchangesTabBtn() {
        exchangesTabBtn.click();
    }

    public void clickCryptoExchangesBtn() {
        cryptoExchangesBtn.click();
    }

    public boolean isCryptoExchangesPriceDataVisible(){
        return firstCryptoExchangesPriceData.waitUntilVisible().isVisible();
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void typeSearchField(String keyword) {
        searchField.type(keyword);
    }

    public void clickBtcSuggestion() {
        btcSuggestion.click();
    }

    public String getCoinHeader() {
        return coinHeader.waitUntilVisible().getText();
    }

    public String getErrorMessage() {
        return errorMessage.waitUntilVisible().getText();
    }

    public void clickPortfolioBtn() {
        portfolioBtn.click();
    }

    public boolean isSignUpBtnVisible(){
        return signUpBtn.waitUntilVisible().isVisible();
    }

    public boolean isLogInBtnVisible(){
        return logInBtn.waitUntilVisible().isVisible();
    }
}
