package com.cydeo.tests.day06_alerts_iframes_windows;

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

public class Dropdowns_T6_T7_T8 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void dropdowns_task6() throws InterruptedException {
        //3. Select “December 1st, 1933” and verify it is selected.
        //Locate dropdowns and pass them in Select object constructors
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        Thread.sleep(2000);
        yearDropdown.selectByVisibleText("1933");

        // Select month using : value attribute
        Thread.sleep(2000);
        monthDropdown.selectByValue("11");

        //Select day using : index number
        Thread.sleep(2000);
        dayDropdown.selectByValue("1");

        //create expected values
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertTrue(actualYear.equals(expectedYear), "ACTUAL YEAR NOT EQUAL EXPECTED YEAR!");
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertTrue(actualDay.equals(expectedDay));
    }

    @Test
    public void dropdown_task7() throws InterruptedException {
        //Locate dropdowns and pass them in Select object constructors

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Select state Illinois
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");
        //Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        //Select California
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("California");

        //create expected values
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        //create assertions
        Assert.assertEquals(actualOptionText, expectedOptionText, "STATE DROPDOWN VALUE IS NOT AS EXPECTED!");

    }

    @Test
    public void dropdown_task8() throws InterruptedException {
    //3. Click to non-select dropdown
        //locate the non-select dropdown
        WebElement websiteDropdown = driver.findElement(By.linkText("Dropdown link"));
        Thread.sleep(2000);
        websiteDropdown.click();
        Thread.sleep(1000);

       // 4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
        Thread.sleep(2000);
        facebookLink.click();

        //5. Verify title is “Facebook - Log In or sign Up”
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"Titles are not equal!");


    }
}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1933” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */
/*
TC #7: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index
 */
/*
TC #8: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */