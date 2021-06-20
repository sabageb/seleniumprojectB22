package com.cybertek.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /**
     * Creating the private constructor so this class object
     * is not reachable from outside
     */

    private Driver() {}
        /**
         * Making our 'driver' instance private so that it is not reachable from outside of the class.
         * we make it static, because we want to run before everything else, and also we will use it in a static meyjod.
         *
         */

        private static WebDriver driver;// null bcz not initiated

        /**
         * creating reusable utility method that will return same 'driver' instance everytime we call it.
         */
        public static WebDriver getDriver () {

            if (driver == null) {
                /**
                 * we read our browser type from configuration.properties file using
                 * .getproperty method  we created in configuration
                 */
                String browserType = ConfigurationReader.getProperty("browser");
                /**
                 * Depending on the browser type our switch statement will determine
                 * to open specific type of browser/driver
                 */
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "Firefox":
                        WebDriverManager.firefoxdriver();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;


                }

            }
/**
 * Same driver instance will be returned everytime we call Driver.getDriver(); method
 */
            return driver;
        }
        //this method makes sure we have some form of driver session or driver id has
//either null or not null it must exist
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
    }



