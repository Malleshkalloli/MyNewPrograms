package com.practice.implicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait{
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokup.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("[id='start'] button")).click();
       // Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimout()
    }
}
