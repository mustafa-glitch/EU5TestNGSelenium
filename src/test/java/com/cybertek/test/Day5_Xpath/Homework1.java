package com.cybertek.test.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getdriver("chrome");
        driver.get("http://ebay.com");

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

        search.click();

        search.sendKeys("selenium");

        WebElement list = driver.findElement(By.xpath("//input[@value='Search']"));

        list.click();

       WebElement result = driver.findElement(By.xpath("//h1"));

       System.out.println(result.getText());

       String resulttext = result.getText();

       String[] resultarray = resulttext.split(" ");

       System.out.println(resultarray[0]);




    }
}