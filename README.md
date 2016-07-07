startUsingSeleniumWebDriver
===========================

Source code to support the free Online course Start Using Selenium WebDriver with Java

You can find the Free Online course here:

[http://seleniumsimplified.com/get-started/ "Free course start-using-selenium-webdriver-with-java")

The source code has only really been uploaded in case people encounter problems following the instructions or make a very simple mistake that they cannot figure out.

Please read the comments below, and the source code comments if you are having trouble starting work with Firefox. Especially if you are using Firefox v 47.


## Update 7th July 2016

Firefox 47 was incompatible with Selenium 2.53.0 so we needed to use marionette driver.

Firefox 47.1 is compatible with Selenium 2.53.1 allowing us to use the `FirefoxDriver` again.

The blog post below describes how to use a local version of Selenium with maven if any incompatibility happens again and you need to move to a different version of WebDriver which is not on maven central.

* http://seleniumsimplified.com/2016/06/use_selenium_webdriver_jar_locally/

## Update 22nd June 2016

Added information about using portable firefox driver and more comments.

## Update 25th April 2016

Firefox 46 changes the way that WebDriver has to interact with it. So the built in `FirefoxDriver` did not work. You need to install Firefox 45 from [Firefox Extended Support Release](https://www.mozilla.org/en-US/firefox/organizations/all/) to continue using `FirefoxDriver`.

If you want to use Firefox 46 and later then you may need to use the [Marionette](https://developer.mozilla.org/en-US/docs/Mozilla/QA/Marionette/WebDriver) driver.

Follow the instructions on the Marionette page to download it. You do not need to add it to your path, you can control that through a system property - see the code in this project for more detail.

You can also use portable Firefox as described in this blog post

* http://seleniumsimplified.com/2016/06/using-portable-firefox-46-with-webdriver/

All of this is explained in the source code, or in the blog posts:

* http://seleniumsimplified.com/2016/04/how-to-use-the-firefox-marionette-driver/
* http://seleniumsimplified.com/2016/06/using-portable-firefox-46-with-webdriver/


## Pre April 2016 updates

The code has changed slightly because we now need to do a .close and a .quit to exit Firefox

And I've updated the version of WebDriver.
