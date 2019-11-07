package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver browser;
    LoginPage loginPage;
    ToolsPage toolsPages;

    @Before
    public void setUp() {
        browser = Driver.getDriver();
        browser.navigate().to(Driver.getURL());

        loginPage = new LoginPage(browser);
        toolsPages = new ToolsPage(browser);
    }

    @After
    public  void tearDown() {

        browser.quit();
    }

    @Test
    public void successfulLoginTest() {
        Assert.assertEquals("Login Page", loginPage.getPageTitle());

        loginPage.enterUsername("tester");
        loginPage.enterPassword("letmein");
        loginPage.clickLoginButton();

        Assert.assertEquals("Login Successful", toolsPages.checkForLoginSuccessful());
    }

    @Test
    public void unSuccessfulLoginTest() {
        Assert.assertEquals("Login Page", loginPage.getPageTitle());

        loginPage.enterUsername("Tester10");
        loginPage.enterPassword("letmin22");
        loginPage.clickLoginButton();

        Assert.assertEquals("WARNING: Username or Password is incorrect", loginPage.checkForFailedLoginWarning());
    }




}
