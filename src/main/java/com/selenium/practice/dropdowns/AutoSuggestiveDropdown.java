package com.selenium.practice.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver  driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> webElementList = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement webElement:webElementList){
            if(webElement.getText().equalsIgnoreCase("india")){
                webElement.click();
                break;
            }
        }
    }
}
