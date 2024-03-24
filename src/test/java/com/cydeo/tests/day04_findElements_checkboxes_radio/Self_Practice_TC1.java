package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Self_Practice_TC1 {
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
        driver.quit();
    }
    @Test
    public void verifyTitleTC1() throws InterruptedException {
        String expectedTitle = "Registration Form";
        String actualYiyle = driver.getTitle();

        Thread.sleep(2000);
        Assert.assertEquals(actualYiyle,expectedTitle,"Actual title is NOT as expected!");
    }


}
/*
// TC#1: Registration Form Page Testing

    // 1. Open Chrome browser
    // 2. Go to https://practice.cydeo.com/registration_form
    // 3. Verify title is as expected:
    // Expected: "Registration Form"
 */