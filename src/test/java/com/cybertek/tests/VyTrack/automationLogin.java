package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class automationLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();// this line is opening me the browser
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user177");
        Thread.sleep(2000);
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        Thread.sleep(2000);
        driver.findElement(By.name("_submit")).click();
    }}
