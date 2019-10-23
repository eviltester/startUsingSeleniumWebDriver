package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

    /**

     The following code is for the FirefoxDriver.

     You also need to download the GeckoDriver executable:

     - https://github.com/mozilla/geckodriver/releases

     You can easily install GeckoDriver on windows using chocolatey:

     - https://chocolatey.org/packages/selenium-gecko-driver

     If you are on a Mac then you could install Firefox GeckoDriver using HomeBrew

     - https://brew.sh/
     - https://formulae.brew.sh/formula/geckodriver

~~~~~~~~
brew update
brew install geckodriver
~~~~~~~~

     And to keep it up to date:

~~~~~~~~
brew update
brew upgrade geckodriver
~~~~~~~~



     */

    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://testpages.herokuapp.com");

        Assert.assertTrue("title should start with Selenium",
                            driver.getTitle().startsWith("Selenium"));

        // FirefoxDriver seems to prefer either quit or close, but sometimes throws an error if you use both
        //driver.close();
        driver.quit();
    }

    /*

     if https://testpages.herokuapp.com is not working then you can download the
     test pages app from github

     https://github.com/eviltester/TestingApp/tree/master/java/testingapps/seleniumtestpages

     The herokuapp and github release are maintained.

     You can also find legacy test pages at:

     - https://compendiumdev.co.uk/selenium/testpages
     - https://www.seleniumsimplified.com/testpages/

     If you want to learn more about Selenium WebDriver then check out my online courses:

     https://eviltester.com/courses

     */
}
