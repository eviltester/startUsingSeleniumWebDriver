package com.eviltester.webdriver.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AFirstChromeTest {
    @Test
    public void myFirstWebDriverTest(){

        WebDriver driver = new ChromeDriver();

        driver.get(
            "https://testpages.eviltester.com/pages/basics/basic-web-page/"
        );

        WebElement button = driver.findElement(By.id("button1"));

        Assertions.assertEquals("Click Me", button.getText());

        driver.quit();
    }
}
