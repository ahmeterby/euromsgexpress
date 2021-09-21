package com.euroMsgExpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;
import java.util.List;

public class UyeEklePage extends BasePage{
@FindBy(css = ".btn")
    public WebElement YeniListeEkle;
@FindBy(css = "[placeholder='Listeye isim ver']")
    public WebElement listeyeIsimVer;
@FindBy(css = ".fa-save")
    public WebElement ListeKaydEt;
@FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement uyeEkle;
@FindBy(xpath = "//a[.='Form ile Ekle']")
    public WebElement formIleEkle;
@FindBy(css = "#firstName")
    public WebElement yeniUyeAd;
@FindBy(css = "#lastName")
    public WebElement yeniUyeSoyad;
@FindBy(css = "#email")
    public WebElement yeniUyeEmail;
@FindBy(css = ".fa-check")
    public WebElement izinOnay;
@FindBy(css = ".btn-labeled")
    public WebElement yeniUyeKaydet;
@FindBy(xpath = "//tr/td")
    public List<WebElement> kaydedilenUye;






}
