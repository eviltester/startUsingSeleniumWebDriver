package com.eviltester.webdriver.basicsOfPageObjects;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPageObjects {

    static WebDriver driver;
    private BasicWebPage page;

    @BeforeAll
    public static void initiateWebDriver(){
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void loadPage(){
        page = new BasicWebPage(driver);
        page.get();
    }

    @Test
    public void pageHasCorrectHeading(){
        Assertions.assertEquals(page.getHeadingText(), "Basic Web Page");
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
