package co.uk.safebear;

import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver browser;

    @Before
    public void setUp() {
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getURL());
    }

        @After
        public void tearDown() {
        browser.quit();
        }



    @When("a user searches for {string}")
    public void a_user_searches_for(String courseSearchedFor) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("a course containing the word {string} is displayed")
    public void a_course_containing_the_word_is_displayed(String courseReturned) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}
