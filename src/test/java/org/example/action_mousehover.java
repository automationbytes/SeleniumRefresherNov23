package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class action_mousehover {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Automotives']")));
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Bike Body Covers']")));
        actions.click(driver.findElement(By.xpath("//span[text()='Bike Body Covers']")));
      actions.build().perform();
    }
}
