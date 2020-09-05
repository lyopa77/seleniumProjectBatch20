package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task4_HeaderVerification {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.navigate().refresh();
        WebElement header = driver.findElement(By.id("a"));
        String actualResult = header.getAttribute("registration form");
        System.out.println(actualResult);



}}
