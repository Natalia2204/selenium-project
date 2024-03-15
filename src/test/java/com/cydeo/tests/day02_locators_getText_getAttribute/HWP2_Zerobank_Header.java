package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_Header {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //Setting up our chromedriver using WebDriverManager
        //WebDriverManager.chromedriver().setup();

        //Creating a new ChromeDriver and storing it in "driver"
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text Expected: “Log in to ZeroBank”

        WebElement headerText = driver.findElement(By.tagName("h3")); //поиска веб-элемента по атрибута «tagName»

        String expectedHeaderText = "Log in to ZeroBank";//Requirement documents
        String actualHeaderText = headerText.getText();////We get the "actual text" from the browser

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification PASSED!");
        } else {
            System.out.println("Header text verification FAILED!");
        }

        driver.close();



    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */