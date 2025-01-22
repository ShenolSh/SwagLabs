package org.example.core;

import org.example.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseActions {
    // Method for waiting until an element is visible
    protected static WebElement waitForElementVisibility(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected static void type(By locator, String text) {
        Browser.driver.findElement(locator).sendKeys(text);
    }

    protected static void click(By locator) {
        Browser.driver.findElement(locator).click();
    }

    protected static String getText(By locator) {
        waitForElementVisibility(locator, 10); // Wait until the element is visible before getting attributes
        return Browser.driver.findElement(locator).getText();
    }

    protected static String getAttributes(By locator, String attribute) {
        waitForElementVisibility(locator, 10); // Wait until the element is visible before getting attributes
        return Browser.driver.findElement(locator).getAttribute(attribute);
    }

}
