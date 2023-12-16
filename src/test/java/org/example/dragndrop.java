package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragndrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.xpath("//span[text()='50L']/parent::span")),driver.findElement(By.xpath("//span[text()='125L']/parent::span")));
        actions.build().perform();

    }
}
