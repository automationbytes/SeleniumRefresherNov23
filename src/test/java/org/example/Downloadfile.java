package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;

public class Downloadfile {
    public static void main(String[] args) throws InterruptedException {
        String path = System.getProperty("user.dir")+"\\downloads";
        System.out.println(path);

        HashMap<String, Object> pref = new HashMap<>();
        pref.put("download.default_directory",path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",pref);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://leafground.com/file.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//span[text()='Download']")).click();

        Thread.sleep(2000);
        File file = new File(path+"\\TestLeaf Logo.png");
        if(file.exists()){
            System.out.println("File Found");
        }
    }
}
