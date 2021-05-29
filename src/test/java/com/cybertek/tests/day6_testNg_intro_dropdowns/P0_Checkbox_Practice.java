package com.cybertek.tests.day6_testNg_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Practice:	Cybertek	Checkboxes
         * 1. Go	to	http://practice.cybertekschool.com/checkboxes
         * 2. Confirm	checkbox	#1	is	NOT	selected	by	default
         * 3. Confirm	checkbox	#2	is	SELECTED	by	default.
         * 4. Click	checkbox	#1	to	select	it.
         * 5. Click	checkbox	#2	to	deselect	it.
         * 6. Confirm	checkbox	#1	is	SELECTED.
         * 7. Confirm	checkbox	#2	is	NOT	selected
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 1. Go to driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //2.Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 =driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
// "!" is not
        if(!checkbox1.isSelected()) {
            System.out.println("checkbox #1 is NOT selected. Verification passed");
        }else{
            System.out.println("checkbox #1 IS selected. Verification Failed");

        }
        // 3. confirm checkbox #2 is selected by default
if (checkbox2.isSelected()) {
    System.out.println("checkbox #2 is selected. Verification is passed!!");
}else{
    System.out.println("checkbox #2 is not selected. Verification failed!!");
}
// 4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();


//5. Click checkbox #2 to deselect it
        Thread.sleep(2000);
        checkbox2.click();

        // 6. Confirm checkbox #1 is SELECTED
        if (checkbox1.isSelected()) {
            System.out.println("checkbox #1 IS selected");
        }else{
            System.out.println("checkbox #1 is NOT selected");
        }
        // 7. COnfirm checkbox #2 is NOT selected
        if (!checkbox2.isSelected()) {
            System.out.println("checkbox #2 is NOT selected. Verification PASSED!!");
        }else{
            System.out.println("checkbox #2 IS selected. Verification FAILED!!");

            driver.navigate().refresh();
           // Thread.sleep();
            checkbox1.click();
            checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        }
    }
}
