package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/* run the test code against Firefox v < 48 with the inbuilt Firefox Driver in WebDriver 3 */
public class MyFirstLegacyFFTest {

    @Test
    public void startWebDriver(){


        /* Use the built in FirefoxDriver to run a version of Firefox < 48
           You do not neet to have Marionette geckodriver.exe or wires.exe on the path.
           You do need to be using v 3 of WebDriver */
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();

        // in firefox 3.2.0 and below you can choose the legacy driver with capabilities
        //capabilities.setCapability("marionette", false);
        // in firefox 3.3.1 and above you need to use system properties to use the legacy driver
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"false");

        /* If Firefox < v48 is not your default browser then you need to tell WebDriver where it is,
           so uncomment the setCapability line below and amend the firefox_binary_path to the location of your firefox.exe
           the example code uses FirefoxPortable from
                https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./
           */


        // *
        // * YOU NEED TO SET THE PATH TO YOUR BINARY OF FIREFOX IF IT IS NOT IN THE PATH e.g. portable firefox
        // *
        // * Note: in v 3.3.1 the path needs to be on the same drive as you are running the tests from
        // * e.g. you can't have the browsers on C:/ and the run the tests from D:/
        // *
        // relative location to the project i.e. /tools/FirefoxPortable where /tools is at the same level as /src
        //String firefox_binary_path = new File(System.getProperty("user.dir"),"/tools/FirefoxPortable/FirefoxPortable.exe").getAbsolutePath();
        // hard coded location on C drive
        // String firefox_binary_path = "C:\\webdrivers\\FirefoxPortable\\FirefoxPortable.exe";

        // * if you set a path above then uncomment this line to use it
        // capabilities.setCapability("firefox_binary", firefox_binary_path);

        WebDriver driver = new FirefoxDriver(capabilities);


        // The actual test code follows assumes that you have either
        // - been able to instantiate FirefoxDriver or
        // - downloaded firefox portable and instantiated a driver with FirefoxBinary
        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }

    /**
     * Notes on Firefox Portable
     * You could also use portable Firefox WebDriver on Windows
     * Which you could download from sourceforge
     * https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./
     *
     * I downloaded this version from sourceforge
     * https://sourceforge.net/projects/portableapps/files/Mozilla%20Firefox%2C%20Portable%20Ed./Mozilla%20Firefox%2C%20Portable%20Edition%2046.0.1/
     *
     * I extracted it to a tools directory at the same level of the source folder
     * And then set the firefox_binary capability to point to the executable location
     */

}
