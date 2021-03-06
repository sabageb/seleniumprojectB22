package com.cybertek.tests.day7_alert_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class Dropdown_Practices {
    WebDriver driver;

//1. Open Chrome browser
 // 2. Go to http://practice.cybertekschool.com/dropdown
@BeforeClass
public void setupClass(){
       driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test(){

        //3.Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
      WebElement currentlySelectedOption =  simpleDropdown.getFirstSelectedOption();

      String actualTextOfCurrentOption = currentlySelectedOption.getText();
      String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

//Doing everything in one line: get currently selected option, get the text and compare against expected
//Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"Please select an option");

    //4. Verify " State selection" default selected value is current
        //Expected: Selected a State"

Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
//Select stateDropdown = new Select(driver.findElement(By.id("State")));


    String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
    String expectedStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
                                        //String expectedStateDropdownText = "Select a State";

     Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);

    }

    @AfterClass
public void teardownClass() throws InterruptedException {
    Thread.sleep(5000);
    driver.close();


    }



@Test

    public void tc2_state_dropdown_test() throws InterruptedException {
    //LOCATING STATE DROPDOWN
    Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//3.Select Illinois
    Thread.sleep(2000);
    stateDropdown.selectByVisibleText("Illinois");


// 4.Select Virginia
    Thread.sleep(2000);
    stateDropdown.selectByValue("VA");

    // 5.Select California
    Thread.sleep(2000);
    stateDropdown.selectByIndex(5);
    //stateDropdown.selectByVisibleText("California");

    // 6.Verify final selected option is California.
    //Use all Select options.(visible text, value, index)
    String expectedOptionText = "california";
    String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

    //doing it this way is not mandatory but useful functionality when assertion fails
     Assert.assertEquals(actualOptionText,expectedOptionText,"this message will be printed out only if assertion fails");

    //Assert.assertEquals(actualOptionText, expectedOptionText);
   // Assert.assertTrue(stateDropdown.getFirstSelectedOption().getText().equals("California"));

    //line 100 to 104 : my way of actual Vs expected
    // String expectedOptionText =stateDropdown.getFirstSelectedOption().getText();
    // String actualOptionText = stateDropdown.getFirstSelectedOption().getText();
    //  Assert.assertTrue(stateDropdown.getFirstSelectedOption().getText().equals("California"));

}

@Test
    public void tc5_none_select_dropdown() throws InterruptedException {
    // we need to locate the none-select dropdown as regular web element
    WebElement websiteDropdown = driver.findElement(By.xpath(""));

    //3. Click to non-select dropdown
    Thread.sleep(1000);
    websiteDropdown.click();

    //4. Select Facebook from dropdown
    Thread.sleep(1000);

//Locate facebook from non-selected dropdown
    WebElement facebookLink = driver.findElement(By.xpath(""));

    //Click to facebook link to go to page
    facebookLink.click();

    //5.Verify title is "Facebook - Log In or Sign Up"
    String expectedTitle = "Facebook-Log In or Sign Up";
    String actualTitle = driver.getTitle();

    Assert.assertEquals(actualTitle, expectedTitle, "Title is not as expected");




}
    }






