package com.eviltester.webdriver.browsers;

import com.eviltester.webdriver.basicsOfPageObjects.BasicWebPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfigurableChromeTest {

    /**
     The following code is for the Chrome Driver.
    */

    static WebDriver driver;

    @BeforeAll
    public static void initiateWebDriver(){
        ChromeOptions options = new ChromeOptions();
        if(System.getenv().
                getOrDefault("BROWSER_STATE","show").
                equals("Headless")){
            options.addArguments("--headless");
        }

        driver = new ChromeDriver(options);
    }


    @Test
    public void startWebDriver(){

        BasicWebPage page = new BasicWebPage(driver);
        page.get();

        Assertions.assertEquals(
            "Click Me",
            page.getButton().getText()
        );

    }

    @AfterAll
    public static void closeWebDriver(){
        driver.quit();
    }

    /*

     if https://testpages.eviltester.com or https://testpages.herokuapp.com is not working then you can download the
     test pages app from github

     https://github.com/eviltester/TestingApp/tree/master/java/testingapps/seleniumtestpages

     The herokuapp and github release are maintained.

     If you want to learn more about Selenium WebDriver then check out my online courses:

     https://eviltester.com/courses

     */

}
