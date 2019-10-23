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


## Run a Test on your chosen browser

If you are on a mac and have allowed Remote Execution in the Safari browser then you can use the command line:

`mvn test -Dtest=MyFirstSafariTest`

If you are using Chrome and have added ChromeDriver to the path then use the command line:

`mvn test -Dtest=MyFirstChromeTest`

If you are using Firefox and have added GeckoDriver to the path then use the command line:

`mvn test -Dtest=MyFirstTest`

Do not run `mvn test` because some of the tests are Platform and WebDriver version dependant and at least one will probably fail.

## Update `pom.xml`

You may also wish to edit the `pom.xml` file and change the version of Selenium WebDriver to the current version listed on [seleniumhq.org](https://www.seleniumhq.org) in the [downloads section](https://www.seleniumhq.org/download/)


*Author: Alan Richardson*

* [EvilTester.com](https://eviltester.com)
* [Compendium Developments](https://compendiumdev.co.uk)
* [SeleniumSimplified.com](https://seleniumsimplified.com)



## Running with Chrome

If you are using Chrome and have added ChromeDriver to the path then use the command line:

`mvn test -Dtest=MyFirstChromeTest`

## Running with Firefox

If you are using Firefox and have added GeckoDriver to the path then use the command line:

`mvn test -Dtest=MyFirstTest`

## Earlier versions of Firefox

If you wish to use earlier versions of Firefox then see the repo:

https://github.com/eviltester/startUsingLegacyFirefoxWebDriver

