package com.eviltester.webdriver.browsers;

import com.eviltester.webdriver.basicsOfPageObjects.BasicWebPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ConfigurableFirefoxTest {

    /**
     The following code is for the Firefox Driver.
    */

    static WebDriver driver;

    @BeforeAll
    public static void initiateWebDriver(){
        FirefoxOptions options = new FirefoxOptions();
        if(System.getenv().
                getOrDefault("BROWSER_STATE","show").
                equals("Headless")){
            options.addArguments("--headless");
        }

        driver = new FirefoxDriver(options);
    }

    @Test
    public void startWebDriver(){

        BasicWebPage page = new BasicWebPage(driver);
        page.get();

        Assertions.assertEquals(
                "Click Me",
                page.getButton().getText()
        );

    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }

}
