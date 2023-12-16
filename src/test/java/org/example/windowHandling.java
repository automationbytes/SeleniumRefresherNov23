package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class windowHandling {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Instagram")).click();
        driver.findElement(By.linkText("Meta Pay")).click();
        driver.findElement(By.linkText("Meta Store")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        String ParentWindow = driver.getWindowHandle(); //facebook url's pid
        Set<String> AllOpenWindow = driver.getWindowHandles(); //it will store all 4 open windows; which includes parent window too

        for (String a : AllOpenWindow){
            if (!a.equals(ParentWindow)){
                driver.switchTo().window(a);
                Thread.sleep(10000);
                System.out.println(driver.getTitle() + "   "+ driver.getCurrentUrl());
                if(driver.getTitle().equals("Instagram")){
driver.findElement(By.name("username")).sendKeys("helloinsta");
                }else {
                    driver.close();
                }


            }
        }

    }
}
