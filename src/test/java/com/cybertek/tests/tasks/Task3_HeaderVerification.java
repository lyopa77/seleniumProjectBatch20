package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.navigate().refresh();

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.tagName("h2")).getText();
        System.out.println("expected header: " + expectedHeader);
        System.out.println("actual header: " + actualHeader);
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");

        }
    }}
