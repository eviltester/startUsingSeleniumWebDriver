startUsingSeleniumWebDriver
===========================

Source code to support the free Online course Start Using Selenium WebDriver with Java

You can find the Free Online course here:

[http://seleniumsimplified.com/get-started/ "Free course start-using-selenium-webdriver-with-java")

The source code has only really been uploaded in case people encounter problems following the instructions or make a very simple mistake that they cannot figure out.

## Update 25th April 2016

Firefox 46 changes the way that WebDriver has to interact with it. So the built in `FirefoxDriver` will not work. You need to install Firefox 45 from [Firefox Extended Support Release](https://www.mozilla.org/en-US/firefox/organizations/all/) to continue using `FirefoxDriver`.

If you want to use Firefox 46 and later then you need to use the [Marionette](https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver) driver.

Follow the instructions on the Marionette page to download it. You do not need to add it to your path, you can control that through a system property - see the code in this project for more detail.

## Pre April 2016 updates

The code has changed slightly because we now need to do a .close and a .quit to exit Firefox

And I've updated the version of WebDriver.
