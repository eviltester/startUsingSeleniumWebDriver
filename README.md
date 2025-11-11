Start Using Selenium WebDriver
===========================

[![build status](https://github.com/eviltester/startUsingSeleniumWebDriver/actions/workflows/build.yml/badge.svg)](https://github.com/eviltester/startUsingSeleniumWebDriver/actions)

Simple start example for Selenium 4 with java and JUnit 5.

- For previous versions of WebDriver and JUnit see the releases page.

It has the basic startup and configuration for a test using Chrome Driver.

Supporting text description of the contents of this repo can be found:

- https://testpages.eviltester.com/reference/automating/webdriver/webdriver-java/

The pages used as the system under test are:

- https://testpages.eviltester.com

## Pre-Requisites

Pre-requisites are ([use quick start guide to install these](https://github.com/eviltester/startUsingJavaJUnit5/blob/main/speedrun_install_java_checklist.md)):

- a Java SDK
- maven
- and and IDE Install.

The code uses JUnit 5 so you can follow the Quick Start Guide in the "[Getting Started with JUnit 5 repo](https://github.com/eviltester/startUsingJavaJUnit5)"

- [Quick start guide is here](https://github.com/eviltester/startUsingJavaJUnit5/blob/main/speedrun_install_java_checklist.md)

## Start By

Clone or download the repo as a zip.

From the unzipped top level directory containing the 'pom.xml' file, you can run the test using:

`mvn test`

And can run it using headless mode by setting the environment variable `BROWSER_STATE` to have the value "`Headless`"

e.g.

```
BROWSER_STATE=Headless mvn test
```

## Use the code

Open the project in Intellij by opening the folder containing the 'pom.xml' or open the 'pom.xml'.

## Github Actions

The repo also has [Github actions](https://github.com/eviltester/startUsingJavaJUnit5/blob/main/.github/workflows/build.yml) to run the test in headless mode periodically.

## About Selenium WebDriver 4

This uses Selenium 4.

Selenium 4 comes with a builtin WebDriver Manager

https://www.selenium.dev/blog/2022/introducing-selenium-manager/

This will automatically download the drivers required to allow Selenium to use the chosen webdriver.

e.g. if you instantiate a `new ChromeDriver()` the WebDriver Manager will download the drivers for
Chrome and run the tests against Chrome.

You just need to download and have Chrome installed.

Similarly, with Firefox and Edge, just download the browser and Selenium will download the correct driver.


