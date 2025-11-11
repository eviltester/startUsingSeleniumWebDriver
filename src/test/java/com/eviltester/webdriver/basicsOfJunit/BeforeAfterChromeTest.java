package com.eviltester.webdriver.basicsOfJunit;

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
    public void buttonHasCorrectText(){
        WebElement button = driver.findElement(By.id("button1"));

        Assertions.assertEquals("Click Me", button.getText());
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
