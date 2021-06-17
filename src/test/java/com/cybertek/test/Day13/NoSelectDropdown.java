package com.cybertek.test.Day13;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.ListIterator;

public class NoSelectDropdown {

    @Test

    public void test1(){
        WebDriver driver= WebDriverFactory.getdriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElemt = driver.findElement(By.id("dropdownMenuLink"));

        //click the dropdown to see available options//
        dropdownElemt.click();

        List<WebElement> dropdownoptions = (List<WebElement>) driver.findElement(By.className("dropdown-item"));

        System.out.println(dropdownoptions.size());

        //print one by one//

        for (WebElement option : dropdownoptions) {

            System.out.println(option.getText());
            //click yahoo//
            dropdownoptions.get(2);


        }

    }
}
