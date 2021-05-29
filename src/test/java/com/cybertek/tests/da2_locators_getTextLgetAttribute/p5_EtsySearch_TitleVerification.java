package com.cybertek.tests.da2_locators_getTextLgetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_EtsySearch_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        //3. Search for "Wooden spoon"
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden spoon" +Keys.ENTER);


        String expectedTitle ="Wooden spoon | Etsy";
String actualTitle =driver.getTitle();

if(actualTitle.equals(expectedTitle)) {
    System.out.println("Etsy Title verification passed!");
}else{
    System.out.println("Etsy title verification Failed!");


}

    }
}
