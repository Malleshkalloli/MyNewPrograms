package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertBoxHandling {
    public static void main(String[] args) {

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        String text ="Mallesh";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());


        driver.switchTo().alert().dismiss();
    }
}
