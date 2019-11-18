package co.uk.safebear.pages;


import co.uk.safebear.pages.locators.HomePageLocators;
import co.uk.safebear.utils.Waits;
import org.openqa.selenium.WebDriver;


public class HomePage {


    HomePageLocators homeLocators = new HomePageLocators();

    WebDriver browser;

    public HomePage(WebDriver browser) {
    }


    public void clickSearchButton () {
        Waits.waitForElement(homeLocators.getSearchButtonLocator(),browser).click();
    }

    public void enterSearch (String searchName) {
        Waits.waitForElement(homeLocators.getSearchFieldLocator(),browser).sendKeys(searchName);
    }

    public void clickSearchSubmitButton () {
        Waits.waitForElement(homeLocators.getSearchSubmitButton(),browser).click();
    }


}
