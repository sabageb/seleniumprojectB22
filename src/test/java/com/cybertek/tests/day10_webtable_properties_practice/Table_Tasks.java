package com.cybertek.tests.day10_webtable_properties_practice;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("chrome");
        //this line returns String : chrome

        //this line returns String: http://practice.cybertekschool.com/table


        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty(""));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //line 27 and 28 are same. below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTables"));

    }

    @Test
    public void task3_return_Tims_due_amount() {
        String url = ConfigurationReader.getProperty("dataTables");

        driver.get(url);

//-->//table[@id='table1']//td[.='Tim']-->This locates Tim`s call regardless of which row he is in

        //2. Locate first table and verify Tim has due amount of "$50"


        // 1st way: --> //table[@id='table1']//td[.='Tim']
        // 2nd way:--> //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

//2.	Locate first table and verify Tim has due amount of “$50”
        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='tim']/..td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult,expectedTimResult, "Tim cell is not returning as expected.");

        // --> //table[@id='table1']//td[.=Tim']/..td[4]
        //--> //
        //1.	Open browser and go to: http://practice.cybertekschool.com/tables#edit

        // WebElement timeDueAmountCell = driver.
        //Note: Create locator for Tim that will be dynamic and does’t care in which row Tim is.
    }


    @Test
    public void task4_verify_order_method(){
        TableUtils.verifyOrder(driver, "random");

    }


}

