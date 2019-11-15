package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class HomePageLocators {

    // search button
    By searchButtonLocator = By.xpath(".//*[@id='page']/div[1]/header/nav/div/div/form/a/i");
    // search field
//    By searchFieldLocator = By.xpath(".//div[@class='mini-search show-on-desktop near-logo-first-switch in-menu-second-switch popup-search custom-icon first last act']/form[@method='get']/div[@class='popup-search-wrap']/input[@class='field searchform-s']");
//    // search submit button
//    By searchSubmitButton = By.xpath(".//*[@id='page']/div[1]/header/nav/div/div/form/div/a/i");


    public By getSearchButtonLocator() {
        return searchButtonLocator;
    }


    public By getSearchFieldLocator() {
       return getSearchFieldLocator();
    }
//
//    public By getSearchSubmitButton() {
//        return searchSubmitButton;
//    }
}
