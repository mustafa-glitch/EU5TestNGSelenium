package com.cybertek.test;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day13FindElements {

    WebDriver driver;
    @BeforeMethod

    public void setup(){
        WebDriver driver = WebDriverFactory.getdriver("chrome");



    }

    @AfterMethod

    public void teardown() {

       driver.quit();
    }

    @Test

    public void Test1(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //save out webelements inside the list//

        List<WebElement>buttons=driver.findElements(By.tagName("button"));

        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(),6,"verify buttons size");

        for (WebElement button : buttons) {

            System.out.println(button.isDisplayed());

            Assert.assertTrue(button.isDisplayed(),"verify buttons are displayed");




        }

    }
    @Test

    public void tes2(){


    }

}
