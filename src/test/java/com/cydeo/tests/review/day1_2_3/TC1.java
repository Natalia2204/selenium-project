package com.cydeo.tests.review.day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class TC1 {

        public static void main(String[] args) throws InterruptedException {
            // TC#1: Navigations and Get methods Practice
            // 1. Open a chrome browser

            // WebDriverManager.chromedriver().setup(); // in selenium 3 versions you have to have this setup
            // in selenium 4 webdrivermanager setup comes automatically, that is why we don't need it.

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();


            // 2. Go to: https://practice.expandtesting.com/
            driver.get("https://practice.expandtesting.com/");

            // 3. Click on "Automation Training"
            //  driver.findElement(By.linkText("Automation Training")).click();

            WebElement automatonTrainingLink = driver.findElement(By.linkText("Automation Training"));
            automatonTrainingLink.click();

            Thread.sleep(3000);

            // 4. Verify url contains "formations"
            if(driver.getCurrentUrl().contains("formations")){
                System.out.println("URL verification is passed!");
            }else{
                System.out.println("URL verification is failed!");
            }

            // 5. Navigate back, forward and refresh
            driver.navigate().back();

            Thread.sleep(3000);

            driver.navigate().forward();

            Thread.sleep(3000);

            driver.navigate().refresh();

            // 6. Click on "Practice Site"
            driver.findElement(By.xpath("//a[text()='Practice Site']")).click(); // instead text() we can use "."
            // a[.='Practice Site']


            // 7. Verify title is "Automation Testing Practice Website for UI and API"
            String actualTitle = driver.getTitle();
            String expectedTitle = "Automation Testing Practice Website for UI and API";

            if(actualTitle.equals(expectedTitle)){
                System.out.println("Title verification is passed!");
            }else{
                System.out.println("Title verification is failed!");
            }


            driver.close();// closing only currently focus window
            driver.quit();// closing all windows, if you are testing multiple windows


        }

    }
/*
 // TC#1: Navigations and Get methods Practice

      // 1. Open a chrome browser
      // 2. Go to: https://practice.expandtesting.com/
      // 3. Click on "Automation Training"
      // 4. Verify url contains "formations"
      // 5. Navigate back, forward and refresh
      // 6. Click on "Practice Site"
      // 7. Verify title is "Automation Testing Practice Website for UI and API"
 */
