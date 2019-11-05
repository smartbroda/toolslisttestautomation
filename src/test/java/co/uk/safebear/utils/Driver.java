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

                    // throws a message if it does not recognise browser
                    default:
                        throw new IllegalArgumentException("The Browser Type is Undefined");


        }

    }


}
