package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Checkbox_Eg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node05av0jhf006sgp7i02462uv5w687032.node0");

        driver.findElement(By.xpath("//label[text()='Java']")).click();
    }
}
