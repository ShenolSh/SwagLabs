package org.example.frontend.negative;

import org.example.components.LoginPage;
import org.example.core.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void unsuccessful_login_withoutPassword() {
        LoginPage.open();
        LoginPage.Login("standard_user", "");
        LoginPage.verifyPasswordRequiredMessage("Epic sadface: Password is required", "T he test for error message for required password was failed");

    }

    @Test
    public void unsuccessful_login_withoutUserName() {
        LoginPage.open();
        LoginPage.Login("", "secret_sauce");
        LoginPage.verifyUserNameRequiredMessage("Epic sadface: Username is required", "The test for error message for required user name was failed");
    }

}
