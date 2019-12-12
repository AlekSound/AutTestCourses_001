package com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();

        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();

        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Prompt')]")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert3.sendKeys("text");
        alert3.accept();





//        WebElement x = driver.findElement(By.id("search_query_top"));
//        x.sendKeys("Blouse");
//        x.sendKeys(Keys.ENTER);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        boolean b = driver.findElement(By.xpath("//*[contains(text(), '1 result has been found.')]")).isDisplayed();
//        System.out.println(b);
//
//        String s = driver.findElement(By.xpath("//*[contains(text(), '1 result has been found.')]")).getTagName();
//        System.out.println(s);



//        WebElement dynamicElement =
//                (new WebDriverWait(driver, 10)).
//                        until(ExpectedConditions.
//                                        presenceOfElementLocated(By.xpath("//*[@title='Faded Short Sleeve T-shirts']")));
//
//        dynamicElement.click();


        //driver.close();

    }
}
