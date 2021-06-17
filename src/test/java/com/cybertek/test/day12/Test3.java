package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

    @Test
    public void test3() {
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));

        inputbox.click();

        Assert.assertFalse(inputbox.isDisplayed());
    }
}