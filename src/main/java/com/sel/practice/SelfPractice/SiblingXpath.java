package com.sel.practice.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingXpath {
    public static void main(String[] args) {
        //header/div/button[1]/following-sibling::button[1]
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //for parent //header/div/button[1]/parent::div
        //for grand parent //header/div/button[1]/parent::div/parent::header/a
    }
}
