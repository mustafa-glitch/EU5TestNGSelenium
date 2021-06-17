package com.cybertek.test.day2WebdriverBasics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallWebDriver {

    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        ;

        WebDriver driver = WebDriverFactory.getdriver("firefox");


        driver.get("https://google.com");



    }
}
