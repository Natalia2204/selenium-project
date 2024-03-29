package com.cydeo.tests.week15;

import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_1_2_3_4_mySelf {

    WebDriver driver;

    //1-open a chrome browser
    //2-goto https://practice.cydeo.com
    @BeforeMethod
    public void setupMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com");
    }


    
    @Test
    public void clickDropdown() {
        // 3-click Dropdown
        WebElement clickDropdown = driver.findElement(By.linkText("Dropdown"));
        clickDropdown.click();

        //4-verify default option Select a State at State Selection dropdown menu
        WebElement dropdownMenu = driver.findElement(By.xpath("//select[@id='state']"));
        Select selectState = new Select(dropdownMenu);
        WebElement defaultOption = selectState.getFirstSelectedOption();

        Assert.assertEquals(defaultOption.getText(), "Select a State");

      selectState.selectByVisibleText("Colorado");
        System.out.println("selectState = " + selectState.getFirstSelectedOption().getText());

        driver.quit();

    }
    @Test (priority = 1)
    public void test2() throws InterruptedException {
        //3-click Dropdown
        WebElement clickDropdown = driver.findElement(By.linkText("Dropdown"));
        clickDropdown.click();
        
        //4-select Alabama from State Selection dropdown menu
        WebElement dropdownMenu = driver.findElement(By.xpath("//select[@id='state']"));
        Select selectState = new Select(dropdownMenu);
        selectState.selectByVisibleText("Alabama");

        Thread.sleep(2000);
        //selectState.selectByVisibleText("California");

        System.out.println("selectState.getFirstSelectedOption().getText() = " + selectState.getFirstSelectedOption().getText());
        
        //5-verify Alabama is selected 

        Assert.assertEquals(selectState.getFirstSelectedOption().getText(),"Alabama");

        driver.quit();
    }

    @Test
    public void test3(){
       // 3-click Radio Buttons
//        WebElement clickDropdown = driver.findElement(By.linkText("Radio Buttons"));
//        clickDropdown.click();
        BrowserUtils.clickOption(driver, "Radio Buttons");

       // 4-verify title contains Radio buttons
//        System.out.println("title = " + driver.getTitle());
//        Assert.assertEquals(driver.getTitle(), "Radio buttons");
            BrowserUtils.verifyTitleContains(driver,"Radio buttons");
            
       // 5-select the favorite color as Red
        WebElement selectOption = driver.findElement(By.cssSelector("input[id='red']"));
        selectOption.click();
        System.out.println("selectOption.getAttribute(\"id\") = " + selectOption.getAttribute("id"));


       // 6-verify the Red is selected
        System.out.println("selectOption = " + selectOption.isSelected());

       // 7-select the favorite sport as Football
        selectOption = driver.findElement(By.cssSelector("input[id='football']"));
        selectOption.click();
        System.out.println("selectOption.getAttribute(\"id\") = " + selectOption.getAttribute("id"));

       // 8-verify the Football is selected
        System.out.println("selectOption.isSelected() = " + selectOption.isSelected());

        driver.quit();

    }


}
/*
TC001 As a user I should be able to see default option as Select a State
  1-open a chrome browser
  2-goto https://practice.cydeo.com
  3-click Dropdown
  4-verify default option Select a State at State Selection dropdown menu
 */

/*
TC002 As a user I should be able to select Alabama
  1-open a chrome browser
  2-goto https://practice.cydeo.com
  3-click Dropdown
  4-select Alabama from State Selection dropdown menu
  5-verify Alabama is selected
 */

/*
TC003 As a user I should be able to select my favorite color and sport
  1-open a chrome browser
  2-goto https://practice.cydeo.com/
  3-click Radio Buttons
  4-verify title contains Radio buttons
  5-select the favorite color as Red
  6-verify the Red is selected
  7-select the favorite sport as Football
  8-verify the Football is selected
 */