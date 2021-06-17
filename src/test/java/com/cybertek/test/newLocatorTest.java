package com.cybertek.test;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newLocatorTest {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();


        driver.get("https://practice.cybertekschool.com/sign_up");




        WebElement fullname = driver.findElement(By.name("full_name"));

        fullname.sendKeys("mike smith");

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys("mike@smith.com");

        WebElement login = driver.findElement(By.className("radius"));
        login.click();




    }
}
