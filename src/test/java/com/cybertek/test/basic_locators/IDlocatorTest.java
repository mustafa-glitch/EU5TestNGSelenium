package com.cybertek.test.basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDlocatorTest {
    public static void main(String[] args) {

        WebDriver driver =  WebDriverFactory.getdriver("chrome");

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        WebElement dontclickbutton = driver.findElement(By.id("disappearing_button"));

        dontclickbutton.click();
    }
}