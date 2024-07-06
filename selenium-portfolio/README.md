### README.md

# Selenium Portfolio Project

## Introduction
Selenium is a powerful tool for automating web browsers. It is widely used in the real world for testing web applications, ensuring they function correctly across different browsers and platforms.

## Why Selenium?
Selenium is useful in the real world because it allows for automated testing of web applications, saving time and effort compared to manual testing. It supports multiple programming languages and browser types, making it versatile and widely applicable.

## Project Overview
This project demonstrates the use of Selenium WebDriver for cross-browser testing on a portfolio website. The project includes setting up Selenium with Maven, creating a test class, and running the tests across different browsers.

## Technologies Used
- **Programming Language**: Java
- **Build Tool**: Maven
- **Browsers**: Chrome, Firefox, Safari

## Types of Selenium Tools
- **Selenium WebDriver**: A tool for automating web application testing by controlling browsers.
- **Selenium IDE**: An integrated development environment for Selenium scripts.
- **Selenium Grid**: A tool for running tests on different machines and browsers simultaneously.

## Steps to Setup and Run the Project

### 1. Update `pom.xml` File
Add the necessary dependencies for Selenium and WebDriverManager from the Maven repository. This allows Maven to manage these libraries automatically.

### 2. Create `PortfolioTest` Class
Define a class to encapsulate the test logic. This class will:
- Import necessary Selenium and WebDriverManager packages.
- Setup WebDriver for Chrome, Firefox, and Safari.
- Run the test by navigating to the portfolio site, interacting with elements, and printing page titles.

### 3. Call the Test Function
Create a `Main` class to call the `runTest` function, passing the desired browser as an argument.

### 4. Important Configuration for Safari
When using Safari for automation, ensure that 'Allow Remote Automation' is enabled in Safari's Develop menu.

## Running the Tests

### Clean and Compile the Project
```sh
mvn clean compile
```

### Run the Project with Chrome
```sh
mvn exec:java -Dexec.mainClass="com.gagann.selenium.Main" -Dexec.args="chrome"
```

### Run the Project with Firefox
```sh
mvn exec:java -Dexec.mainClass="com.gagann.selenium.Main" -Dexec.args="firefox"
```

### Run the Project with Safari
```sh
mvn exec:java -Dexec.mainClass="com.gagann.selenium.Main" -Dexec.args="safari"
```

## Conclusion
This project provides a simple and effective demonstration of using Selenium WebDriver for cross-browser testing. It highlights the steps to set up and execute automated tests, ensuring web applications function correctly across different browsers.