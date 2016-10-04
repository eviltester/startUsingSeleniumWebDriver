http://seleniumsimplified.com/speedrun-installs/

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
    - check installs work by running the sample test from IntelliJ
    - run sample tests from command line

*Windows Install Videos*

* [YouTube Video Showing the Java Install on Windows 10](https://www.youtube.com/watch?v=j-46lYWAHF0)
* [YouTube Video Showing the WebDriver Install on Windows 10](https://www.youtube.com/watch?v=gteqOBS_Ln4)

*Mac Install Videos*

* [YouTube Video Showing the Java Install on a Mac](https://youtu.be/ff5ZsthcSZw)
* [YouTube Video Showing the WebDriver Install on a Mac](https://youtu.be/nq97dfaVmC4)


# Windows Install Speedrun checklist
 
## Install Java Pre-requisites

For instructions on how to install Java, Maven and IntelliJ; and check they are working, use the checklist in `startUsingJavaJunit` project:

* [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

## Install Sample WebDriver Project on Windows

* `[ ]`Download Test Project (this has a simple pom.xml and a basic test to run)
    * `[ ]`visit https://github.com/eviltester/startUsingSeleniumWebDriver
    * `[ ]`download the zip file and unzip somewhere

* `[ ]`Install and run IntelliJ Community Edition

* `[ ]`open project for the unzipped pom.xml file

* `[ ]`check most up to date version of webdriver in the unzipped pom.xml file
    * `[ ]`check the webdriver downloads page or the maven page for the up to date version
    * `[ ]`amend the pom.xml file if the version number is not up to date
    * `[ ]`exit IntelliJ


##  Install Firefox and Marionette GeckoDriver on Windows

* `[ ]`If install ESR version of Firefox (45) https://www.mozilla.org/en-US/firefox/organizations/faq/
      * `[ ]`no need to download any extra drivers
      * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTest`

* `[ ]`Install Current version of Firefox
      * `[ ]`download GeckoDriver add it to the path
            * https://github.com/mozilla/geckodriver
       * https://github.com/mozilla/geckodriver/releases
      * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTestFF48`

##  Install Chrome and ChromeDriver on Windows

* `[ ]`Install Current version of Chrome
      * `[ ]`download ChromeDriver add it to the path
            * https://sites.google.com/a/chromium.org/chromedriver/
      * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstChromeTest`


##  Run Test From IDE on Windows

* `[ ]`Back in IntelliJ

* `[ ]`run MyFirstTest, or MyFirstTestFF48 or MyFirstChromeTest class
    * `[ ]`right click on the class in the project window and select "Run 

* `[ ]`When the test runs from the IDE, you are finished your install and setup
















# Mac Install Speedrun checklist - Homebrew


## Install Java Pre-requisites

For instructions on how to install Java, Maven and IntelliJ; and check they are working, use the checklist in `startUsingJavaJunit` project:

* [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)


## Install WebDriver Sample Project on Mac

* `[ ]`Install Java JDK, Maven - see [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)
* `[ ]`Install and run IntelliJ Community Edition - see [`startUsingJavaJunit` project](https://github.com/eviltester/startUsingJavaJUnit)

* `[ ]`Download Test Project (this has a simple pom.xml and a basic test to run)
    * `[ ]`visit https://github.com/eviltester/startUsingSeleniumWebDriver
    * `[ ]`download the zip file and unzip somewhere

* `[ ]`open project for the unzipped pom.xml file

* `[ ]`check most up to date version of webdriver in the unzipped pom.xml file
    * `[ ]`check the [Selenium webdriver downloads](http://www.seleniumhq.org/download/) page or the maven page for the up to date version
        * I do not recommend using a beta version
    * `[ ]`amend the `pom.xml` file if the version number is not up to date
    * `[ ]`exit IntelliJ


##  Install Firefox and Marionette GeckoDriver on Mac

* `[ ]`If install ESR version of Firefox (45) https://www.mozilla.org/en-US/firefox/organizations/faq/
   * `[ ]`no need to download any extra drivers
   * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTest`

* `[ ]`Install Current version of Firefox
   * either with cask `brew cask install firefox`
        * or visit the site and install
* `[ ]`download GeckoDriver add it to the path
   * https://github.com/mozilla/geckodriver
   * https://github.com/mozilla/geckodriver/releases
   * extract into a folder and rename to wires
   * add path to `.bash_profile`
   * `export PATH=$PATH:/folder/you/extracted/it/to`
   * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstTestFF48`

##  Install Chrome and ChromeDriver on Mac

* `[ ]`Install Current version of Chrome
      * either with cask `brew cask install google-chrome`
      * or visit the site and install

* `[ ]` Install ChromeDriver 
      * `[ ]`download ChromeDriver add it to the path
            * https://sites.google.com/a/chromium.org/chromedriver/
      * extract into a folder
      * add folder path to `.bash_profile`
      * `export PATH=$PATH:/folder/you/extracted/it/to`
      * `[ ]`in startUsingSeleniumWebDriver folder run command `mvn test -Dtest=MyFirstChromeTest`
      
##  Run Test From IDE on Windows

* `[ ]`Back in IntelliJ

* `[ ]`run MyFirstTest, or MyFirstTestFF48 or MyFirstChromeTest class
    * `[ ]`right click on the class in the project window and select "Run 

* `[ ]`When the test runs from the IDE, you are finished your install and setup




    

Generic Links:
==============


+ sample JUnit test project from
    * https://github.com/eviltester/startUsingJavaJUnit
    * [Java Install Checklist](https://github.com/eviltester/startUsingJavaJUnit/blob/master/speedrun_install_java_checklist.md)

+ Download IntelliJ from
    * http://www.jetbrains.com/idea/download/

+ sample webdriver test project from
    * https://github.com/eviltester/startUsingSeleniumWebDriver

+ Check current webdriver version from
    * http://docs.seleniumhq.org/download/
    * http://docs.seleniumhq.org/download/maven.jsp

+ ChromeDriver
    * https://sites.google.com/a/chromium.org/chromedriver/

+ Mozilla GeckoDriver
    * https://github.com/mozilla/geckodriver
    * https://github.com/mozilla/geckodriver/releases

+ Mac HomeBrew and Cask
    * http://brew.sh
    * https://caskroom.github.io/



Installation on Windows 10 Notes:
=================================

* Using VM from  https://developer.microsoft.com/en-us/microsoft-edge/tools/vms/
* `IEUser` / `Passw0rd!`
* https://az792536.vo.msecnd.net/vms/release_notes_license_terms_8_1_15.pdf



Installation on XP Notes:
=========================

- I installed using the Windows XP VM from modern.ie, 
  with Java 1.7, maven 3.2.3, Webdriver 2.43.1, IntelliJ 13.1.5

- need to use JDK 1.7, JDK 1.8 reports a warning on Windows XP

- download a different text editor to edit the pom.xml (I used notepad++)
     - You may need to download a better editor than notepad.exe I use notepad++
     -  download notepad ++ from 
     http://notepad-plus-plus.org/download

- You need to 'unblock' Java and the IDE etc. 
  for the Windows Firewall as you run through the checklist. 
  Do this, otherwise they won't be able to work

- Edit SDK by right clicking and choosing "Open Module Settings", 
  then edit the SDK for the Project and press [OK]
  - choose the location of the Java JDK you installed 
    (sometimes you don't have to do this)

+ After test passes in the IDE - ignore the Info Message from WebDriver

"Oct 07, 2014 10:40:36 AM org.openqa.selenium.os.UnixProcess$SeleniumWatchDog destroyHarder
INFO: Command failed to close cleanly. Destroying forcefully (v2). 
org.openqa.selenium.os.UnixProcess$SeleniumWatchDog@da44a7

Process finished with exit code 0
"
It worked fine


Installation on Mac Notes:
==========================

- I installed using a VM with OS X Mavericks, then Java 1.8,
  maven 3.2.3, Webdriver 2.43.1, IntelliJ 13.1.5

- slightly different order of the install than Windows because:
  I was prompted to install JDK when I typed "javac -version" so
  I followed the instructions at that point.

  I didn't need to install Firefox early because I could use the
  build in Safari browser to download software.

  I didn't need to install a separate text editor as the build in
  handled the pom.xml file fine.

- with Maven
  - on mac, downloaded the zip
  - I didn't have a /usr/local so I had to "sudo mkdir /usr/local"
  - then I extracted the contents into an apache-maven-3.2.3 directory 
    in /usr/local (I probably should have created an /apache-maven 
    directory as well, but I didn't
    
    then I created all the exports in the terminal

    export M2_HOME=/usr/local/apache-maven-3.2.3
    export M2=$M2_HOME/bin
    export PATH=$M2:$PATH

    when I tried mvn -version it recognised maven but JAVA_HOME 
    wasn't setup so I had to 

    export JAVA_HOME="$(/usr/libexec/java_home)"

    Then it worked

    Then open a new tab and vi ~/.bash_profile and copy and paste 
    in all the exports

    then create a new tab and "mvn --version" to check that it worked

- Firefox
  searched for "firefox" then download from the mozilla.org site
  ran it
  nice overlapping dialogs that I had to deal with

- when I ran "mvn test -Dtest=MyFirstTest", my wifi connection dropped 
  in the middle, but I restarted wifi and ran the mvn command again 
  and it completed fine - one reason to use Maven


