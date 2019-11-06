package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // fields
    private By usernameLocator = By.xpath(".//input[@id='username']");
    private By passwordLocator = By.xpath(".//input[@id='password']");

    // buttons
    private By loginButtonLocator = By.xpath(".//input[@id='enter']");

    // messages
    private By LoginPageLocators = By.xpath(".//p[@id='rejectLogin']/b");

}
