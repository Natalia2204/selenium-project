package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //Setting up our chromedriver using WebDriverManager
        //WebDriverManager.chromedriver().setup();

        //Creating a new ChromeDriver and storing it in "driver"
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://google.com
        driver.get("https://google.com");

        //3. Click to Gmail from top right.

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));//поиска веб-элемента

        gmailLink.click();// click to Gmail link

        //4. Verify title contains:Expected: Gmail

        String gmailexpectedTitle = "Gmail";
        String gmailactualTitle = driver.getTitle();

        //System.out.println("actualTitle = " + actualTitle);

        if (gmailactualTitle.contains(gmailexpectedTitle)) {
            System.out.println("Gmail Title verifications PASSED!");
        } else
            System.out.println("Gmail Title verifications FAILED!");

        //5- Go back to Google by using the.back();

        driver.navigate().back();

        //6- Verify title equals:Expected: Googl

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)) {
            System.out.println("Google Title verifications PASSED!");
        } else
            System.out.println("Google Title verifications FAILED!");

        driver.close();


    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Googl
 */