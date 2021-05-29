package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// TASK: NEW METHOD CREATION
// METHOD name: getDriver
//Static method
//Accepts String args:BrowserType
// This arg will determine what type of browser is opened
//  - if "chrome"  passed --> it will open chrome browser
// - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: WebDriver"

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {


        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        } else {
            System.out.println(" Given browser type does not exist: driver = null ");

            return null;
        }
    }
}









