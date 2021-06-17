package com.cybertek.test.day12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElements {

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement  greenradiobuttons = driver.findElement(By.id("green"));

        greenradiobuttons.click();

        //how to check if element is disabled or enabled//

        System.out.println("greenbuttons is:"+greenradiobuttons.isEnabled());

        greenradiobuttons.click();

        driver.quit();


    }




}
