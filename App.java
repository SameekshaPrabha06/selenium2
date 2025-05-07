package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Open the target web page
        driver.get("https://www.saucedemo.com/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Fill in the username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        // Fill in the password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        // Click on the Login button
        driver.findElement(By.id("login-button")).click();
    }
}

