package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_Link_XPATH_CSS {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link. <a class="nav-link" href="/">Home</a>

        //WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        //WebElement homeLink = driver.findElement(By.linkText("Home"));
        //WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));

        //WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));

        homeLink.click();

        //4- Verify title is as expected Expected: Practice

        String  expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

    }
}
/*
WP #4: Practice Cydeo – xpath locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “xpath” locato
 */