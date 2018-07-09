package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){


/**

 The following code is for the FirefoxDriver.

 You also need to download the GeckoDriver executable:

 -https://github.com/mozilla/geckodriver/releases

 You can easily install GeckoDriver on windows using chocolatey:

 - https://chocolatey.org/packages/selenium-gecko-driver

 If you are on a Mac then you could install ChromeDriver using HomeBrew

 - http://brewformulas.org/geckodriver

 */


        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        // FirefoxDriver seems to prefer either quit or close, but sometimes throws an error if you use both
        //driver.close();
        driver.quit();
    }

}
