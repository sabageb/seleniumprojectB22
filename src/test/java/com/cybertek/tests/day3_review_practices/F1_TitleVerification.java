
package com.cybertek.tests.day3_review_practices;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class F1_TitleVerification {

    public static void main(String[]args) throws InterruptedException {

    // TC # 1: Facebook title verification
    // 1. open chrome browser
    // set up browser driver

    WebDriverManager.chromedriver().setup();

// create  driver instance and open browser
    WebDriver driver = new ChromeDriver();

    // use the 'driver' object created to use selenium methods
    driver.manage().window().maximize();

    //2. go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. verify title:
        //Expected: "Facebook- log In or sign Up"
        String expectedTitle = "Facebook - Log In or Sign Up";// is coming from the requirement
        System.out.println("expectedTitle = " + expectedTitle);


        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //here we are verifying if actual is == expected
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification Failed!!");

        }


}

}
