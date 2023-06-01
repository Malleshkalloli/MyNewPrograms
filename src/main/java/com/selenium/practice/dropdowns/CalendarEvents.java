package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CalendarEvents {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@text='Belagavi (IXG)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active]")).click();

        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

        {

            System.out.println("its enabled");

            Assert.assertTrue(true);

        }

        else

        {

            Assert.assertTrue(false);

        }



    }
}
