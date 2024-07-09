# TestNG Example Project

## Introduction

This repository contains an example project demonstrating the use of TestNG, a popular testing framework for Java. TestNG is inspired by JUnit and NUnit, but introduces new functionalities that make it a more powerful and flexible tool for testing.

## What is TestNG?

TestNG (Test Next Generation) is a testing framework designed to simplify a broad range of testing needs, from unit testing to integration testing. It is open-source and provides numerous features to make testing easier and more structured.

## Why Use TestNG?

### Annotations
TestNG uses annotations to control the execution of tests. These annotations make the code easier to understand and maintain. Here are some commonly used annotations:

- `@BeforeTest`: Method annotated with this will run before any test method belonging to the classes inside the <test> tag is run.
- `@Test`: The main annotation used for marking a method as a test case.
- `@AfterTest`: Method annotated with this will run after all the test methods belonging to the classes inside the <test> tag have run.

### Advantages of TestNG Annotations

1. **Flexibility in Test Execution Order**: By using the `priority` attribute in the `@Test` annotation, you can define the order in which tests should run.
2. **Setup and Teardown**: The `@BeforeTest` and `@AfterTest` annotations help in setting up preconditions and cleaning up after tests, respectively.
3. **Grouping Tests**: You can group multiple tests into a named group and run them together.
4. **Data-Driven Testing**: TestNG supports parameterized tests, allowing the same test method to run multiple times with different data sets.
5. **Parallel Execution**: TestNG can run tests in parallel, reducing the overall time taken for test execution.

### Dynamic Browser Setup

Using WebDriverManager, we can set up different browsers dynamically without the need to manually download the WebDriver binaries. This makes the code more flexible and easier to maintain.

### Example Test Workflow

1. **Setup Browser**: Configure and start the browser before tests.
2. **Open Browser**: Navigate to a specified URL.
3. **Signup and Login**: Perform signup and login actions to simulate user interactions.
4. **Add to Cart**: Add items to the cart to test the shopping functionality.
5. **Logout**: Perform logout actions to complete the user session.
6. **Teardown**: Close the browser and clean up resources after all tests have run.

## Conclusion

TestNG is a powerful tool for automating tests in Java, providing flexibility and ease of use through its annotations and features. By organizing tests using TestNG, you can create a robust and maintainable test suite for your projects.

## Getting Started

1. **Clone the repository**: `git clone <repository-url>`
2. **Install dependencies**: Ensure you have the necessary dependencies in your `pom.xml` or `build.gradle` file.
3. **Run the tests**: Execute the tests using your preferred IDE or build tool.

## Useful Resources

- [TestNG Documentation](https://testng.org/doc/)
- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)