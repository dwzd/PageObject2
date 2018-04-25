package com.ddd.pageClasses;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia-cn.com/";

        // 窗口最大化
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        driver.get(baseUrl);
        SearchPage.closeWelcomeNote(driver);
        //SearchPage.originTextBox(driver).sendKeys("beijing");
        SearchPage.originTextBoxKeys(driver, "beijing");
        SearchPage.destinationTextBox(driver).sendKeys("shanghai");
        SearchPage.departureDateTextBox(driver).sendKeys("2018/05/15");
        SearchPage.returnDateTextBox(driver).clear();
        SearchPage.returnDateTextBox(driver).sendKeys("2018/06/18");
        SearchPage.clickSearchButton(driver);

    }
}
