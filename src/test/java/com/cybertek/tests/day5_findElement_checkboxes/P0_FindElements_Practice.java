
package com.cybertek.tests.day5_findElement_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {

    //TC # 0: FINDELEMENTS
    //1. Open Chrome browser

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

        //if  a web element is not found , this will wait UP TP given seconds
        // If web element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        // WE NEED TO CREAT A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        //---> //body//a---> this locator will return all of the links on the page

        //we are storing all of the links that are returned by findElements method
       // List<WebElement> listOdLinks = driver.findElements(By.xpath("//body//a"));
List<WebElement> listOdLinks = driver.findElements(By.xpath("//body//a"));


        //3. Print out the texts of all links (iter + enter will give u for each loop
        for (WebElement each : listOdLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

        // iter + tab ==> shortcut for foreach loop
        //fori + tab ==> shortcut for regular for loop

         //for (WebElement ignored : listOdLinks) {


            //4. Print out how many total link

         int numberOfLinks = listOdLinks.size();

            System.out.println("numberOfLinks = " + numberOfLinks);
        }

    }

