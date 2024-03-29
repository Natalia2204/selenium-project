package com.cydeo.tests.review.day4_5_6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC3_Alertpractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void alertPracticeTC3() throws InterruptedException {

        driver.get("https://practice.cydeo.com/javascript_alerts");
        // 3. c to “Click for JS Prompt” button
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickJSPrompt.click();

        // 4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("hello");
        Thread.sleep(3000);

        // 5. Click to OK button from the alert
        alert.accept();
        // 6. Verify “You entered: hello” text is displayed.
        WebElement actualText = driver.findElement(By.xpath("//p[@style='color:green']"));

        Assert.assertEquals(actualText.getText(), "You entered: hello");

    }
}
// TC#3 : Alert practice
// 1. Open browser
// 2. Go to website: https://practice.cydeo.com/javascript_alerts
// 3. Click to “Click for JS Prompt” button
// 4. Send “hello” text to alert
// 5. Click to OK button from the alert
// 6. Verify “You entered: hello” text is displayed.