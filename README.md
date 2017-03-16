startUsingSeleniumWebDriver
===========================

Source code to support getting started using Selenium WebDriver with Java

The source code has only really been uploaded in case people encounter problems following the instructions or make a very simple mistake that they cannot figure out.

Please read the comments below, and the source code comments if you are having trouble starting work with Firefox.


## Steps

* First install Java, Maven and IntelliJ
    * [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)
* Second install Firefox, GeckoDriver, Chrome and ChromeDriver
    * [WebDriver Install Checklist](https://github.com/eviltester/startUsingSeleniumWebDriver/blob/master/speedrun_install_checklist.md)


If you are using Chrome and have added ChromeDriver to the path then use the command line:

`mvn test -Dtest=MyFirstChromeTest`

**For Firefox see the notes below for the version of Selenium WebDriver you are using.**

Do not run `mvn test` because some of the tests are WebDriver version dependant and at least one will fail.

*Author: Alan Richardson*

* [SeleniumSimplified.com](http://seleniumsimplified.com)
* [Compendium Developments](http://compendiumdev.co.uk)


See related blog posts:

* http://seleniumsimplified.com/2016/10/update-on-marionette-geckodriver-v0-11-1-q-should-you-try-it-a-yes-you-should/
* http://seleniumsimplified.com/2016/10/upgrading-to-selenium-3-with-my-first-selenium-project/


## Notes for Selenium WebDriver Above 3.0.1

Versions of Selenium WebDriver 3.1.0 and above have removed the `MarionetteDriver` class, and `FirefoxDriver` should now be used for all versions of Firefox.

The `MyFirstTestFF48` has been commented out in the code.

If you are using version 3.0.1 or below then you can uncomment out the main class code and the imports and you can use this test.

## Notes for Selenium WebDriver 3.0.1

### Running with Firefox

If you are using Firefox 45 Extended Release version (or Firefox < v48) then to run the test from the command line use:

`mvn test -Dtest=MyFirstLegacyFFTest`

If you are using Firefox 48+ and have added Marionette `geckodriver.exe` to the path then use the command line:

`mvn test -Dtest=MyFirstTest`

The following will also work with Firefox 48+, but will fail in a future version of WebDriver because the `MarionetteDriver` is deprecated.

`mvn test -Dtest=MyFirstTestFF48`

### Running with Chrome

If you are using Chrome and have added ChromeDriver to the path then use the command line:

`mvn test -Dtest=MyFirstChromeTest`

## Notes for Selenium WebDriver 2.53.1

### Running with Firefox

If you are using Firefox 45 Extended Release version (or Firefox < v48) then to run the test from the command line use:

`mvn test -Dtest=MyFirstTest`

If you are using Firefox 48+ and have added Marionette `geckodriver.exe` to the path (renamed to `wires.exe`) then use the command line:

`mvn test -Dtest=MyFirstTestFF48`

### Running with Chrome

If you are using Chrome and have added ChromeDriver to the path then use the command line:

`mvn test -Dtest=MyFirstChromeTest`

## Update 19th October 2016

Updated the Notes to cover Firefox on WebDriver 2.53.1 and 3.0.1.

## Update 4th October 2016

* Added the Mac Instructions, and moved Java install to the [Java checklist and project](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

## Update 30th September 2016

I have added a test for ChromeDriver into the code:

* `MyFirstChromeTest`

This has comments explaining where to locate the chromedriver.exe or just add the folder with chromedriver.exe to the path.

## Update 27th September 2016

I have added two tests into the code:

* `MyFirstTest`
* `MyFirstTestFF48`

`MyFirstTest` has all the comments explaining all the multiple uses of Firefox and defaults to using the FirefoxDriver - in selenium 2 this will only work with Firefox 47 or below. With Selenium 3 you could run this if Marionette driver is on the path.

`MyFirstTestFF48` is a cut down test that uses the MarionetteDriver and assumes that wires.exe is on the path.

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
