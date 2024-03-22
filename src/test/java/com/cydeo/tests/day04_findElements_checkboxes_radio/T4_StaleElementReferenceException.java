package com.cydeo.tests.day04_findElements_checkboxes_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_StaleElementReferenceException {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver =new ChromeDriver();

      //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

       //3- Locate “CYDEO” link, verify it is displayed.
        WebElement linkCydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("linkCydeo.isDisplayed() = " + linkCydeo.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.
       linkCydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("After Refresh linkCydeo.isDisplayed() = " + linkCydeo.isDisplayed());

    }

}
/*
TC #4: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it
 */