package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/file.xhtml");

        driver.findElement(By.id("j_idt88:j_idt89_input")).sendKeys("C:\\DevLabs\\NovBatch2023\\Selenium_Nov2023\\redbus.png");
    }
}
