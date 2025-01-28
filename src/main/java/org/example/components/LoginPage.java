package org.example.components;

import org.example.core.BaseActions;
import org.example.utils.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginPage extends BaseActions {
    private static final String loginPageURL = "https://www.saucedemo.com/";
    private static final By USERNAME_FIELD = By.id("user-name");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MESSAGE = By.cssSelector(".error-message-container.error");

    public static void open() {
        Browser.driver.get(loginPageURL);
    }

    public static void Login(String username, String password) {
        type(USERNAME_FIELD, username);
        type(PASSWORD_FIELD, password);
        click(LOGIN_BUTTON);
    }
    public static void verifyPasswordRequiredMessage(String expectedMessageForRequiredPassword, String messageOnFailureWhileGettingTheRequiredPasswordMessage){
        String actualMessageForRequiredPassword = waitForElementVisibility(ERROR_MESSAGE, 10).getText();
        Assert.assertEquals(actualMessageForRequiredPassword, expectedMessageForRequiredPassword, messageOnFailureWhileGettingTheRequiredPasswordMessage);
    }


    public static void verifyUserNameRequiredMessage(String expectedMessageForRequiredUserName, String messageOnFailureWhileGettingTheRequiredUserNameMessage) {
        String actualMessageForRequiredUserName = waitForElementVisibility(ERROR_MESSAGE, 10).getText();
        Assert.assertEquals(actualMessageForRequiredUserName, expectedMessageForRequiredUserName, messageOnFailureWhileGettingTheRequiredUserNameMessage);
    }
}
