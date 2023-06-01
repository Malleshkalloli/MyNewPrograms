package com.practice.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println("Counts are"+driver.findElements(By.tagName("a")).size());
        WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement element =driver.findElement(By.xpath("//table/tbody/tr[1]/td/ul"));
        System.out.println(element.findElements(By.tagName("a")).size());
        for(int i=1;i<element.findElements(By.tagName("a")).size();i++){
            String ctrl=Keys.chord(Keys.COMMAND,Keys.ENTER);
            element.findElements(By.tagName("a")).get(i).sendKeys(ctrl);

        }
        Set<String> windows =driver.getWindowHandles();
        Iterator<String> itr=windows.iterator();
        while (itr.hasNext()){
            driver.switchTo().window(itr.next());
            System.out.println(driver.getTitle());
        }
    }
}
