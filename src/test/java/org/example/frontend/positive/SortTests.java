package org.example.frontend.positive;

import org.example.components.LoginPage;
import org.example.components.ProductsPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class SortTests extends BaseTest {

    @Test
    public void nameAToZSortWithStandardUser() {
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce");
        ProductsPage.SortAToZ();
        List<String> expectedProductsAlphabeticalOrderAToZ = Arrays.asList
                ("Sauce Labs Backpack",
                        "Sauce Labs Bike Light",
                        "Sauce Labs Bolt T-Shirt",
                        "Sauce Labs Fleece Jacket",
                        "Sauce Labs Onesie",
                        "Test.allTheThings() T-Shirt (Red)");
        ProductsPage.verifySuccessfulSortAToZ(expectedProductsAlphabeticalOrderAToZ, "The products.csv are not sorted as expected");
    }

    @Test
    public void nameZToASortWithStandardUser() {
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce");
        ProductsPage.SortZToA();
        List<String> expectedProductsAlphabeticalOrderAToZ = Arrays.asList
                ("Test.allTheThings() T-Shirt (Red)",
                        "Sauce Labs Onesie",
                        "Sauce Labs Fleece Jacket",
                        "Sauce Labs Bolt T-Shirt",
                        "Sauce Labs Bike Light",
                        "Sauce Labs Backpack");
        ProductsPage.verifySuccessfulSortAToZ(expectedProductsAlphabeticalOrderAToZ, "The products are not sorted as expected");
    }
    @Test
    public void sortPriceLowToHighWithStandardUser() {
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce");
        ProductsPage.SortPriceLowToHigh();
        List<String> expectedProductsPriceLowToHigh = Arrays.asList
                (       "$7.99",
                        "$9.99",
                        "$15.99",
                        "$15.99",
                        "$29.99",
                        "$49.99");
        ProductsPage.verifySuccessfulSortPriceLowToHigh(expectedProductsPriceLowToHigh, "The sorting by price Low to High is not as expected");
    } @Test
    public void sortPriceHighToLowWithStandardUser() {
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce");
        ProductsPage.SortPriceHighToLow();
        List<String> expectedProductsPriceHighToLow = Arrays.asList
                (       "$49.99",
                        "$29.99",
                        "$15.99",
                        "$15.99",
                        "$9.99",
                        "$7.99");
        ProductsPage.verifySuccessfulSortPriceHighToLow(expectedProductsPriceHighToLow, "The sorting by price High to Low is not as expected");
    }


}
