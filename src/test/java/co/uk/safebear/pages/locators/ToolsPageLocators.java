package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {


    // buttons
//    private By logOutButton = By.xpath(".//a[text()='Logout']");

    // messages
    private By successfulLoginMessage = By.xpath(".//body/div[@class='container']/p/b");



}
