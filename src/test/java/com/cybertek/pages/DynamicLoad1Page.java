package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {


    public Alert inputPassword;

    public  DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "/button[.'start']")
    public WebElement startButton;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "inputUsername")
    public  WebElement inputUsername;

    @FindBy(id = "pod")
    public WebElement getInputPassword;


    @FindBy(xpath = "/button[.='submit']")
    public WebElement submitButton;

@FindBy(id = "flash")
public  WebElement errorMessage;


}
