package com.eviltester.webdriver.basicsOfPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasicWebPage {

    private final WebDriver driver;

    // locators
    public final By CLICK_ME_BUTTON = By.id("button1");
    public final By CLICK_MESSAGE = By.id("click-message");

    public BasicWebPage(WebDriver driver) {
        this.driver = driver;
    }

    // navigators
    public void get() {
        driver.get(SiteConfig.getDomain() + "/pages/basics/basic-web-page/");
    }

    // element accessors
    public WebElement getButton(){
        return driver.findElement(CLICK_ME_BUTTON);
    }

    // helpers
    public String getButtonText() {
        return getButton().getText();
    }

    public WebElement getClickMessage() {
        return driver.findElement(CLICK_MESSAGE);
    }

    public ExpectedCondition<Boolean> showsMessage() {
        return ExpectedConditions.not(ExpectedConditions.textToBe(CLICK_MESSAGE, ""));
    }

    public ExpectedCondition<Boolean> successMessageNotShown() {
        return ExpectedConditions.textToBe(CLICK_MESSAGE, "");
    }
}
