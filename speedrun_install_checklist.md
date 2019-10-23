
# Generic Selenium WebDriver Install Speedrun checklist

*Basic steps:*

- Install Java and supporting tools
    - install Java JDK
    - install Maven
    - check Java and Maven work by running a sample test
- Install IntelliJ
    - check IntelliJ works by running the sample test
- Install WebDriver Supporting Tools
    - download and Install Chrome
    - download and Install Firefox
    - download and install Marionette GeckoDriver
    - download and Install ChromeDriver
    - check installs work by running the sample tests

---

## Install Videos

*Windows Install Videos*

* [YouTube Video Showing the Java Install on Windows 10](https://www.youtube.com/watch?v=j-46lYWAHF0)
    * https://www.youtube.com/watch?v=j-46lYWAHF0   
* [YouTube Video Showing the WebDriver Install on Windows 10](https://www.youtube.com/watch?v=gteqOBS_Ln4)
    * https://www.youtube.com/watch?v=gteqOBS_Ln4 

*Mac Install Videos*

* [YouTube Video Showing the Java Install on a Mac](https://youtu.be/ff5ZsthcSZw)
    * https://youtu.be/ff5ZsthcSZw  
* [YouTube Video Showing the WebDriver Install on a Mac](https://youtu.be/nq97dfaVmC4)
    * https://youtu.be/nq97dfaVmC4 

---

# Windows Install Speedrun checklist
 
## Install Java Pre-requisites

You need to have Java, Maven and IntelliJ installed.

For instructions on how to install Java, Maven and IntelliJ; and check they are working, use the checklist in `startUsingJavaJunit` project:

* [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

**Note: I currently recommend using `ChromeDriver` as your default driver and the current version of Chrome as your default browser. If you only setup one driver and browser, make it Chrome, it is a lot easier to start with.**


---

## Install Firefox GeckoDriver or ChromeDriver the 'fast' way on Windows

Both GeckoDriver and ChromeDriver are available to install via [Chocolatey](https://chocolatey.org/)

- ChromeDriver
    - https://chocolatey.org/packages/selenium-chrome-driver
    - `choco install selenium-chrome-driver`
- Firefox GeckoDriver
    - https://chocolatey.org/packages/selenium-gecko-driver
    - `choco install selenium-gecko-driver`

---

## Install Firefox GeckoDriver or ChromeDriver the 'long' way on Windows

Note: You only really have to install one of these to get started. I recommend ChromeDriver and Chrome.

---

###  Install Chrome and ChromeDriver on Windows

* `[ ]`Install Current version of Chrome
* `[ ]`download ChromeDriver add it to the path
    * https://sites.google.com/a/chromium.org/chromedriver/
* `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstChromeTest`
    * If you did everything correctly then Chrome should have started and a test should have run

---

###  Install Firefox and GeckoDriver on Windows

* `[ ]` Install Current version of Firefox
* `[ ]`download GeckoDriver add it to the path
    * https://github.com/mozilla/geckodriver
        * https://github.com/mozilla/geckodriver/releases
    * Unzip the downloaded archive file and add to the windows path
        - `geckodriver.exe`
    * Check that you have added to the path by typing `geckodriver` into a command prompt
* `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTest`
    * If you did everything correctly then Firefox should have started and a test should have run

---

## Install Sample WebDriver Project on Windows

* `[ ]`Download Test Project (this has a simple pom.xml and a basic test to run)
    * `[ ]`visit https://github.com/eviltester/startUsingSeleniumWebDriver
    * `[ ]`download the zip file and unzip somewhere

* `[ ]`Install and run IntelliJ Community Edition

* `[ ]`open project for the unzipped pom.xml file

---

* Check the most up to date version of WebDriver
    * `[ ]`check for most up to date version of WebDriver in the unzipped pom.xml file
        * `[ ]`check the webdriver downloads page or the maven page for the up to date version
            - https://www.seleniumhq.org/download/
    * `[ ]`amend the pom.xml file if the version number is not up to date
    * `[ ]`exit IntelliJ
    
The version number is contained in this section of the `pom.xml` e.g. this says use version `3.13.0` of Selenium WebDriver

~~~~~~~~
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
			<version>3.13.0</version>
        </dependency>
~~~~~~~~    

---

##  Run Test From IDE on Windows

* `[ ]`Back in IntelliJ

* `[ ]`run MyFirstTest, or MyFirstTestFF48 or MyFirstChromeTest class
    * `[ ]`right click on the class in the project window and select "Run 

* `[ ]`When the test runs from the IDE, you are finished your install and setup

---

# Mac Install Speedrun checklist - Homebrew

## Install Java Pre-requisites

For instructions on how to install Java, Maven and IntelliJ; and check they are working, use the checklist in `startUsingJavaJunit` project:

* [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

---

## Install WebDriver Sample Project on Mac

* `[ ]`Install Java JDK, Maven - see [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* `[ ]`Install IntelliJ Community Edition - see [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)

* `[ ]`Download Test Project (this has a simple pom.xml and a basic test to run)
    * `[ ]`visit https://github.com/eviltester/startUsingSeleniumWebDriver
    * `[ ]`download the zip file and unzip somewhere


**Note: Currently recommend using `ChromeDriver` as your default driver and the current version of Chrome as your default browser. If you only setup one driver and browser, make it Chrome, it is a lot easier to start with.**

---

* `[ ]`open project for the unzipped pom.xml file

* `[ ]`check most up to date version of webdriver in the unzipped pom.xml file
    * `[ ]`check the [Selenium webdriver downloads](http://www.seleniumhq.org/download/) page or the maven page for the up to date version
        * I do not recommend using a beta version
    * `[ ]`amend the `pom.xml` file if the version number is not up to date
    * `[ ]`exit IntelliJ

---

##  Install SafarDriver on Mac

SafariDriver is built into the Mac operating system.

We need to enable remote execution in Safari Browser to use it.

- `Safari \ Preferences \ Advanced`
   - `[x]` show develop menu in menu bar
- `Develop \ Allow Remote Execution`

---

##  Install Firefox and GeckoDriver on Mac

[Install Homebrew](https://brew.sh/) if you don't already have it.

* `[ ]` Install Current version of Firefox
   * either with cask `brew cask install firefox`
        * or visit the site and install
* `[ ]` Install GeckoDriver
   - https://brew.sh/
        - https://formulae.brew.sh/formula/geckodriver
   * `brew install geckodriver`        
        
---

##  Install Chrome and ChromeDriver on Mac

* `[ ]`Install Current version of Chrome
      * either with cask `brew cask install google-chrome`
      * or visit the site and install
* `[ ]` Install ChromeDriver using HomeBrew
   * https://brew.sh/
       - https://formulae.brew.sh/cask/chromedriver#default
   * `brew cask install chromedriver`

---

## Install Firefox GeckoDriver or ChromeDriver the 'long' way on Mac

Remember you can skip this step if you used HomeBrew.

### Firefox GeckoDriver the 'long' way on Mac 

* `[ ]`download GeckoDriver add it to the path
   * https://github.com/mozilla/geckodriver
   * https://github.com/mozilla/geckodriver/releases
   * extract into a folder
       * if using version 2.53.1 of WebDriver then rename to wires
       * if using version 3 of WebDriver then leave as geckodriver
   * add path to `.bash_profile`
   * `export PATH=$PATH:/folder/you/extracted/it/to`
   * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTestFF48`
   
---

### ChromeDriver the 'long' way on Mac

* `[ ]` Install ChromeDriver 
      * `[ ]`download ChromeDriver add it to the path
            * https://sites.google.com/a/chromium.org/chromedriver/
      * extract into a folder
      * add folder path to `.bash_profile`
      * `export PATH=$PATH:/folder/you/extracted/it/to`
      * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstChromeTest`

---

##  Run Test From IDE on Windows or Mac

* `[ ]` Back in IntelliJ

* `[ ]` run `MyFirstTest`, or `MyFirstChromeTest` or `MyFirstSafariTest` class depending on which drivers you installed
    * `[ ]`right click on the class in the project window and select "Run 

* `[ ]`When the test runs from the IDE, you are finished your install and setup


---


    

Generic Links:
==============


+ sample JUnit test project from
    * https://github.com/eviltester/startUsingJavaJUnit
    * [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

+ Download IntelliJ from
    * http://www.jetbrains.com/idea/download/

+ sample webdriver test project from
    * https://github.com/eviltester/startUsingSeleniumWebDriver

---

+ Check current webdriver version from
    * http://docs.seleniumhq.org/download/
    * http://docs.seleniumhq.org/download/maven.jsp

+ ChromeDriver
    * https://sites.google.com/a/chromium.org/chromedriver/

+ Mozilla GeckoDriver
    * https://github.com/mozilla/geckodriver
    * https://github.com/mozilla/geckodriver/releases

+ Mac HomeBrew and Cask
    * https://brew.sh
    * https://caskroom.github.io/


---

# Selenium Simplified

## Online Training and blog teaching Selenium WebDriver with Java

* www.seleniumsimplified.com

By Alan Richardson

* www.eviltester.com
* www.javafortesters.com
* www.compendiumdev.co.uk
* https://uk.linkedin.com/in/eviltester
* [@eviltester](https://twitter.com/eviltester)



---

## Legacy Firefox install instructions

* `[ ]` If install ESR version of Firefox (45) https://www.mozilla.org/en-US/firefox/organizations/faq/
      * `[ ]`no need to download any extra drivers
      * if using WebDriver `2.53.1`
         * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTest`
      * if using WebDriver `3.0.1` (or above)
         * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstLegacyFFTest`