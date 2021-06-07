package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


@Test
public class P1_Library_Login {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
// 1. Open browser
//  2. Go to website: http://library2.cybertekschool.com/login.html
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");

    }

    @Test
    public void login_link_count_test() {
        //Task #1: Library software link verification

        //3. Enter username:
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");

        //4.Enter password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        //5.Click login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        loginButton.click();

        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        //6.print out of all the links on the landing page


        // List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));//or tagName =a
        //System.out.println("allLinks = " + allLinks);


        //for (WebElement each : allLinks) {
        // System.out.println(each.getText());

        //7. Print out each link text on this page
        for (WebElement each : allLinks) {
            System.out.println(each.getText());

        }


    }
}


