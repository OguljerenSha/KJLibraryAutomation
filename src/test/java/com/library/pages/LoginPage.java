package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputUser;

    @FindBy(id = "inputPassword")
    public WebElement inputPass;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public void login(String user){
        if (user.equals("student")){
            inputUser.sendKeys(ConfigurationReader.getProperty("studentUser11"));
            inputPass.sendKeys(ConfigurationReader.getProperty("studentPass11"));
            signInButton.click();
        }else {
            inputUser.sendKeys(ConfigurationReader.getProperty("libraryUser"));
            inputPass.sendKeys(ConfigurationReader.getProperty("libraryPass"));
            signInButton.click();
        }
    }

    public void loginAsAStudent(){
        inputUser.sendKeys(ConfigurationReader.getProperty("studentUser11"));
        inputPass.sendKeys(ConfigurationReader.getProperty("studentPass11"));
        signInButton.click();
    }

}
