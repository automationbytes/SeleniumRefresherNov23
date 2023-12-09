package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

       // driver.findElement(By.id("email")).sendKeys("values to send");


        driver.findElement(By.id("email")).sendKeys("Tom");
        driver.findElement(By.name("pass")).sendKeys("admin123");
        //driver.findElement(By.name("login")).click();
//driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("Forgotten")).click();
   //     driver.close(); //closes the browser current browser

//        driver.quit(); //closes the browser and also the driver instance

    }
}
