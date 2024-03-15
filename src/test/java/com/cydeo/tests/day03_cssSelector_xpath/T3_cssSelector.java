package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_cssSelector {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:Expected: Log In
        WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        String expectedlogInText = "Log In";
        String actuallogInText = logInButton.getAttribute("value");// --> Log in

        if (actuallogInText.equals(expectedlogInText)) {
            System.out.println("actuallogInButton = " + actuallogInText);
            System.out.println("PASSED");
        } else {

            System.out.println("FAILED");
        }


    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
