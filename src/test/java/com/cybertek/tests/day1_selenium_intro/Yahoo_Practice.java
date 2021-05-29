package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {


        // TC #1: Yahoo title verification
        // setup browser driver
        WebDriverManager.chromedriver().setup();

        //1. open chrome browser
        //this line open EMPTY BROWSER
        WebDriver driver = new ChromeDriver();

        //maximise browser
        driver.manage().window().maximize();

        //2. go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " +expectedTitle);


        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = "+actualTitle);

// creating our verification
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("title is as expected.Verification passed!");
        }else{
            System.out.println("title is not as expected. Verification FAILED!!!");
        }

//closing the browser
        driver.close();

    }
}
