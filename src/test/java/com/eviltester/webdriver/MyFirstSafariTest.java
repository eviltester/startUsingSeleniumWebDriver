package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstSafariTest {


    /**

     The following code is for the Safari Driver.

     This will only work on a Mac operating system.

     The safari driver is installed by default with the operating system. It should just work on a mac.

     You may need to change the safari properties to allow automated execution.

     - Safari \ Preferences \ Advanced \ [x] show develop menu in menu bar
     - Develop \ Allow Remote Execution

     */

    @Test
    public void startWebDriver(){

        WebDriver driver = new SafariDriver();

        driver.navigate().to("https://testpages.herokuapp.com");

        Assert.assertTrue("title should start with Selenium",
                            driver.getTitle().startsWith("Selenium"));

        // safari driver now seems to prefer just close or quit, but not both
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
