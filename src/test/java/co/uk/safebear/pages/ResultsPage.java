package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ResultsPageLocators;
import org.openqa.selenium.WebDriver;

public class ResultsPage {


    ResultsPageLocators resultsLocators = new ResultsPageLocators();


WebDriver browser;

    public ResultsPage(WebDriver browser) {
    }


    public String checkSearchResultTitle () {
        return browser.findElement(resultsLocators.getSearchResult()).getText();

    }

}
