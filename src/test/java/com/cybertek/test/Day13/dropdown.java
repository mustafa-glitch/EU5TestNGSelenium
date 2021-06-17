package com.cybertek.test.Day13;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;

public class dropdown {

    public void Test1() {
       WebDriver driver= WebDriverFactory.getdriver("chrome");

       driver.get("http://practice.cybertekschool.com/dropdown");
       //locate your dropdown just like any other webelemnent with unique locator//

        WebElement dropdown = driver.findElement(By.id("state"));

        Select statedropdown = new Select(dropdown);

        List<WebElement> states = statedropdown.getOptions();

        ///print size of options//
        System.out.println(states.size());

        for (WebElement option : states) {
            System.out.println(option.getText());

            //verify that first selected is select a state//

            String expectedresult = "select a state";
            String actualresult = statedropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(actualresult,expectedresult,"verify first is selected");


            //how to select options from drowdown//

            //1 select using visible text//

            statedropdown.selectByVisibleText("virginia");

            String expectedresul = "virginia";
            String actresult = statedropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(expectedresul,actresult,"verify they are match");


            //2 select using index//

            statedropdown.deselectByIndex(51);

            String expectedoption = "wyoming";

            String actualoption = statedropdown.getFirstSelectedOption().getText();
            Assert.assertEquals(expectedoption,actualoption,"verify they are equal");

            //select by value//

            statedropdown.selectByValue("TX");

        }

    }
}