package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// Open Chrome browser2.
// Go to https://www.facebook.com3.
// Verify title: Expected: “Facebook -Log In or Sign Up”
// TC #2: Facebook incorrect login title verification
// 1.Open Chrome browser
// 2.Go to https://www.facebook.com
// 3.Enter incorrect username
// 4.Enter incorrect password
// 5.Verify title changed to: Expected: “Log into Facebook | Facebook
public class FacebookTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*    public void get(String s) {

            }

            public String getCurrentUrl() {
                return null;
            }

            public String getTitle() {
                return null;
            }

            public List<WebElement> findElements(By by) {
                return null;
            }

            public WebElement findElement(By by) {
                return null;
            }

            public String getPageSource() {
                return null;
            }

            public void close() {

            }

            public void quit() {

            }

            public Set<String> getWindowHandles() {
                return null;
            }

            public String getWindowHandle() {
                return null;
            }

            public TargetLocator switchTo() {
                return null;
            }

            public Navigation navigate() {
                return null;
            }

            public Options manage() {
                return null;
            }
    */
             driver.get("https://facebook.com");
             driver.navigate().refresh();
             driver.getTitle();
             String actualTitle = driver.getTitle();
             String expectedTitle = "Facebook - Log In or Sign Up";

             if (actualTitle.equals(expectedTitle)){
                 System.out.println("pass");}else {
                 System.out.println("fail");

             }


        System.out.println("Actual Title: " + actualTitle);

    }
}
