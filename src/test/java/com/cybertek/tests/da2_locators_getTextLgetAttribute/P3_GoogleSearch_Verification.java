package com.cybertek.tests.da2_locators_getTextLgetAttribute;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GoogleSearch_Verification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//3- write "apple" in search box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith("expectedInTitle")) {
            System.out.println("title verification passed!!");
        }else {
            System.out.println("title verification failed!!");
        }
    }



}