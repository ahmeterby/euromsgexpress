package com.euroMsgExpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//p[.='Ürünlerimiz']")
    public WebElement urunlerimiz;
    @FindBy(xpath = "//b[.='Üye Ekle']")
    public WebElement uyeEkle;

}
