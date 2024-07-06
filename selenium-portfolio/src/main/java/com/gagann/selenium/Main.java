package com.gagann.selenium;

public class Main {
    public static void main(String[] args) {
        // Default to Chrome if no browser is specified
        String browser = "chrome";
        if (args.length > 0) {
            browser = args[0];
        }

        // Create an instance of PortfolioTest and run the test
        PortfolioTest portfolioTest = new PortfolioTest();
        portfolioTest.runTest(browser);
    }
}
