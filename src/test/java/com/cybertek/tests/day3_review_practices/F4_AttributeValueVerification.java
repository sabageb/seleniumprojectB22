package com.cybertek.tests.day3_review_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to https:www.facebook.com
        driver.get("https://www.facebook.com");


        // Locating the "Create a page" link
        WebElement createPageLink = driver.findElement(By.linkText(""));

        //expeted: "registration_form
        String expectedInHref ="";
        String actualHrefValue = createPageLink.getAttribute("href");
        System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("HREF value verification passed!!");
        }else{
            System.out.println("HREF value verification failed!!");
        }




    }
}
