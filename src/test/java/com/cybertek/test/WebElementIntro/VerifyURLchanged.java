package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    public static void main(String[] args) throws InterruptedException {


        //go to browser//
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        //go to URL//
        driver.get("http://practice.cybertekschool.com/forgot_password");



        //enter my mail//

        WebElement emailinputbox = driver.findElement(By.name("email"));

        emailinputbox.sendKeys("mike@smith.com");

        WebElement retreivepassword = driver.findElement(By.id("form_submit"));
        retreivepassword.click();

        Thread.sleep(3000);

        String expectedURL = "http://practice.cybrtekschool.com/email_sents";
        String actualURL = driver.getCurrentUrl();
        //verify that URL changed//
        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
            System.out.println("expectedURL:"+ expectedURL);
            System.out.println("actualURL:"+ actualURL);

        }

    }
}