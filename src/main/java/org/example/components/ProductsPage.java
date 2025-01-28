package org.example.components;

import org.example.core.BaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductsPage extends BaseActions {
    private static final By PRODUCTS = By.cssSelector(".header_secondary_container .title");

    public static void verifySuccessfulLoginStandardUser(String expectedProductsContainerOnSuccessfulLogin, String messageOnFailedLogin) {
        String actualResultAfterLoggingIn = waitForElementVisibility(PRODUCTS, 10).getText();
        Assert.assertEquals(actualResultAfterLoggingIn, expectedProductsContainerOnSuccessfulLogin, messageOnFailedLogin);
    }
}
