package com.practice.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http:jqueryui.com/droppable");
       // driver.switchTo().frame(1);
        System.out.println(driver.findElements(By.tagName("iframe")).size());
       // driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions actions = new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement destination= driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source,destination).build().perform();
        driver.switchTo().defaultContent();

    }
}
