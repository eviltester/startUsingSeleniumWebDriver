package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){

        /**  NOTE: For Firefox 45 and below
         * The following code will work on Firefox version 45 and below
         * It will not work on Firefox 46 released in the week of 25th April 2016
         * If you want to keep using version 45 then you can download it from here:
         * https://www.mozilla.org/en-US/firefox/organizations/all/
         */

        //WebDriver driver = new FirefoxDriver();

        /**   NOTE: If the test does not work
         * Check your Firefox version. If you are on version 46 or above then
         * you need to use the Marionette driver.
         *
         * Download the Marionette driver from here
         * https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver
         *
         * I assume you have unarchived the file into a /tools directory which would be a peer to
         * the pom.xml file e.g.
         *    pom.xml
         *    /tools
         *       /marionette
         *           wires.exe
         *
         * The code below assumes a code structure like that. You will need to change
         * the marionetteDriverLocation below if you choose a different location
         */

        String currentDir = System.getProperty("user.dir");
        String marionetteDriverLocation = currentDir + "/tools/marionette/wires.exe";
        System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
        WebDriver driver = new MarionetteDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
