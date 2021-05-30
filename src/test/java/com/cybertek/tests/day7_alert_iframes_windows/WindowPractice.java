
package com.cybertek.tests.day7_alert_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {



    public class AlertsPractices {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() throws InterruptedException {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://practice.cybertekschool.com/javascript_alerts");

        }
        @Test
        public void window_test(){
            //print out the window handle of the first page opened.
            //Storing the first windowhandle into a string is a useful practice for future needs when we need
            //to switch back to it

            String mainhandle =driver.getWindowHandle();
            System.out.println("mainhandle = " + mainhandle);

            //4. Assert : Title is "Practice"
            String actualTitleBeforeClick = driver.getTitle();
            String expectedTitleBeforeClick = "Practice";

            System.out.println("expectedTitleBeforeClick = " + expectedTitleBeforeClick);

                //5. Click to : "Click here" text
                WebElement clickHereLink = driver.findElement(By.linkText(""));
                clickHereLink.click();

                for (String each :driver.getWindowHandles()){
                    driver.switchTo().window(each);
                    System.out.println("CURRENT TITLE WHILE SWITCHING: "+ driver.getTitle());

                }
String actualTitleAfterClick = driver.getTitle();
            System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);
            //6. Switch to new window
            //7. Assert: Title is "New Window"

        }
    }
}
