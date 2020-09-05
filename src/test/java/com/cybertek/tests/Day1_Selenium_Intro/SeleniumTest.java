package com.cybertek.tests.Day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1 - setup the driver
        WebDriverManager.chromedriver().setup();


        //2- create instance of web driver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver2 = new SafariDriver();
        driver.manage().window().maximize();

        //3- use the driver instance to test selenium
       driver.get("http://www.bbc.com");
       // driver2.get("https://www.twitter.com");
        System.out.println(" title is: " + driver.getTitle());
String actualTitle = driver.getTitle();
        System.out.println("actual title string : " + actualTitle);
        String actualURL = driver.getCurrentUrl();
        System.out.println("actual URL " + actualURL);
   Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep((1000));
        driver.navigate().to("https://www.fbi.gov");
        Thread.sleep((1000));
        driver.navigate().refresh();
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = "+ pageSource);
driver.close();
driver.quit();
    }
}
