package com.eviltester.webdriver.basics;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterChromeTest {

    static WebDriver driver;

    @BeforeAll
    public static void initiateWebDriver(){
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void loadPage(){
        driver.get(
                "https://testpages.eviltester.com/pages/basics/basic-web-page/"
        );
    }

    @Test
    public void pageHasCorrectHeading(){
        WebElement elem = driver.findElement(By.tagName("h1"));

        Assertions.assertEquals(elem.getText(), "Basic Web Page");
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
