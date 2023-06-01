package com.sel.practice.SelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().to("https://rahulshettyacademy.com");

        driver.navigate().back();

        driver.navigate().forward();
    }
}
