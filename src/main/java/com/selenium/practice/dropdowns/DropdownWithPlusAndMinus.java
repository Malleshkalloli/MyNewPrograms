package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DropdownWithPlusAndMinus {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println("element before click "+driver.findElement(By.id("divpaxinfo")).getText());
        int i=1;
        while(i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        System.out.println("element before click "+driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.close();

    }
}
