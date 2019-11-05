package co.uk.safebear;


import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Stepdefs {
    WebDriver browser;

    @Before
    public void setUp() {
        // Get the driver for the browser (e.g. ChromeDriver)
        browser = Driver.getDriver();
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

}
