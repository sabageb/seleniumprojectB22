package com.cybertek.tests.day12_actio_appload_javscriptexecutor;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {

    @Test
    public void simple_google_search_test(){
        //1.Go to google.com
        //driver.getDriver()= driver--> creates driver instance and ready to use
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

        //2. search for value
        WebElement searchBox =Driver.getDriver().findElement(By.name("q"));

        //String searchValue="there is no spoon"
        String searchValue =ConfigurationReader.getProperty("searchValue");

        //send the searchValue and press enter
        searchBox.sendKeys(searchValue + Keys.ENTER);

        // 3.verify value is contained in the title
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

      // Driver.getDriver().quit();


        Driver.getDriver().get("https://ets.com");

        // driver close will close the currently opened browser or tab-will end the session


       //   //This will terminate the session and assign driver value to null
        Driver.closeDriver();

    }
}
