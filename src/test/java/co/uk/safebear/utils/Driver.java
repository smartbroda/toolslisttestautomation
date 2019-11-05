package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    // setting default url to http://toolslist.safebear.co.uk:8080
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");

    // setting browser to chrome
    private static final String BROWSER = System.getProperty ("browser", "chrome");

    public static String getURL () {
        return URL;
    }

    public static WebDriver getDriver () {

        // sets up chrome option to allow to maximize screen etc..
        ChromeOptions chromeOptions;

        // create switch statement to check which browser to use and converts to brower name to uppercase
            switch (BROWSER.toUpperCase()) {

                case "CHROME" :
                    System.out.println("Executing on CHROME");

                    // tells webdrivermanager to set up chromedriver
                    WebDriverManager.chromedriver().setup();

                    // return the ChromeDriver
                    return new ChromeDriver();

                case "FIREFOX" :
                    System.out.println("Executing on FIREFOX");

                    // tells webdrivermanager to set up chromedriver
                    WebDriverManager.firefoxdriver().setup();

                    // return the FirefoxDriver
                    return new FirefoxDriver();

                case ("CHROME_HEADLESS") :
                    System.out.println("Executing on CHROME HEADLESS");
                    chromeOptions = new ChromeOptions();

                    //Set Chrome to run headlessly
                    chromeOptions.addArguments("headless");

                    // Make sure the window size is large and maximised
                    // so nothing disappears off screen
                    //(even in headless mode!)

                    chromeOptions.addArguments("window-size=1920,1080");
                    chromeOptions.addArguments("start-maximized");

                    // Set up our ChromeDriver
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver(chromeOptions);

                    // throws a message if it does not recognise browser
                    default:
                        throw new IllegalArgumentException("The Browser Type is Undefined");



        }









    }


}
