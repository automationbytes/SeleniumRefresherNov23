package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JavascriptExe {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//driver.findElement(By.xpath("//span[text()='Bike Body Covers']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Bike Body Covers']")));


    }
}
