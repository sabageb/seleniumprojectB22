package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {


        //TC #3 FACEBOOK HEADER VERIFICATION
// 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to https:www.facebook.com
        driver.get("https://www.facebook.com");


        // 3. verify header text is as expected:
        WebElement header = driver.findElement(By.className("_8eso"));
        // short cut for auto - generating variable type
        //alt + ENTER --> WINDOWS
        //option + ENTER -->MAC

// expected:Connect with friends and the world around you on Facebook";
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();
        
if (actualHeader.equals(expectedHeader)) {
    System.out.println("Header verification passed!!");
}else{
    System.out.println("Header verification Failed!!");

}




    }
}
