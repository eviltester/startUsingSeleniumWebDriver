package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// import the driver class to allow us to use Firefox Driver
// uncomment the next line to use the MarionetteDriver
//import org.openqa.selenium.firefox.MarionetteDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver(){

        /**
         * If you are using Firefox 47 or a version of firefox that does not support the inbuilt
         * WebDriver Firefox driver then you will see firefox crash and an error like
         * "org.openqa.selenium.remote.UnreachableBrowserException: Could not start a new session. Possible causes are invalid address of the remote server or browser start-up failure."
         *
         * You will need to use one of the other methods listed:
         * e.g.
         * - portable firefox
         * or download firefox 45 ESR https://www.mozilla.org/en-US/firefox/organizations/all/
         * - marionette/GeckoDriver
         *
         * see the following blogs for details
         * - http://www.theautomatedtester.co.uk/blog/2016/selenium-webdriver-and-firefox-47.html
         * - http://seleniumsimplified.com/2016/04/how-to-use-the-firefox-marionette-driver/
         * - http://seleniumsimplified.com/2016/06/using-portable-firefox-46-with-webdriver/
         */


        /**  NOTE: For Firefox 46 and below only
         * The following code will work on Firefox version 46 and below
         * It will not work on Firefox versions which require Marionette (47 and above)
         * If you want to keep using version 45 then you can download it from here:
         * https://www.mozilla.org/en-US/firefox/organizations/all/
         */

        WebDriver driver = new FirefoxDriver();



        /**
         * Another option -
         * You could also use portable Firefox WebDriver on Windows
         * Which you could download from sourceforge
         * https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./
         *
         * I downloaded this version from sourceforge
         * https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./Mozilla%20Firefox%2C%20Portable%20Edition%2046.0.1/
         *
         * I extracted it to a tools directory at the same level of the source folder
         * And then use the following code to start the firefox
         */
        //FirefoxProfile profile = new FirefoxProfile();
        //WebDriver driver  = new FirefoxDriver(
        //        new FirefoxBinary(
        //                new File(System.getProperty("user.dir"),
        //                        "/tools/FirefoxPortable/FirefoxPortable.exe")
        //                ),profile);

        /**
         * Another option is to use the Marionette/GeckoDriver
         * This is the official FirefoxDriver that is under development
         * https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver
         *
         * You can either:
         * - define the location as a property
         * - or add the folder where you donwnloaded it to the path
         *
         */
        /* The following code is for the Marionette Driver
           You need to uncomment out the next 4 lines to use the marionette driver
           You also need to download the Marionette executable
           https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver
         */
        // String currentDir = System.getProperty("user.dir");
        // String marionetteDriverLocation = currentDir + "/tools/marionette/wires.exe";
        // System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);

        //If you add the folder with wires.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\marionette
        //WebDriver driver = new MarionetteDriver();


        // The actual test code follows assumes that you have either
        // - been able to instantiate FirefoxDriver or
        // - downloaded firefox portable and instantiated a driver with FirefoxBinary
        // - or using Marionette/GeckoDriver and set the webdriver.gecko.driver and instantiated MarionetteDriver
        // - or added the path of wires.exe to the system path and instantiated MarionetteDriver
        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }
}
