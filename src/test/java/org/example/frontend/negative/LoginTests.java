package org.example.frontend.negative;

import org.example.components.LoginPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void unSuccessful_login(){
        LoginPage.open();
        LoginPage.Login("standard_user", "");
        LoginPage.verifyPasswordRequiredMessage("Epic sadface: Password is required", "The test was not successful");

    }
}
