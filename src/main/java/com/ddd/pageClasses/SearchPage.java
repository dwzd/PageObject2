package com.ddd.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    /**
     * 返回出发地文本框元素
     * @param driver
     * @return
     */
    public static WebElement originTextBox (WebDriver driver){
        element = driver.findElement(By.id("flight-origin"));
        return element;
    }
    public static void originTextBoxKeys (WebDriver driver, String keys){
        element = originTextBox(driver);
        element.sendKeys(keys);
    }
    /**
     * 返回目的地文本框元素
     * @param driver
     * @return
     */
    public static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-destination"));
        element.clear();
        return element;
    }
    /**
     * 返回出发日期文本框元素
     * @param driver
     * @return
     */
    public static WebElement departureDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-departing"));
        return element;
    }


    /**
     * 返回返回日期文本框元素
     * @param driver
     * @return
     */
    public static WebElement returnDateTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-returning"));
        return element;
    }
    /**
     * 返回搜索按钮元素
     * @param driver
     * @return
     */
    public static WebElement searchButton(WebDriver driver){
        element = driver.findElement(By.id("search-button"));
        return element;
    }
    /**
     * 点击搜索按钮
     * @param driver
     */
    public static void clickSearchButton (WebDriver driver){
        element = searchButton(driver);
        element.click();
    }
    /**
     * 关闭欢迎提示  //button[@id='modalCloseButton']
     * @param driver
     */

    public static void closeWelcomeNote (WebDriver driver){
        element = driver.findElement(By.xpath("//button[@id='modalCloseButton']"));
        element.click();
    }

}
