package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.xpath("//a[@value='IXG']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

       // to avoid indexes in xpath
        ////div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXG']
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXG']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();


    }
}
