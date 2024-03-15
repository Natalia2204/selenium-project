package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        // 1- Open a chrome browser
        // 2- Go to: https://google.com

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");

        //3- Write “apple” in search box
        //4- Press ENTER to search
        WebElement googleSearch = driver.findElement(By.name("q"));

        googleSearch.sendKeys("apple" + Keys.ENTER);


        //5- Verify title:Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String currentTitle = driver.getTitle();


        if (currentTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification PASS");
        } else{
            System.out.println("Title verification FAIL");
        }


    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */
