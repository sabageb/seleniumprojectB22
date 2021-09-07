package com.cybertek.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfficeHoursUtils {

    public static int productAdder(WebDriver driver, String category, String product) {
        driver.findElement(By.xpath("//a[.='" + category + "']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='" + product + "']")).click();
        BrowserUtils.sleep(1);


        String amountString = driver.findElement(By.xpath("")).getText();
        String[] arrayAmount = amountString.split(" ");
        int amount = Integer.parseInt(arrayAmount[0].substring(1));


        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtils.sleep(1);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();

        return amount;

    }

    public static int productRemover(WebDriver driver, String product) {
        //tbody//tr//td[.='Apple monitor 24']/..//td[.='Delete']/a
        driver.findElement(By.xpath("//a[.='Cart']")).click();
        BrowserUtils.sleep(1);
        int amount = Integer.parseInt(driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..td[3]")).getText());
driver.findElement(By.xpath("//tbody//tr//td[.='"+product+"']/..//td[.='Delete']/a")).click();
BrowserUtils.sleep(3);

return amount;

    }
}
