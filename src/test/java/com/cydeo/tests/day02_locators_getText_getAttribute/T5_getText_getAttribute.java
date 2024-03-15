package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser

        WebDriver driver = new ChromeDriver();
       //2- Go to: https://practice.cydeo.com/registration_form

        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:
        WebElement header = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration form";
        String actualHeaderText = header.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification PASSED!");
        } else {
            System.out.println("Header text verification FAILED!");
        }

        //4- Locate “First name” input box

        WebElement firstName = driver.findElement(By.className("form-control"));


        //5- Verify placeholder attribute’s value is as expected: Expected: first name

        String expectedPlaceholder = "first name";
        String actualPlaceholder = firstName.getAttribute("placeholder");

        System.out.println("actualPlaceholder = " + actualPlaceholder);

        if (actualPlaceholder.equals(expectedPlaceholder)) {
            System.out.println("placeholder verification PASSED!");
        } else {
            System.out.println("placeholder verification FAILED!");
        }

        driver.quit();
    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */