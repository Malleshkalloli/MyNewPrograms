package com.practice.calendarEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MakeMyTripCalendarSelect {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("onward_cal")).click();
        while(!driver.findElement(By.xpath("//*[@class='rb-monthHeader']")).getText().contains("Dec 2023")){
            driver.findElement(By.xpath("//*[@class='next']")).click();
        }

        List<WebElement> dates =driver.findElements(By.xpath("//*[@class='wd day']"));
        for(int i=0;i<dates.size();i++){
            String day=driver.findElements(By.xpath("//*[@class='wd day']")).get(i).getText();
            if(day.equals("25")){
                driver.findElements(By.xpath("//*[@class='wd day']")).get(i).click();
                break;
            }
        }


    }
}
