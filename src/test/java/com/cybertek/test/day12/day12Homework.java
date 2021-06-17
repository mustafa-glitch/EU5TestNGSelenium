package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day12Homework {

    @Test

    public void test1(){



        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement message = driver.findElement(By.cssSelector("#txtAge"));
        Assert.assertFalse(message.isDisplayed(),"message is not displayed");

        message.click();

        Assert.assertTrue(message.isSelected()," verify 'Success - Check box is checked'");
    }

    @Test

    public void tes2(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllBtn = driver.findElement(By.id("check1"));

        Assert.assertEquals(checkAllBtn.getAttribute("value"), "Check All");

        checkAllBtn.click();
        //5.Verify all check boxes are checked
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).isSelected());


        Assert.assertEquals(checkAllBtn.getAttribute("value"),"Uncheck All");
    }
}
