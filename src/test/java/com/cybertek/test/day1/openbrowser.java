package com.cybertek.test.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {
    public static void main(String[] args) {


                WebDriverManager.chromedriver().setup();
                WebDriver driver = new FirefoxDriver();
                driver.get("https://www.youtube.com/");
    }

}
