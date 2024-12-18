package com.performanceTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class CaptureRenderingTime {

    public static long capturePageRenderingTime(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
        long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");

        driver.quit();

        // Calculate the frontend load time
        return loadEventEnd - navigationStart;
    }

    public static void main(String[] args) {
        String url = "http://example.com"; // Replace with the target URL
        long renderingTime = capturePageRenderingTime(url);
        System.out.println("Page rendering time: " + renderingTime + " ms");
    }
}
