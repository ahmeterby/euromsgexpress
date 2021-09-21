package com.euroMsgExpress.pages;

import com.euroMsgExpress.utilities.BrowserUtils;
import com.euroMsgExpress.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//a[.='GİRİŞ']")
    public WebElement girisButton;
    @FindBy(id = "exampleInputEmail1")
    public WebElement userName;
    @FindBy(id = "exampleInputPassword1")
    public WebElement password;
    @FindBy(css = ".btn-primary")
    public WebElement loginButton;
    @FindBy(css = ".text-danger")
    public WebElement notMatchWarning;
    @FindBy(xpath = "(//div[@class='input-warning'])[1]")
    public WebElement inputWarningUser;
    @FindBy(xpath = "(//div[@class='input-warning'])[2]")
    public WebElement inputWarningPassword;
    @FindBy(css = ".input-warning")
    public WebElement inavlidUserWarning;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
            BrowserUtils.waitFor(30);//Normalde implicitly wait kullanmıyorum ancan reCaptchanın nasıl tepki vereceği belli olmuyor bu sebeple kullanmak zorunda kaldım
            loginButton.click();
    }

}
