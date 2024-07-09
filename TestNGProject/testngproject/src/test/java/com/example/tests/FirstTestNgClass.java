package com.example.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNgClass {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.out.println("Setting up the browser");

        // Dynamic setup based on browser version
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void openBrowser() {
        System.out.println("Let's open a browser");
        driver.get("https://www.google.com");
    }

    @Test(priority = 2)
    public void signup() {
        System.out.println("Signing up");
        // Perform signup actions
    }

    @Test(priority = 3)
    public void login() {
        System.out.println("Logging in...");
        // Perform login actions
    }

    @Test(priority = 4)
    public void addToCart() {
        System.out.println("Adding items to cart");
        // Perform add to cart actions
    }

    @Test(priority = 5)
    public void logOut() {
        System.out.println("Logging out");
        // Perform logout actions
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Closing Browser");
        if (driver != null) {
            driver.quit();
        }
    }
}
