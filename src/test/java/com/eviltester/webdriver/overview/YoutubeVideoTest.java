package com.eviltester.webdriver.overview;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    This was the test code created for:

    https://youtu.be/bQ7y9-Y2U2c

    The supporting video for:

    https://testpages.eviltester.com/reference/automating/webdriver/webdriver-java/
 */

public class YoutubeVideoTest {

    static WebDriver driver;
    BasicPage page;

    @BeforeAll
    public static void startUp(){
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void gotoPage(){
        page = new BasicPage(driver);
        page.get();
    }

    @Test
    public void myFirstTest(){
        Assertions.assertEquals(
            "A paragraph of text",
            page.getParaText()
        );
    }

    @Test
    public void canClickButton(){
        page.clickMeButton().click();
        page.waitUntilMessageShown();

        Assertions.assertEquals(
                "You clicked the button!",
                page.getSuccessMessage().getText()
        );
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
