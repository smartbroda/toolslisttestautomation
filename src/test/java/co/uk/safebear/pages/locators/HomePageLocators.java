package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class HomePageLocators {

    // search button
    By searchButtonLocator = By.xpath(".//*[@id='page']/div[1]/header/nav/div/div/form/a/i");
    // search field
    By searchFieldLocator = By.xpath("//*[@id='the7-micro-widget-search']");
    // search submit button
    By searchSubmitButton = By.xpath("//*[@id='page']/div[1]/header/nav/div/div/form/div/a/i");


    public By getSearchButtonLocator() {
        return searchButtonLocator;
    }


    public By getSearchFieldLocator() {
        return searchFieldLocator;
    }

    public By getSearchSubmitButton() {
        return searchSubmitButton;
   }
}
