
/**
package com.cybertek.tests.day7_alert_iframes_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Dropdown_practice2 {

    /**
     * TC #2: Selecting state from State dropdown and verifyingresult
     * 1.Open Chrome browser
     * 2.Go to http://practice.cybertekschool.com/dropdown
     * 3.Select Illinois4.Select Virginia
     * 5.Select California
     * 6.Verify final selected option is California.
     * Use all Select options.(visible text, value, index)



    @Test

    public void tc2_simple_dropdown_test() throws InterruptedException {
        //locating state dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. select the  state Illionois
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

//4. select virginia
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        //5.Select california
        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        //6. verify  final selected option is California
        // Use all selected options(visible text, value , index)

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText,
                "this message will printed out only if assertion fails");
        //  Assert.assertTrue(stateDropdown.getFirstSelectedOption().getText().equals("California"));


    }

    @AfterClass
    public void  teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();



    }



}
*/