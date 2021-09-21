package com.euroMsgExpress.step_def;

import com.euroMsgExpress.pages.UyeEklePage;
import com.euroMsgExpress.pages.MainPage;
import com.euroMsgExpress.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class uyeEkleStepDef {
    MainPage mainPage = new MainPage();
    UyeEklePage uyeEklePage = new UyeEklePage();

    @Given("user should be able join uye ekle")
    public void user_should_be_able_join_uye_ekle() {
        BrowserUtils.scrollToElement(mainPage.uyeEkle);
        mainPage.uyeEkle.click();
    }

    @When("user should be able to click yeni liste button")
    public void user_should_be_able_to_click_yeni_liste_button() {
        uyeEklePage.YeniListeEkle.click();

    }

    @When("user should be able to write a {string}")
    public void user_should_be_able_to_write_a(String listeIsmi) {
        uyeEklePage.listeyeIsimVer.sendKeys(listeIsmi);

    }

    @When("user should be able to click kaydet button")
    public void user_should_be_able_to_click_kaydet_button() {
        uyeEklePage.ListeKaydEt.click();

    }

    @When("user should be able to click uye ekle and form ile ekle")
    public void user_should_be_able_to_click_uye_ekle_and_form_ile_ekle() {
        uyeEklePage.uyeEkle.click();
        uyeEklePage.formIleEkle.click();
    }

    @When("user should be able to add new uye and verify new uye")
    public void user_should_be_able_to_add_new_uye(Map<String, String> userInfo) {
        uyeEklePage.yeniUyeAd.sendKeys(userInfo.get("ad"));
        uyeEklePage.yeniUyeSoyad.sendKeys(userInfo.get("soyad"));
        uyeEklePage.yeniUyeEmail.sendKeys(userInfo.get("email"));

        uyeEklePage.izinOnay.click();
        uyeEklePage.yeniUyeKaydet.click();

        List<String> expectedInfo = new ArrayList<>();
        expectedInfo.add(userInfo.get("email"));
        expectedInfo.add(userInfo.get("ad"));
        expectedInfo.add(userInfo.get("soyad"));

        List<String> actualInfo = BrowserUtils.getElementsText(uyeEklePage.kaydedilenUye);

        Assert.assertEquals(expectedInfo, actualInfo);


    }


}
