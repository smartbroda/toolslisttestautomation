package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

LoginPageLocators locators = new LoginPageLocators();

// ensures driver is passed through to it and isn't left empty
@NonNull
WebDriver browser;

public String getPageTitle() {

    return browser.getTitle();
}


public void enterUsername (String username) {
    browser.findElement(locators.getUsernameLocator()).sendKeys(username);
}


    public void enterPassword (String password) {
        browser.findElement(locators.getPasswordLocator()).sendKeys(password);
    }


    public void clickLoginButton() {
    browser.findElement(locators.getLoginButtonLocator()).click();
    }


    public String checkForFailedLoginWarning () {
    return browser.findElement(locators.getSuccessfullLoginMessage()).getText();
    }





}
