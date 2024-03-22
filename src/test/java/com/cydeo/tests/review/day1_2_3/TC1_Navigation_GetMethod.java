package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Navigation_GetMethod {
    public static void main(String[] args) throws InterruptedException {

        // 1. Open a chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to: https://www.etsy.com
        driver.get("https://www.etsy.com");

        Thread.sleep(5000);
        // 3. Click on Registry link

        WebElement registryLink = driver.findElement(By.linkText("Registry"));
        registryLink.click();

        // 4. Verify url contains "registry"

        String expectedUrl = "registry";
        String actualUrl = driver.getCurrentUrl().toLowerCase();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url contains 'registry' PASSED");
        }else {
            System.out.println("Url contains 'registry' FAILED");
        }

        // 5. Navigate to https://www.amazon.com/
        driver.get("https://www.googl.com/");

        // 6. Navigate back, forward and refresh
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        // 7. Write “selenium” in search box
        // 8. Press search button to search
        //tagName[text()='textValue'] --> //tagName[.='textValue']
        //tagName[attribute='value']
        //WebElement searchBox = driver.findElement(By.name("search_query"));

        WebElement searchBox = driver.findElement(By.cssSelector("input[value='selenium']"));
        Thread.sleep(10000);
        searchBox.sendKeys("selenium" + Keys.ENTER);

        // 9. Verify title is "Amazon.com : selenium"
        //System.out.println(driver.getTitle());
        String expectedTitle = "Amazon.com : selenium";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title PASSED");
        }else {
            System.out.println("Title FAILED");
        }
        //10. Verify url contains "selenium"
       
        expectedUrl = "selenium";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url contains 'selenium' PASSED");
        }else {
            System.out.println("Url contains 'selenium' FAILED");
        }






    }
}
/*
 // TC#1: Navigations and Get methods Practice

      // 1. Open a chrome browser
      // 2. Go to: https://www.etsy.com
      // 3. Click on Registry link
      // 4. Verify url contains "registry"
      // 5. Navigate to https://www.amazon.com/
      // 6. Navigate back, forward and refresh
      // 7. Write “selenium” in search box
      // 8. Press search button to search
      // 9. Verify title is "Amazon.com : selenium"
      //10. Verify url contains "selenium"

 */