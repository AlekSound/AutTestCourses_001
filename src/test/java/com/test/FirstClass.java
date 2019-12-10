package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        WebElement dynamicElement =
                (new WebDriverWait(driver, 10)).
                        until(ExpectedConditions.
                                        presenceOfElementLocated(By.xpath("//*[@title='Faded Short Sleeve T-shirts']")));

        dynamicElement.click();


        driver.close();

    }
}
