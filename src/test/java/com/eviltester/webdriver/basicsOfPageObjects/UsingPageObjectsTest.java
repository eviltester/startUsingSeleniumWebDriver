package com.eviltester.webdriver.basicsOfPageObjects;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingPageObjectsTest {

    static WebDriver driver;
    private BasicWebPage page;

    @BeforeAll
    public static void initiateWebDriver(){
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void loadPage(){
        page = new BasicWebPage(driver);
        page.get();
    }

    @Test
    public void pageHasCorrectButtonText(){
        Assertions.assertEquals(page.getButtonText(), "Click Me");
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
