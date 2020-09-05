package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3_NavigationsAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().refresh();
        driver.findElement(By.linkText("Gmail")).click();
String expectedTitle = "Gmail";
String actualTitle = driver.getTitle();
if (actualTitle.contains(expectedTitle)){
    System.out.println("Gmail title ver pass");}else{
    System.out.println("Gmail title ver fail");
}
driver.navigate().back();
String expectedGoogleTitle = "Google";
String actualGoogleTitle = driver.getTitle();

if(actualGoogleTitle.equals(expectedGoogleTitle)){
    System.out.println("Google title ver passed");}else
{
    System.out.println("Google title ver failed");
}

    }
}
