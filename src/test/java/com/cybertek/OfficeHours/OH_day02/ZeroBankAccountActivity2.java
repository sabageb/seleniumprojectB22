
package com.cybertek.OfficeHours.OH_day02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

    public class ZeroBankAccountActivity2 {

        //Declare our driver object

        WebDriver driver;
        Select accountDropDown;

        @BeforeClass
        public void setupClass() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://zero.webappsecurity.com/login.html");

            //login

            driver.findElement(By.cssSelector("[id*='user_login']")).sendKeys("username");
            driver.findElement(By.cssSelector("[id*='user_password']")).sendKeys("password");
            driver.findElement(By.cssSelector("[type*='submit']")).click();
            driver.findElement(By.cssSelector("[id*='primary']")).click();
        }

        @Test
        public void accountActivity01() {
            // Then the page should have the title "Zero- Account activity"

            driver.findElement(By.cssSelector("[id*='account_activity_link']")).click();
            String expectedTitle = "Zero - Account Activity";
            String actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitle, "verify Title");

        }
        @Test
        public void accountActivity02() {


            List<String> expectedOptions = new ArrayList<>(Arrays.asList("saving", "Checking", "Savings", "Loan", "Credit Card", "Brokerage"));

            accountDropDown = new Select(driver.findElement(By.cssSelector("[id*='aa_accountId']")));

            List<WebElement> actualOptions = accountDropDown.getOptions();


            List<String> actualOptionsTexts = new ArrayList<>();
            for (WebElement actualOption : actualOptions) {
                actualOptionsTexts.add(actualOption.getText());

            }

            Assert.assertEquals(actualOptionsTexts, expectedOptions, "verify DropDown Options");
        }


            @Test
            public void accountActivity03 () {

                accountDropDown.selectByVisibleText("Brokerage");

                String expectedText = "No Results.";
                String actualText = driver.findElement(By.cssSelector("[class*='well']")).getText();

                Assert.assertEquals(actualText, expectedText, "verify result text");
            }
            @AfterClass
            public void tearDownClass() {
                driver.quit();

            }

        }


