package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframes_Eg {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.findElement(By.cssSelector("a[title=\"Change Orientation\"]")).click();

        //adding switch to
        driver.switchTo().frame("iframeResult");
      //  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Spiderman");
      //  driver.switchTo().alert().accept();
    driver.switchTo().alert().dismiss();

    //switch back to old frame
        driver.switchTo().parentFrame(); //from one

        //more than one and wants to go back to the first
    //    driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[title=\"Change Orientation\"]")).click();


    }
}
