package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableUtils {


        //PRACTICE #4: Method: verifyOrder
        //• Create a method named verifyOrder in TableUtils class.
        //• Method takes WebDriver object and String(name).
        //• Method should verify if given name exists in orders.
        //• This method should simply accepts a name(String), and assert whether
        //given name is in the list or not.
        //• Create a new TestNG test to test if the method is working as expected.

    //• Create a method named verifyOrder in TableUtils class.
    public static void verifyOrder(WebDriver driver){
//locate all the names from table and store them in a list of WebElements
        List<WebElement> allNames =driver.findElements(By.xpath(""));

        // to introduce local variable
        //  Mac option + enter
        //window : alt +enter
        for (WebElement each : allNames){
            System.out.println(each.getText());
        }






    }
}
