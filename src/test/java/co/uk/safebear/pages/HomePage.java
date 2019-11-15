package co.uk.safebear.pages;


import co.uk.safebear.pages.locators.HomePageLocators;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.openqa.selenium.WebDriver;

@AllArgsConstructor
public class HomePage {


    HomePageLocators homeLocators = new HomePageLocators();

    WebDriver browser;

    public HomePage(WebDriver browser) {
    }


    public void clickSearchButton () {
        browser.findElement(homeLocators.getSearchButtonLocator()).click();
    }

    public void enterSearch (String searchName) {
        browser.findElement(homeLocators.getSearchFieldLocator()).sendKeys(searchName);
    }

    //public void clickSearchSubmitButton () {
     //   browser.findElement(homeLocators.getSearchSubmitButton()).click();
   // }


}
