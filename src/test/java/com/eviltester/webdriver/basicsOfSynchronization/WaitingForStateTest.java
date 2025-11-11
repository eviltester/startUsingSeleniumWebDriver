package com.eviltester.webdriver.basicsOfSynchronization;

import com.eviltester.webdriver.basicsOfPageObjects.BasicWebPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitingForStateTest {

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
    public void buttonHasCorrectText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.getButton()));

        Assertions.assertEquals("Click Me", page.getButtonText());
    }

    @Test
    public void buttonHasCorrectTextSyncBy(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.CLICK_ME_BUTTON));

        Assertions.assertEquals("Click Me", page.getButtonText());
    }

    @Test
    public void clickingButtonShowsMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.CLICK_ME_BUTTON));
        page.getButton().click();

        WebElement message = page.getClickMessage();

        // this might be flaky so we can wait for condition
        String successMessage = "You clicked the button!";
        wait.until(ExpectedConditions.textToBe(page.CLICK_MESSAGE, successMessage));
        Assertions.assertEquals(successMessage, message.getText());
    }


    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
