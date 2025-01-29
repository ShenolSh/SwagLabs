package org.example.frontend.positive;

import org.example.components.LoginPage;
import org.example.components.ProductsPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class SortTests extends BaseTest {

    @Test
    public void nameAToZSortWithStandardUser(){
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce");
        ProductsPage.SortAToZ();
        ProductsPage.verifySuccessfulSortAToZ();
    }
}
