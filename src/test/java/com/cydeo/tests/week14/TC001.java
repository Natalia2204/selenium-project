package com.cydeo.tests.week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
    public static void main(String[] args) throws InterruptedException {
        // 1- Setup the "browser driver"
        WebDriver driver = new ChromeDriver();

        //2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

        //3- Click Login label
        WebElement clickLoginLabel = driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        clickLoginLabel.click();

        //4- Login to application with username as "User1" and password as "UserUser123"
        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        inputUsername.sendKeys("User1");

        WebElement inputPassword = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        inputPassword.sendKeys("UserUser123");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        // 5- Verify the title is "Dashboard"

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }


        driver.quit();

    }
}
/*
 1- Setup the "browser driver"
 2- Go to "https://vytrack.com"
 3- Click Login label
 4- Login to application with username as "User1" and password as "UserUser123"
 5- Verify the title is "Dashboard"
 */