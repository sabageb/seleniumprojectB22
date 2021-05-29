package com.cybertek.tests.da2_locators_getTextLgetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //  2. Go to http://practice.cybertekschool.com/inputs
        driver.get("http://zero.webappsecurity.com/login.html");



        // locate the link and store inside of webelement
        //by entering webelement we are making it resuable
       WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();
        //driver.findElement(By.className("brand")).getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link verification passed!");
        }else {
            System.out.println("lINK text verification Failed!");

            String expectedInHrefValue = "index.html";
          //  String actualHrefValue = zeroBankLink.getAttribute(s:"href");


//            if (actualHrefValue.contains("HREF attribute value verification passed!!")) ;
    //    }else{
  //          System.out.println("HREF attribute value verification FAILED!");


        }


    }
}
