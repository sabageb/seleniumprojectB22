/**
package com.cybertek.tests.day7_alert_iframes_windows;
import java.util.concurrent.TimeUnit;



import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

        @Test
                public void iframe_test(){
// #1 - changing to iframe by index: we pass index
            driver.switchTo().frame(0);
            Thread.sleep(2000);

            //#2- locate as a web element to switch
        //we find and locate <iframe> web element from the page.
        //Element iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"))
        //WebElement iframe = driver.findElement(By.xpath("//[@=])


        //#3- if<iframe> tag has
//locating web element text
            WebElement yourContentGoesHere = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
driver.switchTo().frame("mce_0_ifr");


//4.Assert: "your content goes here." Text is displayed

        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //5. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor
            WebElement headerText;
            Assert.assertTrue(headerText.isDisplayed());

        }

    }
*/