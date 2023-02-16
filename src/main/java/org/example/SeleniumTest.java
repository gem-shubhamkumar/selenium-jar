package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        System.out.println("Starting test case...");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubham" +
                ".kumar\\Downloads\\Shubham\\ChromeDriver\\chromedriver_win32 - 110\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.close();
    }
}
