package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_Multiple_Buttons {
    public static void main(String[] args) {
        // 1. Open chrome browser

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        //3. Click on Buttons
        //Verify test displayed is as expected
        //Expected:"Click on button one!"
        // USE Xpath locator for all webelement locators
        // 1. Open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Buttons
        //locating using xpath with class attribute value
//WebElement button1 =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        //Locating using text of the button with xpath
//WebElement button1 =driver.findElement(By.xpath("//button[@onclick=button1()]"));

        // locating using "onclick" attribute value with xpath locator
WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));

button1.click();

WebElement resultText =driver.findElement(By.xpath("//p[@id='result']"));

// 4. Verify text display is as expected:
        //EXPECTED: "Clicked button one!"

        String expectedText ="Click on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("Result text verification Passed!!");
        }else{
            System.out.println("Result text verification FAILED!!");
        }



    }
}