package com.eviltester.webdriver.basicsOfSynchronization;

import com.eviltester.webdriver.basicsOfPageObjects.BasicWebPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitingForState {

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOf(page.getHeading1()));

        Assertions.assertEquals(page.getHeadingText(), "Basic Web Page");
    }

    @Test
    public void pageHasCorrectHeadingSyncBy(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(page.HEADING1_LOCATOR));

        Assertions.assertEquals(page.getHeadingText(), "Basic Web Page");
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
