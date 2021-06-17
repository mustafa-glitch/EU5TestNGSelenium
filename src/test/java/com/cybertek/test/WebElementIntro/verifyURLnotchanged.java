package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotchanged {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getdriver("firefox");

        driver.get("http://practice.cybertek.com/forgotpassword");

        String expectedURL = driver.getCurrentUrl();


        WebElement retreivepassword = driver.findElement(By.id("form_submit"));

        retreivepassword.click();

        String actualURL = driver.getCurrentUrl();


        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("false");


            driver.quit();

        }
    }
}
