package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4GoogleSearch {
    public static void main(String[] args) {
        //1-Open	a	chrome	browser

        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2-Go	to:	https://google.com
        driver.get("https://google.com");

        // 3-Write	“apple”	in	search
        //I need to locate search box and use sendKeys method
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("title passed");}else{
            System.out.println("title failed");
        }

        // box4-Click	google	search	button5-Verify	title:Expected:
        // Title	should	start	with	“apple”	*/

    }
}
