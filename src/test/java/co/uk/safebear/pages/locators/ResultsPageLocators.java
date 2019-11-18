package co.uk.safebear.pages.locators;

import org.openqa.selenium.By;

public class ResultsPageLocators {

    // locator for first result

    By searchResult = By.xpath("//*[@id='page']/div[4]/div/div[1]");

    public By getSearchResult() {
        return searchResult;
    }
}
