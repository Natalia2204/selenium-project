package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //1- Open a chrome browser
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("edge");

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        //4- Enter incorrect password: “incorrect”

        WebElement inputUsername = driver.findElement(By.className("login-inp")); //поиска веб-элемента по атрибута

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));


        inputUsername.sendKeys("incorrect");

        inputPassword.sendKeys("incorrect");

        //5- Click to login button.

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:Expected: Incorrect login or password
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();
    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web
elements.
 */