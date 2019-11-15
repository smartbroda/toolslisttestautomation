package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class ResultsPageLocators {

    // locator for first result

    By searchResult = By.xpath(".//a[@title='Cucumber Tutorial']");

    public By getSearchResult() {
        return searchResult;
    }
}
