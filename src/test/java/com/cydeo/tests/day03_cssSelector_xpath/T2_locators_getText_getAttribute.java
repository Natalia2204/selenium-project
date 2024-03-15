package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_locators_getText_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser  . Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();
        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:Expected: Remember me on this computer

        String expectedLabelText = "Remember me on this computer";
        String actualLabelText = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(actualLabelText.equalsIgnoreCase(expectedLabelText)){
            System.out.println("label text PASSED");
        }else {
            System.out.println("label text FAILED");
        }

        // 4- Verify “forgot password” link text is as expected: Expected: Forgot your password?
        String expectedLinkText = "FORGOT YOUR PASSWORD?";
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String actualLinkText = forgotPasswordLink.getText();

        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("link text PASSED");
        }else {
            System.out.println("actualLinkText = " + actualLinkText);
            System.out.println("link  text FAILED");
        }

        //Verify “forgot password” href attribute’s value contains expected:Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");

        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("href attribute PASSED");
        }else {
            System.out.println("href attribute FAILED");
        }

    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
elements
 */