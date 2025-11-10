package com.eviltester.webdriver.browsers;

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

        driver.navigate().to("https://testpages.eviltester.com/pages/basics/basic-web-page/");

        Assertions.assertEquals(
            driver.findElement(By.tagName("h1")).getText(),
        "Basic Web Page"
        );

    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }

}
