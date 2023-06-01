package com.practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();   //[parentWindow,childwindow]
        Iterator<String> it =windows.iterator();
        String parentWindow = it.next();
        String childWindow  =it.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(email);
       // Please email us at mentor@rahulshettyacademy.com with below template to receive response
    }
}
