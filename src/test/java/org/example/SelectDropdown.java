package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Select countrydropdown = new Select(driver.findElement(By.id("BillingCountryId")));
       // countrydropdown.selectByValue("89");
      //  countrydropdown.selectByVisibleText("India");
        countrydropdown.selectByIndex(11);

        Select PaymentMethoddropdown = new Select(driver.findElement(By.id("PaymentMethodSystemName")));
        PaymentMethoddropdown.selectByIndex(3);

        for (WebElement c: countrydropdown.getOptions()) {
            System.out.println(c.getAttribute("value") + "  " + c.getText());
            //System.out.println(c.getText());
        }

    }
}
