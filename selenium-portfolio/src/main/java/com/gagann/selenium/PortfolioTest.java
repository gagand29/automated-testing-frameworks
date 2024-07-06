package com.gagann.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class PortfolioTest {

    public void runTest(String browser) {
        WebDriver driver = null;

        // Setup WebDriver based on the specified browser
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().browserVersion("126.0.6478.127").setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "safari":
                // Ensure Safari's Remote Automation is enabled
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Browser not supported: " + browser);
                return;
        }

        try {
            // Make the browser window fullscreen
            driver.manage().window().maximize();

            // Navigate to your portfolio
            driver.get("https://www.gagann.com");

            // Print the title of the home page
            System.out.println("Title of the home page is: " + driver.getTitle());

            // Wait for 5 seconds to allow the page to load completely
            Thread.sleep(5000);

            // Wait until the Explore-work button is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement exploreWorkButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("Explore-work")));

            // Scroll the Explore-work button into view
            Actions actions = new Actions(driver);
            actions.moveToElement(exploreWorkButton);
            actions.perform();

            // Click the Explore-work button
            exploreWorkButton.click();

            // Print the title of the Explore Work section
            System.out.println("Title after clicking Explore-work: " + driver.getTitle());

            // Wait for 5 seconds to view the Explore Work section
            Thread.sleep(5000);

            // Navigate back to the home page
            driver.navigate().back();

            // Print the title of the home page after navigating back
            System.out.println("Title of the home page after navigating back: " + driver.getTitle());

            // Wait for 5 more seconds to view the home page
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
