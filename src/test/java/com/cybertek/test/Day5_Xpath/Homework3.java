package com.cybertek.test.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://wikipedia.org");

        WebElement element= driver.findElement(By.id("searchInput"));


        element.sendKeys("selenium webdriver");

        WebElement search = driver.findElement(By.xpath("//i[.='Search']"));

        search.click();

        WebElement dokan = driver.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']"));

        dokan.click();

        String verify = driver.getCurrentUrl();

        System.out.println(verify);

       String[] s = verify.split("/");

       if(s[s.length-1].equals("Selenium_(software)")){
           System.out.println("pass");
       }else{
           System.out.println("fail");
       }

    }
}
