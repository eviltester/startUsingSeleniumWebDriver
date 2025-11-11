package com.eviltester.webdriver.basicsOfSynchronization;

import com.eviltester.webdriver.basicsOfPageObjects.BasicWebPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitingInsteadOfAssertionTest {

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
    public void clickingButtonShowsMessageWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.CLICK_ME_BUTTON));
        page.getButton().click();

        WebElement message = page.getClickMessage();

        // this might be flaky
        // Assertions.assertEquals("You clicked the button!", message.getText());
        // instead wait for the text to appear and disappear
        // no asserts are really needed but we can add them so that reviewers know the waits
        // are not just for synchronisation
        String successMessage = "You clicked the button!";

        wait.until(ExpectedConditions.textToBe(page.CLICK_MESSAGE, successMessage));
        Assertions.assertEquals(successMessage, message.getText());

        wait.until(ExpectedConditions.textToBe(page.CLICK_MESSAGE, ""));
        Assertions.assertEquals("", message.getText());
    }

    @Test
    public void clickingButtonShowsMessageSyncWaitDifferentFromAssert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.CLICK_ME_BUTTON));
        page.getButton().click();

        WebElement message = page.getClickMessage();

        // The asserts are different from the wait conditions
        // so both are necessary now
        String successMessage = "You clicked the button!";

        //wait until a message is shown
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(page.CLICK_MESSAGE, "")));
        Assertions.assertEquals(successMessage, message.getText());

        // wait until the success message is not shown
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(page.CLICK_MESSAGE, successMessage)));
        Assertions.assertEquals("", message.getText());
    }

    @Test
    public void clickingButtonShowsMessagePageAbstraction(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(page.CLICK_ME_BUTTON));
        page.getButton().click();

        WebElement message = page.getClickMessage();

        /*
            By moving the wait conditions into the page abstraction
            the test is more readable, and we maintain sync and assert
            conditions separately
         */
        wait.until(page.showsMessage());
        Assertions.assertEquals("You clicked the button!", message.getText());

        wait.until(page.successMessageNotShown());
        Assertions.assertEquals("", message.getText());
    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }
}
