package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
        public static WebDriver getdriver (String browserType){

            WebDriver driver = null;

            switch (browserType.toLowerCase()) {


                case "chrome":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;


                case "firefox":

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


                    break;

            }

            return driver;
        }


    }
