package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        //Google title verification
        //open chrome browser
        //set up the browser driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //go to https://www.google.com
        driver.get("https://www.google.com");
        driver.navigate().refresh();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title ver passed");}else{
            System.out.println("title ver failed");
        }
        //verify title
        //expected: Google

    }
}
