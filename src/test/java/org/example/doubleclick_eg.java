package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class doubleclick_eg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")));
//        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']")));
//        actions.click(driver.findElement(By.xpath("//span[text()='Copy']")));

        actions.pause(Duration.ofSeconds(120));
        actions.build().perform();




     //   driver.switchTo().alert().accept();
    }
}
