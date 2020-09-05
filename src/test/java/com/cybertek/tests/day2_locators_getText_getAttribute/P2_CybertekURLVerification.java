package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        //Cybertek verifications
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("http://practice.cybertekschool.com");
  //verify URL contains 'cybertekschool'
   String expectedURL = "cybertekschool";

   String actualURL = driver.getCurrentUrl();
   if (actualURL.contains(expectedURL)){
       System.out.println("URL verification passed");}else{
       System.out.println("URL verification failed");
   }
if (driver.getTitle().equalsIgnoreCase("practice")){
    System.out.println("pass");}else{
    System.out.println("fail");
}
    }
}
