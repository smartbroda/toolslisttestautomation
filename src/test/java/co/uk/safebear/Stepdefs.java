package co.uk.safebear;


import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;


public class Stepdefs {

    LoginPage loginPage;
    ToolsPage toolsPage;
    WebDriver browser;

    @Before
    public void setUp() {
        // Get the driver for the browser (e.g. ChromeDriver)
        browser = Driver.getDriver();
        loginPage = new LoginPage(browser);
        toolsPage = new ToolsPage(browser);
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

    @Given("I am logged out")
    public void i_am_logged_out() {
        assertEquals("We're not on the Login Page", "Login Page",loginPage.getPageTitle());
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("the user is informed that the login in successful")
    public void the_user_is_informed_that_the_login_in_successful() {
        assertThat("Login failed or the Login Successful message didn't appear", toolsPage.checkForFailedLoginWarning(), containsString("Login Successful"));
    }

}
