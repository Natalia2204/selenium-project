package com.cydeo.tests.day04_findElements_checkboxes_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_xpath_cssSelector_practices {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver =new ChromeDriver();
        //2. Go to https://practice.cydeo.com/forgot_password

        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        WebElement textForgotPassword = driver.findElement(By.cssSelector("h2"));
        //b. “Forgot password” header
        System.out.println(textForgotPassword.getText());
        //c. “E-mail” text
        WebElement emailElement = driver.findElement(By.xpath("//label[@for='email']"));
        //WebElement emailElement = driver.findElement(By.cssSelector("label[for='email'"));
        System.out.println(emailElement.getText());
        //a. “Home” link
        WebElement homeLinc = driver.findElement(By.cssSelector("a.nav-link"));
        System.out.println(homeLinc.getText());

        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //WebElement inputBox = driver.findElement(By.cssSelector("input[type='text'"));
        //inputBox.sendKeys("Hello" + Keys.ENTER);

        //e. “Retrieve password” button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button#form_submit"));
        System.out.println(retrievePasswordButton.getText());

        //f. "Powered by Cydeo" text
        // WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement textPoweredCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(textPoweredCydeo.getText());
    }
}
/*
//TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/forgot_password
//3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//a. “Home” link
//b. “Forgot password” header
//c. “E-mail” text
//d. E-mail input box
//e. “Retrieve password” button
//f. "Powered by Cydeo" text
//4. Verify all web elements are displayed.
 */