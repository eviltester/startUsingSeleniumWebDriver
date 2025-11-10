package com.eviltester.webdriver.basicsOfPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicWebPage {
    private final WebDriver driver;

    // locators
    public final By HEADING1_LOCATOR = By.tagName("h1");

    public BasicWebPage(WebDriver driver) {
        this.driver = driver;
    }

    // navigators
    public void get() {
        driver.get(SiteConfig.getDomain() + "/pages/basics/basic-web-page/");
    }

    // element accessors
    public WebElement getHeading1(){
        return driver.findElement(HEADING1_LOCATOR);
    }

    // helpers
    public String getHeadingText() {
        return getHeading1().getText();
    }
}
