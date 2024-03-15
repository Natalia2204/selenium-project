package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Search_Title {
    public static void main(String[] args) {

       // 1. Open Chrome browser
        // 2. Go to https://www.etsy.com

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        // 3. Search for “wooden spoon”

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query")); //id locator использует
        // значение атрибута «id» для поиска веб-элемента.

        searchBox.sendKeys("wooden spoon" + Keys.ENTER); //Он отправит этот строковый аргумент в уже
        // обнаруженный веб-элемент + Enter


        //4. Verify title: Expected: “Wooden spoon - Etsy”
        String expectedTitle = "Wooden spoon - Etsy"; //Requirement documents
        String actualTitle = driver.getTitle();//We get the "actual data" from the browser

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Etsy Title verifications PASSED!");
        } else
            System.out.println("Etsy Title verifications FAILED!");

        //driver.close();

    }
}
/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
 */