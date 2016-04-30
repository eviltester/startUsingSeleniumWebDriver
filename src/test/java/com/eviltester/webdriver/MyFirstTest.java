package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
// import the driver class to allow us to use Firefox Driver
import org.openqa.selenium.firefox.FirefoxDriver;
// uncomment the next line to use the MarionetteDriver
//import org.openqa.selenium.firefox.MarionetteDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){

        /**  NOTE: For Firefox 45 and below
         * The following code will work on Firefox version 45 and below
         * It will not work on Firefox versions which require Marionette (46 and above)
         * If you want to keep using version 45 then you can download it from here:
         * https://www.mozilla.org/en-US/firefox/organizations/all/
         */

        WebDriver driver = new FirefoxDriver();


        /* The following code is for the Marionette Driver
           You need to uncomment out the next 4 lines to use the marionette driver
           You also need to download the Marionette executable
           https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver
         */
        //String currentDir = System.getProperty("user.dir");
        //String marionetteDriverLocation = currentDir + "/tools/marionette/wires.exe";
        //System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
        //WebDriver driver = new MarionetteDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
