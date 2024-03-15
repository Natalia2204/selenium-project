package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

        // TASK: NEW METHOD CREATION

        public static WebDriver getDriver(String browserType){
           if (browserType.equalsIgnoreCase("chrome")){
               return new ChromeDriver();
           }else if (browserType.equalsIgnoreCase("edge")){
               return new EdgeDriver();
           }else {
               System.out.println("Given string doesn't represent any browser.");
               System.out.println("Either that browser does not exist or not currently supported.");
               System.out.println("driver = null");
               return null;
           }

        }



}
/*

WebDriver driver = new ChromeDriver();
driver.navigate().to("https://practice.cydeo.com");


// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open Chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
 */