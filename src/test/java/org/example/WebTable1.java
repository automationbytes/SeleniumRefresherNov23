package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WebTable1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Select pageSize = new Select(driver.findElement(By.name("products-grid_length")));
        pageSize.selectByVisibleText("100");

        Thread.sleep(5000);

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='products-grid']//tr"));
        int rowsize = row.size();
        String productName = "";
        for (int i = 1;i<rowsize;i++){
            productName = driver.findElement(By.xpath("//table[@id='products-grid']//tr["+i+"]/td[3]")).getText();
            System.out.println(productName);
            if(productName.equals("Nokia Lumia 1020")){
                driver.findElement(By.xpath("//table[@id='products-grid']//tr["+i+"]/td[8]/a")).click();
                break;
            }
        }


    }
}
