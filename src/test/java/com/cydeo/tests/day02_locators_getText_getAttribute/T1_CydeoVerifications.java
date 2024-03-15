package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains Expected: cydeo
        String expectedInURL = "cydeo";
        String actualInURL = driver.getCurrentUrl();

        if (actualInURL.contains(expectedInURL)) {
            System.out.println("URL verifications PASSED!");
        } else
            System.out.println("URL verifications FAILED!");

        //4. Verify title: Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verifications PASSED!");
        } else
            System.out.println("Title verifications FAILED!");
    }
}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
 */