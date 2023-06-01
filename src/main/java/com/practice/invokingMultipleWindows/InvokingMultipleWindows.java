package com.practice.invokingMultipleWindows;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class InvokingMultipleWindows
{
    public static void main(String[] args) throws IOException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it=handles.iterator();
        String parentWindowId=it.next();
        String childWindowId=it.next();
        driver.switchTo().window(childWindowId);
        driver.get("https://www.rahulshettyacademy.com/");
        String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));
        System.out.println("Hi width "+name.getRect().getDimension().getWidth());
        System.out.println("Hi Height "+name.getRect().getDimension().getHeight());
    }
}
