Installation on Windows 10 Notes:
=================================

* Using VM from  https://developer.microsoft.com/en-us/microsoft-edge/tools/vms/
* `IEUser` / `Passw0rd!`
* https://az792536.vo.msecnd.net/vms/release_notes_license_terms_8_1_15.pdf
* used Chocolatey for JDK, IntelliJ, ChromeDriver and GeckoDriver Installs


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
