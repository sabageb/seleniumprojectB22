package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeleriKPage {

    public TeleriKPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy(id = "draggable")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
public WebElement bigCircle;

@FindBy(id = "onetrust-style")
public WebElement acceptCookiesButton;


}
