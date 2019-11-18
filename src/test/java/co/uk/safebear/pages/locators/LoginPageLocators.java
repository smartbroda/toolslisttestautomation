package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // fields
    private By usernameLocator = By.xpath(".//input[@id='username']");
    private By passwordLocator = By.xpath(".//input[@id='password']");

    // buttons
    private By loginButtonLocator = By.xpath(".//button[@id='enter']");


    // messages
    private By successfullLoginMessage = By.xpath(".//p[@id='rejectLogin']/b");

//    public By getUsernameLocator() {
//        return usernameLocator;
//    }
//
//    public By getPasswordLocator() {
//        return passwordLocator;
//    }
//
//    public By getLoginButtonLocator() {
//        return loginButtonLocator;
//    }
//
//    public By getSuccessfullLoginMessage() {
//        return successfullLoginMessage;
//    }


}
