package com.cydeo.tests.week14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC003 {
    public static void main(String[] args) {

        // 1- Setup the "browser driver"
        WebDriver driver = new ChromeDriver();

        //2- Go to "https://vytrack.com"
        driver.get("https://vytrack.com");

        //3-verify Home, About us, Our Approach, Products and Services, Contact
        //   and LOGIN labels are displayed

        List<String> expectedLabelText= new ArrayList<>(Arrays.asList("Home", "About us", "Our Approach", "Products and Services", "Contact", "LOGIN"));
        //List<String> expectedLableText = new ArrayList<>(Arrays.asList("Home","About us","Our Approach","Products and Services", "Contact", "LOGIN"));

        List<WebElement> actualLabelElement = driver.findElements(By.cssSelector("ul#top-menu>li>a"));

        List<String> actualLableTexts = new ArrayList<>();

        for (WebElement each : actualLabelElement) {
            System.out.println(each.getText());
            actualLableTexts.add(each.getText());
        }

        if(actualLableTexts.equals(expectedLabelText)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        driver.quit();

    }
}
/*
 1-open a chrome browser
  2-goto https://vytrack.com/
  3-verify Home, About us, Our Approach, Products and Services, Contact
   and LOGIN labels are displayed
 */