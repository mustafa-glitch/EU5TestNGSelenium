package com.cybertek.test.Review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jamalreview {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

         driver.navigate().to("https://www.facebook.com");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }
}
