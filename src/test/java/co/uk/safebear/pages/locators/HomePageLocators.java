package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class HomePageLocators {

    // search button
    By searchButtonLocator = By.xpath(".//*[@id='page']/div[1]/header/nav/div/div/form/a/i");
    // search field
    By searchFieldLocator = By.xpath(".//div[@class='popup-search-wrap right-overflow']/input[@id='the7-micro-widget-search']");
    // search submit button
    By searchSubmitButton = By.xpath(".//div[@class='popup-search-wrap right-overflow']/a/i[@class='the7-mw-icon-search-bold']");


    public By getSearchButtonLocator() {
        return searchButtonLocator;
    }


    public By getSearchFieldLocator() {
       return getSearchFieldLocator();
    }

    public By getSearchSubmitButton() {
        return searchSubmitButton;
   }
}
