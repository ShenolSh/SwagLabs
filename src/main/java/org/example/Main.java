package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.saucedemo.com/");
//        driver.findElements(By.id("user-name"));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        Collections.sort(words);
        System.out.println(words);

    }
}