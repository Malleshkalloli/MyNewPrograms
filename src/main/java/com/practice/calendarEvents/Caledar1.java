package com.practice.calendarEvents;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Caledar1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();
        List<WebElement> dates =driver.findElements(By.className("flatpickr-day "));
        for (int i=0;i<dates.size();i++){
            String day=driver.findElements(By.className("flatpickr-day ")).get(i).getText();
            if(day=="23"){
                driver.findElements(By.className("flatpickr-day ")).get(i).click();
                break;
            }
        }
    }

}
