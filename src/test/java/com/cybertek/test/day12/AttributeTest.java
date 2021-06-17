package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class AttributeTest {

    @Test
            public void test5() {
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox = driver.findElement(By.xpath("//input[2]"));

        checkbox.click();

      String outerHTML = checkbox.getAttribute("innerHTML");

        Assert.assertTrue(outerHTML.contains("button2"));

    }

}
