package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ContextClick_Actions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']")));
        actions.click(driver.findElement(By.xpath("//span[text()='Copy']")));

        actions.build().perform();

        driver.switchTo().alert().accept();
    }
}
