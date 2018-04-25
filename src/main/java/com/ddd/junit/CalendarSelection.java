package com.ddd.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CalendarSelection {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.cn";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[@id=\"modalCloseButton\"]/span[1]")).click();
        Thread.sleep(2000);
        // 查找入住文本框
        WebElement checkInField = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
        // 点击入住文本框
        checkInField.click();
        Thread.sleep(3000);
        // 查找日期元素
        WebElement dateToSelect = driver.findElement(By.xpath("//caption[contains(text(),'十二月')]//parent::table//button[text()='31']"));
        // 点击日期
        dateToSelect.click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        //driver.quit();
    }
}
