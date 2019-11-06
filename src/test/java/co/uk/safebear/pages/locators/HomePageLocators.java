package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class HomePageLocators {

    // search button
    By searchButtonLocator = By.xpath(".//a[@class='submit text-disable act']");
    // search field
    By searchFieldLocator = By.xpath(".//input[@id='the7-micro-widget-search']");
    // search submit button
    By searchSubmitButoon = By.xpath(".//div[@class='popup-search-wrap right-overflow']/a[@class='search-icon' and @href='#go']");


}
