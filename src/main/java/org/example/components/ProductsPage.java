package org.example.components;

import org.example.core.BaseActions;
import org.example.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProductsPage extends BaseActions {
    private static final By PRODUCTS = By.cssSelector(".header_secondary_container .title");
    private static final By PRODUCT_SORT_CONTAINER = By.cssSelector(".product_sort_container");

    public static void verifySuccessfulLoginStandardUser(String expectedProductsContainerOnSuccessfulLogin, String messageOnFailedLogin) {
        String actualResultAfterLoggingIn = waitForElementVisibility(PRODUCTS, 10).getText();
        Assert.assertEquals(actualResultAfterLoggingIn, expectedProductsContainerOnSuccessfulLogin, messageOnFailedLogin);
    }

    public static void SortAToZ() {
        Select productSortContainer = new Select(Browser.driver.findElement(PRODUCT_SORT_CONTAINER));
        productSortContainer.selectByValue("az");
    }

    public static void verifySuccessfulSortAToZ() {
    }
}
