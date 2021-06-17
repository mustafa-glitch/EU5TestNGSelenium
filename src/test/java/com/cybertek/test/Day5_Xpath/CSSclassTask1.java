package com.cybertek.test.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSSclassTask1 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://amazon.com");

        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


        element.sendKeys("selenium");

        driver.findElement(By.xpath("//input[@type='submit']")).click();



        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String resultText = result.getText();


        System.out.println(resultText);



    }
}
