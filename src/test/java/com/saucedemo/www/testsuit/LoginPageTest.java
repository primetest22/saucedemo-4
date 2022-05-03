package com.saucedemo.www.testsuit;

import com.saucedemo.www.pages.LoginPage;

import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    //object creation
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //enter valid valid values
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        //validate products text
        String expectedMessage = "PRODUCTS";
        String actualMessage = loginPage.verifyProductsText();

        Assert.assertEquals(actualMessage, expectedMessage, "PRODUCTS text not displayed");


    }


}
