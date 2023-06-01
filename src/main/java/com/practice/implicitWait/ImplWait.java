package com.practice.implicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplWait {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        String vegetables[]={"Cucumber","Brocolli","Beetroot"};
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        addItems(driver,vegetables);
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


    }
    public static void addItems(WebDriver driver,String[] veg){
            List<WebElement> elements=driver.findElements(By.cssSelector("h4.product-name"));
            List<String> itemsNeeded= Arrays.asList(veg);
            int j=0;
            for(int i=0;i<elements.size();i++){
                j++;
                String item=elements.get(i).getText().split("-")[0].trim();
                if(itemsNeeded.contains(item)){
                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                }
                if(j== veg.length){
                    break;
                }

            }

    }
}

