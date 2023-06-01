package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;

public class greenCart {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String vegetables[]={"Cucumber","Brocolli","Beetroot"};
        List<WebElement> elements= driver.findElements(By.xpath("//h4[@class='product-name']"));
        int j=0;
        for(int i=0;i<elements.size();i++){
            List itemsNeeded= Arrays.asList(vegetables);
            String item[]=elements.get(i).getText().split("-");
            String formattedName=item[0].trim();
            if(itemsNeeded.contains(formattedName)){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==vegetables.length){
                    break;
                }
            }

        }


    }
}
