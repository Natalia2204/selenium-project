package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Self_Practice_TC2 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/registration_form");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void fillingFormTestTC1() throws InterruptedException {
        // 3. Enter First name: "John"

        WebElement inputFirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        inputFirstname.sendKeys("John");


        // 4. Enter Last name: "Smith"
        WebElement inputLastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        inputLastname.sendKeys("Smith");

        // 5. Enter Username: "johnsmith123"
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='username']"));
        inputUsername.sendKeys("johnsmith123");

        // 6. Enter Email address: "john.smith@email.com"
        WebElement inputEmailAddress = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmailAddress.sendKeys("john.smith@email.com");

        // 7. Enter password: "John1234"
        WebElement inputpassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputpassword.sendKeys("John1234");

        // 8. Enter Phone number: "123-456-7890"
        WebElement inputPhoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys("123-456-7890");

        // 9. Click to "Male" from Gender
        WebElement checkboxGender  = driver.findElement(By.xpath("//input[@name='gender']"));
        checkboxGender.click();

        // 10. Enter Date of birth "01/28/1990"
        WebElement inputDateBirth = driver.findElement(By.xpath("//input[@name='birthday']"));
        inputDateBirth.sendKeys("01/28/1990");

        // 11. Select "Department of Engineering" from Department/Office dropdown
        Select departmentDropdown = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByVisibleText("Department of Engineering");

        // 12. Select "SDET" from Job title dropdown
        Select jobDropdown = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobDropdown.selectByVisibleText("SDET");

        // 13. Click to "Java" from languages
        WebElement inputlanguage = driver.findElement(By.xpath("//input[@value='java']"));
        inputlanguage.click();

        // 14. Click to "Sign up" button
        WebElement signUpButton = driver.findElement(By.cssSelector("button[type='submit']"));
        signUpButton.click();

        // 15. Verify text displayed on page
        //     Expected: "Well done!"

        String  expectedText = "Well done!";
        WebElement text = driver.findElement(By.tagName("h4"));
        String actualText = text.getText();

        System.out.println(actualText);

        Assert.assertEquals(actualText,expectedText);

        Thread.sleep(3000);
    }
}
/*
// TC#2: Registration Form Page Filling Form Test

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/registration_form
    // 3. Enter First name: "John"
    // 4. Enter Last name: "Smith"
    // 5. Enter Username: "johnsmith123"
    // 6. Enter Email address: "john.smith@email.com"
    // 7. Enter password: "John1234"
    // 8. Enter Phone number: "123-456-7890"
    // 9. Click to "Male" from Gender
    // 10. Enter Date of birth "01/28/1990"
    // 11. Select "Department of Engineering" from Department/Office dropdown
    // 12. Select "SDET" from Job title dropdown
    // 13. Click to "Java" from languages
    // 14. Click to "Sign up" button
    // 15. Verify text displayed on page
    //     Expected: "Well done!"

 */