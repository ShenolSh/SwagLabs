package org.example.components;

import org.example.core.BaseActions;
import org.example.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BaseActions {
    private static final By PRODUCTS = By.cssSelector(".header_secondary_container .title");
    private static final By PRODUCT_SORT_CONTAINER = By.cssSelector(".product_sort_container");
    private static final By PRODUCTS_TITLES = By.cssSelector(".inventory_item_name");
    private static final By PRODUCTS_PRICE = By.cssSelector(".inventory_item_price");

    public static void verifySuccessfulLoginStandardUser(String expectedProductsContainerOnSuccessfulLogin, String messageOnFailedLogin) {
        String actualResultAfterLoggingIn = waitForElementVisibility(PRODUCTS, 10).getText();
        Assert.assertEquals(actualResultAfterLoggingIn, expectedProductsContainerOnSuccessfulLogin, messageOnFailedLogin);
    }
    public static void SortAToZ() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("az");
    }
    public static void SortZToA() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("za");
    }
    public static void verifySuccessfulSortAToZ(List<String> expectedProductsAlphabeticalOrderAToZ, String messageOnWrongSortingResult) {
        List<WebElement> itemTitles = Browser.driver.findElements(PRODUCTS_TITLES);
        ArrayList<String> actualProductsTitlesSortedAToZ = new ArrayList<>();
        for (WebElement itemTitle : itemTitles) {
            actualProductsTitlesSortedAToZ.add(itemTitle.getText());
        }
        Assert.assertEquals(actualProductsTitlesSortedAToZ, expectedProductsAlphabeticalOrderAToZ, messageOnWrongSortingResult);

    }
    public static void SortPriceLowToHigh() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("lohi");
    }
    public static void verifySuccessfulSortPriceLowToHigh(List<String> expectedProductsPriceLowToHigh, String messageOnWrongSortingLowToHighResult) {
        List<WebElement> itemTitles = Browser.driver.findElements(PRODUCTS_PRICE);
        ArrayList<String> actualProductsPriceSortedLowToHigh = new ArrayList<>();
        for (WebElement itemTitle : itemTitles) {
            actualProductsPriceSortedLowToHigh.add(itemTitle.getText());
        }
        Assert.assertEquals(actualProductsPriceSortedLowToHigh, expectedProductsPriceLowToHigh, messageOnWrongSortingLowToHighResult);
    }

    public static void SortPriceHighToLow() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("hilo");
    }

    public static void verifySuccessfulSortPriceHighToLow(List<String> expectedProductsPriceHighToLow, String messageOnWrongSortingHighToLowResult) {
        List<WebElement> itemTitles = Browser.driver.findElements(PRODUCTS_PRICE);
        ArrayList<String> actualProductsPriceSortedHighToLow = new ArrayList<>();
        for (WebElement itemTitle : itemTitles) {
            actualProductsPriceSortedHighToLow.add(itemTitle.getText());
        }
        Assert.assertEquals(actualProductsPriceSortedHighToLow, expectedProductsPriceHighToLow, messageOnWrongSortingHighToLowResult);
    }

}

