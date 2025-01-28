package org.example.frontend.positive;

import org.example.components.LoginPage;
import org.example.components.ProductsPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void successful_login_test_standard_user(){
        LoginPage.open();
        LoginPage.Login("standard_user", "secret_sauce" );
        ProductsPage.verifySuccessfulLoginStandardUser("Products", "The logging in test with standard_user account was not successful");
    }


}
