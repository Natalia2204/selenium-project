package com.cydeo.tests.week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

        // 3- Click Login label
        WebElement clickLoginLabel = driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        clickLoginLabel.click();

       // 4- Login to application with username as "User1" and password as "UserUser123"
//        WebElement inputUsername = driver.findElement(By.cssSelector("input[id='prependedInput']"));
//        inputUsername.sendKeys("User1");
//
//
//
//        System.out.println(inputPassword.isEnabled());

//        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
//        loginButton.click();
//        Thread.sleep(3000);

        // 4- Verify the password is hidden
        //xpath syntax:  //tagName[@attribute='value']
        //passwordBox=driver.findElement(By.xpath("//input[@id='prependedInput2']"));

        WebElement inputPassword = driver.findElement(By.cssSelector("input[id='prependedInput2']"));
        inputPassword.sendKeys("UserUser123");

        String actualAttributeTypeOfPasswordBox=inputPassword.getAttribute("type");
        String expectedAttributeTypeOfPasswordBox="password";

        System.out.println(inputPassword.getAttribute("type"));

        if(actualAttributeTypeOfPasswordBox.equals(expectedAttributeTypeOfPasswordBox)){
            System.out.println("Password is hidden!");
        }else{
            System.out.println("Password is NOT hidden!");
        }



        //5- Verify the password is hidden



        driver.quit();



    }
}
/*
 1- Setup the "browser driver"
 2- Go to "https://vytrack.com"
 3- Click Login label
 4- Verify the password is hidden

 */