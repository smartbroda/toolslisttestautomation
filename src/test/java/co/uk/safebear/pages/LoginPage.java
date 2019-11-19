package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import co.uk.safebear.utils.Waits;
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
        Waits.waitForElement(locators.getPasswordLocator(),browser).sendKeys(password);
    }


    public void clickLoginButton() {

        Waits.waitForElement(locators.getLoginButtonLocator(),browser).click();
    }



    public String checkForFailedLoginWarning () {
    return Waits.waitForElement(locators.getUnSuccessfullLoginMessage(),browser).getText();
    }





}
