package com.cybertek.tests.day6_testNg_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
// TC #03: FINDELEMENTS_APPLE
        //1. Open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//2. Go To https://www.apple.com
        driver.get("https://www.apple.com/");
        //3. Click to all of the headers one by one
        //a. MAC, ipad , iphone, watch, TV, Music, Support

// storing 9 web elements including "apple" logo and search engine

        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
for(int eachLink =0; eachLink < headerLinks.size()-1; eachLink++) {
   System.out.println(headerLinks.get(eachLink).getText());

    headerLinks.get(eachLink).click();
    Thread.sleep(2000);


    driver.navigate().refresh();

// 4. print out the title of each page
    System.out.println("Current title in the page " + driver.getTitle());

    //5.  Print out total number of links in each page
    List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

    System.out.println("Total number of links in current page: " +allLinks.size());

    int linksWithNoText = 0;
    int linksWithText = 0;

    for (WebElement each : allLinks) {
        if(each.getText().isEmpty()) {
            linksWithNoText++;
        }else{
            linksWithText++;
        }
    }
//6. While in each page:
    //a. print out how many link is missing text TOTAL
    System.out.println("--->Current page  links with NO TEXT:" + linksWithNoText);

    System.out.println("______________________________________________________________________________");
    //b. print out how many link has text TOTAL
    System.out.println("--> Current page links with text:" + linksWithText);

    headerLinks =driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        }

    }
}