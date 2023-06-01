package com.practice.javaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class ScrollToElement
{
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        javascriptExecutor.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        List<WebElement> elements =driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
        int sum=0;
        for (int i=0;i<elements.size();i++){
            String val=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]")).get(i).getText();
            sum=sum+Integer.parseInt(val);
        }
        System.out.println("sum of numbers is "+sum);
           String value= driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
        Assert.assertEquals(sum,Integer.parseInt(value));



    }
}
