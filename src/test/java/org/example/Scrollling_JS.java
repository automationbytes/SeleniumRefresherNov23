package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrollling_JS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.redbus.in/");

        WebElement scrollelement = driver.findElement(By.linkText("Book Cab / Bus Rental"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",scrollelement);

       // js.executeScript("window.scrollBy(0,2000);");
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(15000);
                js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");

    }
}
