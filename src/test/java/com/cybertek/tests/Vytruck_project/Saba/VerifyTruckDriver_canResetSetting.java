package com.cybertek.tests.Vytruck_project.Saba;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class VerifyTruckDriver_canResetSetting {

    public static void main(String[] args) {

        WebDriver driver;
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://qa3.vytrack.com/user/login");

            //Enter username
            WebElement inputUsername = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            inputUsername.sendKeys("user7");

            //Enter password
            WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password']"));
            inputPassword.sendKeys("UserUser123");

            //Click login button
            WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
            loginButton.click();

        }
    }
