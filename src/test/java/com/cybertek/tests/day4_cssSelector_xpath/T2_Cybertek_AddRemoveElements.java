package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Cybertek_AddRemoveElements {
    public static void main(String[] args) {
     //  TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
        //  1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //  2. Go to http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        //  3. Click to “Add Element” button
        //tagName[.='text']
        WebElement addElementButton = driver.findElement(By.xpath(""));

        //  4. Verify “Delete” button is displayed after clicking.
        //  5. Click to “Delete” button.
        //  6. Verify “Delete” button is NOT displayed after clicking.
        //  USE XPATH LOCATOR FOR ALL  Web ELEMENT LOCATORS

    }
}
