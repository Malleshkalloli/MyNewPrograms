package com.sel.practice.SelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SelfDriver {
    public static void main(String[] args) {
//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--remote-allow-origins=*");
       // System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");

        FirefoxOptions fo =new FirefoxOptions();
        fo.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.gecko.driver","/Users/mallesh.kalloli/Desktop/geckodriver");
       // WebDriver driver =new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }
}
