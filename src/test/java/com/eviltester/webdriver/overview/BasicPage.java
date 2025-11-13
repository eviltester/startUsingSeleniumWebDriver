package com.eviltester.webdriver.overview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicPage {

    private final WebDriver driver;

    // locators
    public static final By SUCCESS_MESSAGE = By.id("click-message");

    public BasicPage(WebDriver driver) {
        this.driver = driver;
    }

    // navigator
    public void get() {
        driver.get(TestEnv.DOMAIN + "/pages/basics/basic-web-page/");
    }

    // element accessors
    public WebElement clickMeButton() {
        return driver.findElement(By.id("button1"));
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(SUCCESS_MESSAGE);
    }

    // synchronization
    public void waitUntilMessageShown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
            ExpectedConditions.not(
                ExpectedConditions.textToBe(
                        SUCCESS_MESSAGE, ""
                )
            ));
    }

    // functional helper
    public String getParaText() {
        return driver.findElement(By.id("para1")).getText();
    }
}
