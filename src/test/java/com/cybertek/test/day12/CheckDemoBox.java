package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckDemoBox {

    @Test

    public void test4(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));

        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox2.isSelected());

        //how to check checkboxes//
        checkbox1.click();

    }
}
