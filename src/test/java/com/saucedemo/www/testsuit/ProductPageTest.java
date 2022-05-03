package com.saucedemo.www.testsuit;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductsPage;
import com.saucedemo.www.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductPageTest extends TestBase {

    ProductsPage productsPage = new ProductsPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        
        //validate six products displayed
        productsPage.enterUserName("standard_user");
        productsPage.enterPassword("secret_sauce");
        productsPage.clickOnLoginButton();
        productsPage.verifyProducts();

    }






}
