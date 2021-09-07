
package com.cybertek.OfficeHours.OH_day01;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MoneyGamingTask {

    @Test
    public void Task1(){
// real job interview
        //1. Navigate to: https://moneygaming.qa.gameaccount.com/
        //2. Click the join Now button to open the registration page
        //3. Select  a title value from the drop dawn
        //4. Enter your first name and surname in the form
        //5. Check the tickbox with text ' I accept the Terms and condition and certify that I am over the age
        //6.submit the form by clicking the JOIN NOW button
       // 7. validate that a validation message with test 'This  field is required 'appears under the date of birth box


        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com");
//let`s handle time delays
        //driver.manage().timeouts().implicitlyWait(10, timeUnit.SECONDS);
        WebElement joinButton = driver.findElement(By.xpath("newUser green"));
   joinButton.click();

   WebElement titleElement = driver.findElement(By.id("title"));
   // we need to creat our select object so we can reach select class methods
        Select titleDropDown = new Select(titleElement);

        // we are going to add a Mr to gaming
        titleDropDown.selectByVisibleText("Mr");

        //verify that Mr is selected
        String expectedTitle = "Mr";

        String actualTitle = titleDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualTitle,expectedTitle, "verify the title");
        // first name and last name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));

        firstName.sendKeys("mike");
        lastName.sendKeys("Smith");

        //check the tickbox with text
        WebElement termBox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        termBox.click();

        WebElement submitButton =driver.findElement(By.xpath("//input[@value='Join Now!']"));
        submitButton.click();
        //7.validate that a validation message with test 'This  field is required 'appears under the date of birth box
        String expectedError ="This field is required";

        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();
        Assert.assertEquals(actualError, expectedError, "verify date of birth error message");


    }

}
