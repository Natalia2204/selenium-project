package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_PracticePageLogin {
    public static void main(String[] args) {
        // 1. Open Chrome browser

        WebDriver driver = new ChromeDriver();
        // 2. Go to https://practice.cydeo.com/login

        driver.get("https://practice.cydeo.com/login");

        // 3. Enter username: "tomsmith"
        WebElement inputUsername = driver.findElement(By.name("username"));
        inputUsername.sendKeys("tomsmith");

        // 4. Enter password: "SuperSecretPassword"

        WebElement inputPassword = driver.findElement(By.name("password"));
       // WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("SuperSecretPassword");

        // 5. Click to Login button

        WebElement loginButton = driver.findElement(By.id("wooden_spoon"));
        loginButton.click();

        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"

        String expectedText = "You logged into a secure area!";
        String actualText = driver.findElement(By.xpath("//div[@class='flash success']")).getText();


        System.out.println(actualText);
        if(actualText.contains(expectedText)){
            System.out.println("Text verification passed!");
        }else {
            System.out.println("Text verification FAILED");
        }

        driver.quit();
    }
}
/*
// TC#2: Practice page Login test

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/login
    // 3. Enter username: "tomsmith"
    // 4. Enter password: "SuperSecretPassword"
    // 5. Click to Login button
    // 6. Verify text displayed on page
    //    Expected: "You logged into a secure area!"
 */