package com.cybertek.test.day2WebdriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleandUrl {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        //gettingtitle with selenium

        String title = driver.getTitle();
        System.out.println("title ="+ title);


        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
    }
    }

