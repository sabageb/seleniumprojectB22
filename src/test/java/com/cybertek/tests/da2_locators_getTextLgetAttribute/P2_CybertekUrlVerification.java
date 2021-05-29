package com.cybertek.tests.da2_locators_getTextLgetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {


        // set up browser
        WebDriverManager.chromedriver().setup();
        //1. Open chrome browser
        WebDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        //2. go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //3. verify URL CONTAINS

        //EXPECTED: "cybertekschool"

        String expectedInURL ="cybertekschool";
        String  actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInURL)){
            System.out.println("URL verification passed! ");
        }else {
            System.out.println("URL verification failed!");
        }
// 4. verify title
        // expected: practice

        String expectedTitle ="Practice";
        String actualTitle = driver.getTitle();
      if(actualTitle.equals(expectedTitle)) {
          System.out.println("title verification passed!");
      }else {
          System.out.println("title verification failed!!!");
      }
    }
}
