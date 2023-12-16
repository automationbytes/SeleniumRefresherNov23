package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class clicknHold_eg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//span[text()='50L']/parent::span")));
        actions.release(driver.findElement(By.xpath("//span[text()='125L']/parent::span")));
        actions.build().perform();

    }
}
