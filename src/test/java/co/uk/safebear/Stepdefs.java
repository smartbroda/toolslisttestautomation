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

    @Then("a course containing the word {string} is displayed")
    public void a_course_containing_the_word_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
