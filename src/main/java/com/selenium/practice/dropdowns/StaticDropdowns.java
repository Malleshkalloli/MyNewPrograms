package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement element =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select =new Select(element);
        select.selectByIndex(3);
        System.out.println("Hi "+select.getFirstSelectedOption().getText());
        select.selectByValue("INR");
        System.out.println("Hi "+select.getFirstSelectedOption().getText());
        select.selectByVisibleText("AED");
        System.out.println("Hi ho "+select.getFirstSelectedOption().getText());
    }
}
