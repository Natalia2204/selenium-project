package com.cydeo.tests.review.day4_5_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Self_Practice_TC4 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");
    }

    @Test
    public void windowsPracticeTC4(){
        //    3. Click on New Tab button
        WebElement newTabButton = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTabButton.click();

        //    4. Click on New Window button
        WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
        newTabButton.click();


        //    5. Click on New Window Message button
        WebElement messageWindowButton = driver.findElement(By.id("messageWindowButton"));


        //    6. Print out each window title
        Set<String> allWindow = driver.getWindowHandles();

        for (String each : allWindow) {
            driver.switchTo().window(each);
            System.out.println("window = " + driver.getTitle());
        }


    }
}
// TC#4 : Windows handle practice
//    1. Open browser
//    2. Go to website: https://demoqa.com/browser-windows
//    3. Click on New Tab button
//    4. Click on New Window button
//    5. Click on New Window Message button
//    6. Print out each window title