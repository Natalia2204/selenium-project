package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_DriverUtil_Practice {
    //TC #1: Bing search
//    @BeforeMethod
//    public void setupMethod(){
//        //1- Open a Chrome browser
//
//    }

    @Test
    public void bing_search_test() throws InterruptedException {
        //2- Go to: https://bing.com
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        //3- Write “apple” in search box

        //locate the search box

        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        Thread.sleep(2000);
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Search
        //Expected: flowers - Search
        String actualTitle = Driver.getDriver().getTitle();

        //String expectedTitle = "apple - Search";
        //We are just making the expectedTitle dynamic based on the text we are searching.
        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));

        Driver.closeDriver();


    }

}
/*
TC #1: Bing search
1- Open a chrome browser
2- Go to: https://bing.com
        3- Write “apple” in search box
4- Verify title:
Expected: apple - Search
Use `configuration.properties` for the following:
        1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
        */