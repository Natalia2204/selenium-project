package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Google_XPATH_CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        //Locating the Gmail link using "cssSelector" locator
        // --> tagName[attribute='value']
        //WebElement gmailLink = driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']"));
        //WebElement gmailLink = driver.findElement(By.cssSelector("a.gb_H"));

        //  Locating the Gmail link using "xpath" locator
       // WebElement gmailLink = driver.findElement(By.xpath("//a[@class='gb_H']"));
        //WebElement gmailLink = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
        WebElement gmailLink = driver.findElement(By.xpath("//a[@data-pid='23']"));

        //Using the text of the web element with XPATH locator
        //tagName[text()='textValue'] --> //tagName[.='textValue']
        //WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
        //WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));



        gmailLink.click();
        // 4- Verify title contains: Expected: Gmail
        String expectedTitle = "Gmail";

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google

 */