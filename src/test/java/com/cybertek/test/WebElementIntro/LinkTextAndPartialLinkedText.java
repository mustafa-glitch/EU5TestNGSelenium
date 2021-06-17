package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkedText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://practice.cybertekschool.com/dynamic_testing");

        WebElement link1 = driver.findElement(By.linkText("Example1: Element on page that is hidden and become visible after trigger."));

        link1.click();

    }
}
