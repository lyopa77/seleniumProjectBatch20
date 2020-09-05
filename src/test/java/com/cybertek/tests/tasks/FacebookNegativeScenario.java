package com.cybertek.tests.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNegativeScenario {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        driver.navigate().refresh();
        driver.findElement(By.name("email")).sendKeys("lyopa"+ Keys.TAB);
        driver.findElement(By.name("pass")).sendKeys("apple"+ Keys.ENTER);
        driver.getTitle();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook | Facebook";
        System.out.println("Actual title: " + actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("pass");}else{
            System.out.println("fail");}




    }
}
