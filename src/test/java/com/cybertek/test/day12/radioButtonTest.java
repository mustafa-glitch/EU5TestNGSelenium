package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class radioButtonTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating elements on buttons//

        WebElement bluebutton = driver.findElement(By.cssSelector("#blue"));
        WebElement redbutton = driver.findElement(By.cssSelector("#red"));

        System.out.println("blue button is selected"+ bluebutton.isSelected());
        System.out.println("red button is selected"+ redbutton.isSelected());

        redbutton.click();

        Assert.assertTrue(bluebutton.isSelected(),"verify that blue is selected");

        Assert.assertFalse(redbutton.isSelected(),"verify red is not selected");

        //how to click redbutton//



        driver.quit();


    }


}
