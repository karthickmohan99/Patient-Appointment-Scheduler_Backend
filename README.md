Welcome to my Spring Boot application! This README file provides instructions on how to set up and run the application.

## Prerequisites

 Java Development Kit (JDK) 8 or later: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
 
 
 ##Install any Java IDE i.e.,STS4 for eclipse
 1. Download Spring Tool Suite

Visit the official Spring Tool Suite download page:
[Spring Tool Suite Download](https://spring.io/tools)

Choose the appropriate distribution for your operating system (Windows, macOS, or Linux) and download the installer.

### 2. Install Spring Tool Suite

#### Windows:

1. Double-click the downloaded installer executable.
2. Follow the on-screen instructions to install STS.
3. Choose an installation directory and confirm the installation.

#### macOS:

1. Open the downloaded DMG file.
2. Drag the Spring Tool Suite icon to the Applications folder.
3. Eject the DMG file and open STS from the Applications folder.

#### Linux:

1. Extract the downloaded archive to a directory of your choice.
2. Open a terminal and navigate to the extracted directory.
3. Run the following command to start STS:

   ```sh
   ./SpringToolSuite4

## 3. Install Maven Build tool

### Open Spring Tool Suite (STS)

Launch Spring Tool Suite on your system.

### Install Maven Integration

1. Go to the main menu: `Help` > `Eclipse Marketplace`.
2. In the `Eclipse Marketplace` dialog, search for "maven".
3. Look for "m2e" (Maven Integration for Eclipse) and click the `Go` button.
4. Click the `Install` button next to "Maven Integration for Eclipse".
5. Follow the on-screen instructions to complete the installation.
6. Restart Spring Tool Suite when prompted.

###  Verify Maven Installation

1. After restarting STS, go to the main menu: `Window` > `Show View` > `Other`.
2. In the `Show View` dialog, expand `General` and select `Maven Repositories`.
3. The `Maven Repositories` view should now be visible in your workspace. You can use this view to manage your Maven dependencies.

## Using Maven in Spring Tool Suite

With Apache Maven installed, you can now manage your project's build and dependencies using Maven within Spring Tool Suite.

### 4.Clone the repository:

```bash
git clone <repository_url>
cd <repository_directory>

###5.Build the project using Maven:
1.Import the application's main folder in spring tool suit
2.right click on the projects main folder an ---> click RunAs-->`mvn clean install`
###6.Run the Application
1.After Build the project using maven 
2.Right click projects main folder--->RunAS-->Java Application
3.Now the application is run on Tomcat appache  server port number 8081
   


