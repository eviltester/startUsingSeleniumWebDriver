package com.eviltester.webdriver.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirstFirefoxTest {

    /**
     The following code is for the Firefox Driver.
    */

    @Test
    public void startWebDriver(){

        FirefoxOptions options = new FirefoxOptions();
        if(System.getenv().
                getOrDefault("BROWSER_STATE","show").
                equals("Headless")){
            options.addArguments("--headless");
        }

        WebDriver driver = new FirefoxDriver(options);

        driver.navigate().to("https://testpages.eviltester.com/pages/basics/basic-web-page/");

        Assertions.assertEquals(
            driver.findElement(By.tagName("h1")).getText(),
        "Basic Web Page"
        );

        // driver.close();
        driver.quit();
    }

}
