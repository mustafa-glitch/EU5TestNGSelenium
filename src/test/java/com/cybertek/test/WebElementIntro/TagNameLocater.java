package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocater {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement clickadvanced = driver.findElement(By.id("body"));
        clickadvanced.click();

        WebElement unsafe = driver.findElement(By.className("ssl"));
        unsafe.click();

        WebElement fullname = driver.findElement(By.tagName("input"));
        fullname.sendKeys("mike smith with tagname");

        WebElement emailinput = driver.findElement(By.name("email"));

        emailinput.sendKeys("mike@smith.com");

        driver.findElement(By.tagName("button")).click();




    }
}
