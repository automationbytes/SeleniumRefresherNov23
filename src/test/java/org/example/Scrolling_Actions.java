package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Scrolling_Actions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.redbus.in/");

        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.linkText("Book Cab / Bus Rental")));
        actions.build().perform();
    }
}
