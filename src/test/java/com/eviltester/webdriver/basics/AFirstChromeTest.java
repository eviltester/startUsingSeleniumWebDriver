package com.eviltester.webdriver.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFirstChromeTest {
    @Test
    public void startWithWebDriver(){

        WebDriver driver = new ChromeDriver();

        driver.get(
            "https://testpages.eviltester.com/pages/basics/basic-web-page/"
        );

        WebElement elem = driver.findElement(By.tagName("h1"));

        Assertions.assertEquals(elem.getText(), "Basic Web Page");

        driver.quit();
    }
}
