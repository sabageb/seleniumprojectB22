package com.cybertek.tests.da2_locators_getTextLgetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_navigationAndTitleVerification {
    public static void main(String[] args) {
        //TC
        //1- oPEN
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to : https://google.com
        driver.get("https://www.google.com/");

        //3. click to Gmail from top right
        //<------locating web element -----><--click-->
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();

        //4. verify title contains Gmail
        // expected:Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

if(actualTitle.contains(expectedInTitle)) {
    System.out.println("title verification passed!");
}else{
    System.out.println("title verification failed!");
    //COMMAND +D: MULTIPLY THE CURRENT LINE
    //CONTROL + D : MULTIPLY  THE CURRENT LINE
    // MOVING THE LINE UP AND DAWN: CONTROL +SHIFT +UP /DOWN ARROW

    //5- Go back  to google by using the .back();
    driver.navigate().back();

    // 6- Verify title equals:
    // Expected: Google
    String expectedGoogleTitle = "Google";
    String actualGoogleTitle = driver.getTitle();

    if(actualGoogleTitle.equals(expectedGoogleTitle)) {
        System.out.println("Title verification Passed!");
    }else {
        System.out.println("Title verification Failed!!!");
    }
}
    }
}
