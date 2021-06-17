package com.cybertek.test.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");
        driver.get("http://ebay.com");

        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

        search.click();

        search.sendKeys("selenium");

        WebElement list = driver.findElement(By.cssSelector("#gh-btn"));

        list.click();

        String title = driver.getTitle();

        if(title.contains("selenium")){
            System.out.println("pass");
        }else{
            System.out.println("fails");
        }


    }
}
