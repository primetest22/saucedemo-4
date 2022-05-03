package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");


    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void verifyProducts(){
        int i;
        //create array to validate six products are present on page
        String[] products = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};

        for (i = 1; i < 7; i++) {

            //To verify element is present on page or not.
            String xPath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[" + i + "]";

            Boolean isElementPresent = driver.findElements(By.xpath(xPath)).size() != 0;

            if (isElementPresent == true) {
                System.out.println(i + " " + products[i - 1] + " is present");
            } else {
                System.out.print("\n" + i + " Product is Not Present On The Page");
            }
        }
    }



}
