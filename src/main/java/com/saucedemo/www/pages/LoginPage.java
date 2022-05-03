package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By verifyText = By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyProductsText(){
        return getTextFromElement(verifyText);
    }




}
