package com.cybertek.test.Day13;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {

    WebDriver driver;
    @BeforeMethod

    public void setup(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");



    }
    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/windows");

        //title//
        System.out.println("title before new window"+driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("after click new window"+driver.getTitle());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

    }

}
