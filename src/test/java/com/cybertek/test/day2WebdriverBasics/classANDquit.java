package com.cybertek.test.day2WebdriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classANDquit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertek");

        driver.close();
        driver.get("https://practice.cybertek/open_new_tab");

        Thread.sleep(5000);

        driver.quit();

        driver = new ChromeDriver();
        driver.get("https://coursecbertek.com");

        Thread.sleep(5000);


    }
}
