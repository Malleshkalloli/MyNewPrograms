package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingTextBoxAndGettingSizeWithThem {

    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
