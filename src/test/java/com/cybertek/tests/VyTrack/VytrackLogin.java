package com.cybertek.tests.VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VytrackLogin {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");

        driver.manage().window().maximize();

        driver.findElement(By.name("_username")).sendKeys("user177" + Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("_password")).sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(1000);

        String actualTitle = "Dashboard";
        String expectedtitle = driver.getTitle();


        if (actualTitle.equals(expectedtitle)) {
            System.out.println("login passed");
        } else {
            System.out.println("login failed!");
        }

    }}
