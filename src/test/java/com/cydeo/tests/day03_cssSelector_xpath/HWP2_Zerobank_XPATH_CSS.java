package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_Zerobank_XPATH_CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text Expected: “Log in to ZeroBank

        String expectedHeader = "Log in to ZeroBank";
        //WebElement header = driver.findElement(By.tagName("h3"));

        //solution with xpath locator
        //WebElement header = driver.findElement(By.xpath("//h3"));

        //solution with cssSelector locator
        WebElement header = driver.findElement(By.cssSelector("h3"));

        String actualHeader = header.getText();
        System.out.println(actualHeader);

        if (actualHeader.equals(expectedHeader)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank
 */