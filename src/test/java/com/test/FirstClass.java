package com.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions x = new Actions(driver);
        x.contextClick(driver.findElement(By.id("hot-spot"))).perform();

        //driver.findElement(By.id("hot-spot")).contextClick();

//        WebElement source = driver.findElement(By.id("column-a"));
//        WebElement target = driver.findElement(By.id("column-b"));
//        Actions builder = new Actions(driver);
//        builder.dragAndDrop(source, target).perform();

        //System.out.println(getTextByJS(driver.findElement(By.id("finish")).findElement(By.xpath("//.[contains(text(), 'Hello World!')]")), driver));

        //driver.quit();
    }
    public static String getTextByJS(final WebElement element, WebDriver driver) {
        String script = "var element = arguments[0];" + "return element.textContent;";
        return (String) ((JavascriptExecutor)driver).executeScript(script, element);
    }

}
