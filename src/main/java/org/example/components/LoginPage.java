package org.example.components;

import org.example.core.BaseActions;
import org.openqa.selenium.By;

public class LoginPage extends BaseActions {
        private static final String loginPageURL = "https://www.saucedemo.com/";
        private static final By USERNAME_FIELD = By.id("user-name");
        private static final By PASSWORD_FIELD = By.id("password");
        private static final By LOGIN_BUTTON = By.id("login-button");


}
