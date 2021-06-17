package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class displayedDemo {
    @Test
    public void displayedDemo(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        WebElement button = driver.findElement(By.id("username"));

        System.out.println("button is displayed"+ button.isDisplayed());

        Assert.assertFalse(button.isDisplayed(),"verify input is not displayed");

        driver.findElement(By.cssSelector("#start>button")).click();



        Assert.assertTrue(button.isDisplayed(),"verify it is displayed");








    }
}
