package org.shirokuma.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.coingecko.com/")
public class CoingeckoHomePage extends PageObject {

    @FindBy(xpath = "//span[@class='tw-cursor-pointer text-black']")
    private WebElementFacade languageBtn;

    @FindBy(xpath = "//*[@id=\"currency-selector\"]")
    private WebElementFacade currencyBtn;

    @FindBy(xpath ="//a[9][@class=\"dropdown-item py-2\"][text()='Bahasa Indonesia']")
    private WebElementFacade indonesianSuggestionBtn;

    @FindBy(xpath ="//*[@id=\"currency-selector\"]//input[@placeholder=\"Search...\"]")
    private WebElementFacade currencyInputField;

    @FindBy(xpath ="//*[@id=\"currency-selector\"]//span[@class=\"d-md-inline currency-name\"][text()=\"Euro\"]")
    private WebElementFacade euroCurrencySuggestionBtn;

    @FindBy(xpath ="//span[@class=\"no-wrap\"][@data-coin-id=\"1\"]")
    private WebElementFacade firstCryptoCurrencyPriceData;

    @FindBy(xpath="//td[@class=\"coin-name\"]//*[contains(text(),'Ethereum Ecosystem')]")
    private WebElementFacade firstCategoriesPriceData;

    @FindBy(xpath="//tr[1]//div[@class=\"trade-vol-amount text-right\"]")
    private WebElementFacade firstCryptoExchangesPriceData;

    @FindBy(xpath="//span[@class=\"tw-text-sm\"][text()=\"Cryptocurrencies\"]")
    private WebElementFacade cryptocurrencyTabBtn;

    @FindBy(xpath="//div[@class=\"border-bottom tw-pt-2 tw-pb-2\"]//a[1]")
    private WebElementFacade categoriesBtn;

    @FindBy(xpath="//span[@class=\"tw-text-sm\"][text()=\"Exchanges\"]")
    private WebElementFacade exchangesTabBtn;

    @FindBy(xpath="//a[@class=\"dropdown-item tw-py-2\"][text()=\"Crypto Exchanges\"]")
    private WebElementFacade cryptoExchangesBtn;

    @FindBy(xpath ="//div[@class=\"tw-truncate\"]")
    private WebElementFacade searchBtn;

    @FindBy(xpath="//input[@placeholder=\"Search token name or exchange\"]")
    private WebElementFacade searchField;

    @FindBy(xpath="//div//*[contains(text(),'Bitcoin (BTC)')]")
    private WebElementFacade btcSuggestion;

    @FindBy(xpath="//div[@class=\"mr-md-3 tw-pl-2 md:tw-mb-0 tw-text-xl tw-font-bold tw-mb-0\"]")
    private WebElementFacade coinHeader;

    @FindBy(xpath="//div[@class=\"p-2 text-sm\"]")
    private WebElementFacade errorMessage;

    @FindBy(xpath="//a[@class=\"text-black tw-mr-4 tw-text-sm\"][contains(text(),'Portfolio')]")
    private WebElementFacade portfolioBtn;

    @FindBy(xpath="//button[@name=\"button\"][text()=\"Sign Up\"]")
    private WebElementFacade signUpBtn;

    @FindBy(xpath="//button[@name=\"button\"][text()=\"Login\"]")
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
