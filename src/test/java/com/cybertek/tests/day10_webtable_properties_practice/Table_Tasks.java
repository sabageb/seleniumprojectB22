package com.cybertek.tests.day10_webtable_properties_practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        String browser = ConfigurationReader.getProperty("chrome");
        //this line returns String : chrome

        String url = ConfigurationReader.getProperty("dataTables");
        //this line returns String: http://practice.cybertekschool.com/table


        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty(""));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("url");
        //line 27 and 28 are same. below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTables"));

    }
@Test
        public void task3_return_tims_due_amount(){

       // String browser = ConfigurationReader.getProperty("");
        //this line returns String : chrome

       // String url = ConfigurationReader.getProperty("dataTablesurl");
       // driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty(""));

    }

        // 1st way: --> //table[@id='table1']//td[.='Tim']
        // 2nd way:--> //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        // --> //table[@id='table1']//td[.=Tim']/..td[4]
        //--> //
        //1.	Open browser and go to: http://practice.cybertekschool.com/tables#edit
        //2.	Locate first table and verify Tim has due amount of “$50”
        //
       // WebElement timeDueAmountCell = driver.
        //Note: Create locator for Tim that will be dynamic and does’t care in which row Tim is.
    }




