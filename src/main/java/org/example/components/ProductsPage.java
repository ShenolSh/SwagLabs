package org.example.components;

import org.example.core.BaseActions;
import org.example.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductsPage extends BaseActions {
    private static final By PRODUCTS = By.cssSelector(".header_secondary_container .title");
    private static final By PRODUCT_SORT_CONTAINER = By.cssSelector(".product_sort_container");

    private static final By PRODUCTS_TITLES = By.cssSelector(".inventory_item_name");

    public static void verifySuccessfulLoginStandardUser(String expectedProductsContainerOnSuccessfulLogin, String messageOnFailedLogin) {
        String actualResultAfterLoggingIn = waitForElementVisibility(PRODUCTS, 10).getText();
        Assert.assertEquals(actualResultAfterLoggingIn, expectedProductsContainerOnSuccessfulLogin, messageOnFailedLogin);
    }

    public static void SortAToZ() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("az");
    }

    public static void verifySuccessfulSortAToZ() {
        List<WebElement> itemTitles = Browser.driver.findElements(PRODUCTS_TITLES);
        ArrayList<String> actualProductsTitles = new ArrayList<>();
        for (WebElement itemTitle : itemTitles) {

            actualProductsTitles.add(itemTitle.getText());
        }
        ArrayList<String> productsTitle = new ArrayList<>(Arrays.asList("Sauce Labs Backpack",
                "Sauce Labs Bike Light",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Onesie",
                "Test.allTheThings() T-Shirt (Red)"));

    }




}

