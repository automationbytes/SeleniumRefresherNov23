package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ListDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("src")).sendKeys("Ch");

        List<WebElement> source = driver.findElements(By.xpath("//ul//text"));
        for (WebElement s: source) {
            System.out.println(s.getText());
            if(s.getText().equals("Chandigarh")){
                s.click();
                break;
            }
        }


      //  driver.findElement(By.id("dest")).click();
        driver.findElement(By.id("dest")).sendKeys("Bang");
        List<WebElement> dest = driver.findElements(By.xpath("//ul//text"));
        for (WebElement d : dest){
            System.out.println(d.getText());
            if (d.getText().contains("Gottigere")){
                d.click();
                break;
            }
        }
    }
}
