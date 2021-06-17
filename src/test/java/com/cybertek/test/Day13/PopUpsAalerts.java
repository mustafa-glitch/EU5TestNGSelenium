package com.cybertek.test.Day13;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpsAalerts {
    WebDriver driver;
    @BeforeMethod

    public void setup(){
         driver = WebDriverFactory.getdriver("chrome");



    }



    @Test

    public void test1(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //click the destroy the world button//
        driver.findElement(By.id("j_idt302:j_idt303")).click();

    }

    @Test
    public void tes2(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click jsalert//

        driver.findElement(By.xpath("//button[1]")).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys("mikesmith");

        alert.dismiss();


    }

}
