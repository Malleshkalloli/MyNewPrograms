package com.practice.SSLCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver =new ChromeDriver();
        SoftAssert a =new SoftAssert();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for (WebElement element: links){
            String url =element.getAttribute("href");
            HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respCode = connection.getResponseCode();
            System.out.println(respCode);

            a.assertTrue(respCode<400, "The link with Text -"+element.getText()+" is broken with code" +respCode);
        }
        a.assertAll();
//        String url=driver.findElement(By.cssSelector("a[href='brokenlink']")).getAttribute("href");
//        HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
//        connection.setRequestMethod("HEAD");
//        connection.connect();


    }
}
