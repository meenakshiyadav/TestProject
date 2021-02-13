package com.learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
    }
}
