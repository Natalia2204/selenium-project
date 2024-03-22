package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_TestNG_Selenium_Intro {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.cydeo.com");
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }

    // 3. Verify title:Expected: Cyde
    @Test
    public void test1_cydeo_title_verification() {

        String actualTitle = "Cydeo";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
/*
TC #4: Cydeo Title Verification
1.Open Chrome browser
2.Go to https://www.cydeo.com
3.Verify title:
Expected: Cyde
 */