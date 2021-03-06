package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import co.uk.safebear.utils.Waits;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolsPage {

    ToolsPageLocators toolsPageLocators = new ToolsPageLocators();
    // ensures driver is passed through to it and isn't left empty

    @NonNull
    WebDriver browser;




    public String getPageTitle() {

        return browser.getTitle();
    }

//    public void clickLogoutButton() {
//        Waits.waitForElement(toolsPageLocators.getLogOutButton(),browser).click();
//    }


    public String checkSuccessfulLoginMessage () {
        return Waits.waitForElement(toolsPageLocators.getSuccessfulLoginMessage(),browser).getText();

    }


}
