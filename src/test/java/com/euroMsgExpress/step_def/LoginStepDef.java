package com.euroMsgExpress.step_def;

import com.euroMsgExpress.pages.LoginPage;
import com.euroMsgExpress.pages.MainPage;
import com.euroMsgExpress.utilities.BrowserUtils;
import com.euroMsgExpress.utilities.ConfigurationReader;
import com.euroMsgExpress.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("the user in login page")
    public void the_user_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().girisButton.click();
        BrowserUtils.waitUntilLoaderScreenDisappear();
    }

    @When("the user logged in {string} and {string}")
    public void the_user_logged_in_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("the user should see the urunlerimiz")
    public void the_user_should_see_the_urunlerimiz() {
        new MainPage().urunlerimiz.isDisplayed();
    }

    @When("the user logged {string} and {string}")
    public void the_user_logged_and(String username, String password) {

        loginPage.login(username, password);
    }

    @When("the user should be able to see Username and password did not match")
    public void the_user_should_be_able_to_see_Username_and_password_did_not_match() {
        loginPage.notMatchWarning.isDisplayed();
    }

    @When("the user can not logged in as {string} and {string} and display warning")
    public void the_user_logged_in_as_and(String username, String password) {
        loginPage.login(username, password);
        if (username.length() == 0) {
            loginPage.inputWarning.isDisplayed();
        }else {
            loginPage.notMatchWarning.isDisplayed();
        }

    }
}
