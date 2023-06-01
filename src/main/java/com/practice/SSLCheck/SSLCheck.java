package com.practice.SSLCheck;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class SSLCheck
{
    public static void main(String[] args) {
        ChromeOptions chromeOptions =new ChromeOptions();
        Proxy proxy =new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        chromeOptions.setCapability("proxy", proxy);
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        chromeOptions.setExperimentalOption("prefs", prefs);
        // FirefoxOptions options1 = new FirefoxOptions();
       // options1.setAcceptInsecureCerts(true);
        // EdgeOptions options2 = new EdgeOptions();

        chromeOptions.setAcceptInsecureCerts(true);

        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());
    }
}
