package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerıfyConfırmMessage {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox  = driver.findElement(By.name("email"));

        String expectedmail;
        expectedmail = "mike@smith.com";
        emailInputBox.sendKeys(expectedmail);

        String actualemail = emailInputBox.getAttribute("value");

        System.out.println("actualemail = " + actualemail);

        if(expectedmail.equals(actualemail)) {
            System.out.println("PASS");

        }else{
            System.out.println("fail");

            WebElement retrievepasswordButton = driver.findElement( By.id("form_submit"));
            retrievepasswordButton.click();

            //verify that your email message says " your message has been sent"//

            WebElement actualconfirmationmessage = driver.findElement(By.name("confrimationmessage"));

            System.out.println(actualconfirmationmessage.getText());

            if(expectedmail.equals(actualemail)){
                System.out.println("amuha soqtuum");

            }else{
                System.out.println("Yarrrak gecti tesin");

            }
            System.out.println("actualmail"+actualemail);
            System.out.println("expected mail:"+expectedmail);



        }

    }
}
