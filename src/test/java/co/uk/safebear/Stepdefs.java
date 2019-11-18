package co.uk.safebear;

import co.uk.safebear.pages.HomePage;
import co.uk.safebear.pages.ResultsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Stepdefs {
    HomePage homePage;
    ResultsPage resultsPage;
    WebDriver browser;

    @Before
    public void setUp() {
        // Get the driver for the browser (e.g. ChromeDriver)
        browser = Driver.getDriver();
        homePage = new HomePage(browser);
        resultsPage = new ResultsPage(browser);
        //navigate to the URL of our webpage
        browser.navigate().to(Driver.getURL());
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.quit();
    }




    @When("a user searches for {string}")
    public void a_user_searches_for(String searchName) {
        homePage.clickSearchButton();
        homePage.enterSearch(searchName);
        homePage.clickSearchSubmitButton();
    }

    @Then("a course containing the words \\(Search Results for: cucumber) is displayed")
    public void a_course_containing_the_words_Search_Results_for_cucumber_is_displayed() {
        assertThat("Search failed or Search Result didn't appear",
                resultsPage.checkSearchResultTitle(), containsString("Search Results for: cucumber"));
    }



}
