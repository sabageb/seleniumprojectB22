
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





public class ZeroBankAccountActivity1 {
/**
 * Scenario: Checking the account activity page features of ZeroBank Application
 * 1. The user navigates to the login page: http://zero.webappsecurity.com/login.html
 * 2. The user logs in with the user "username" and the password "password"
 * 3. The user navigates to Account Activity page
 * 4. Then the page should have the title "Zero- Account activity"
 * 5. The Account drop down should have the following options
 * (saving, Checking, Savings, Loan, Credit Card, Brokerage)
 * 6.Brokerage option should have "No results."
 */

//Declare our driver object

WebDriver driver;

    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");

        //login credentials
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("[id*='primary']")).click();

    }
@Test
    public void accountActivity(){
        // Then the page should have the title "Zero- Account activity"

    driver.findElement(By.id("account_activity_link")).click();
    String expectedTitle = "Zero - Account Activity";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "verify Title");

    //then Account drop down should have the following options:
    // (saving, Checking, Savings, Loan, Credit Card, Brokerage)

    List<String> expectedOptions = new ArrayList<>(Arrays.asList("saving", "Checking", "Savings", "Loan", "Credit Card", "Brokerage"));


    Select accountDropDown = new Select(driver.findElement(By.id("aa_accountId")));

    List<WebElement> actualOptions = accountDropDown.getOptions();


    List<String> actualOptionsTexts = new ArrayList<>();

    for (WebElement Option : actualOptions){

    actualOptionsTexts.add(Option.getText());

}
    System.out.println("expectedOptions = " + expectedOptions);
    System.out.println("actualOptions = " + actualOptions );
    System.out.println("actualOptionsTexts = "+ actualOptionsTexts);

    Assert.assertEquals(actualOptionsTexts, expectedOptions, "verify DropDown Options");

    accountDropDown.selectByVisibleText("Brokerage");

    String expectedTexts = "No Results.";
    String actualTexts = driver.findElement(By.xpath("//div[@class='well']")).getText();


    Assert.assertEquals(actualTexts,expectedTexts, "Verify result text");

    }
@AfterClass
    public void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

}

}
