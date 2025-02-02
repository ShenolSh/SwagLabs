package org.example.frontend.positive;

import org.example.components.LoginPage;
import org.example.components.ProductsPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    /**
     * This tests a successfull login with standard user.
     */
    @Test
    public void successful_login_test_standard_user(){
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce" );
        ProductsPage.verifySuccessfulLoginStandardUser("Products", "The logging in test with standard_user account was not successful");
    }


    @Test
    public void login_test_locked_out_user(){
        LoginPage.open();
        LoginPage.Login("locked_out_user", "secret_sauce" );
        LoginPage.verifyErrorMessageForLockedOutUser("Epic sadface: Sorry, this user has been locked out.", "The logging in test with locked_out_user account was not successful");
    }


}
