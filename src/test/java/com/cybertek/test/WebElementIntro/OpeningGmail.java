package com.cybertek.test.WebElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpeningGmail {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://www.youtube.com/");

        WebElement login = driver.findElement(By.id("search"));
        login.click();

        login.sendKeys("java");

        WebElement search = driver.findElement(By.id("search-icon-legacy"));

       search.click();

       WebElement video = driver.findElement(By.className("style-scope yt-img-shadow"));

       video.click();



    }
}
