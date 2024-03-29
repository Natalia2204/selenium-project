package com.cydeo.tests.review.day4_5_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_RegistrationForm {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/registration_form");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }

    @Test
    public void verifyTitleTC1() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Registration Form","Actual title is NOT as expected!");
    }

    @Test
    public void verifyFillingFormTC2(){



    }


}
// TC#1: Registration Form Page Testing

// 1. Open Chrome browser
// 2. Go to https://practice.cydeo.com/registration_form
// 3. Verify title is as expected:
// Expected: "Registration Form"

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

