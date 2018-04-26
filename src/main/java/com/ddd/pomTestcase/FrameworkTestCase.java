package com.ddd.pomTestcase;

import com.ddd.pageClasses.SearchPageFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPageFactory;

    @Before
    public void beforeClass(){
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia-cn.com";
        searchPageFactory = new SearchPageFactory(driver); //初始化要放在 ChromeDriver 之后执行
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void testSearchFlight() throws InterruptedException {
        searchPageFactory.clickWelcome();
        Thread.sleep(3000);
        searchPageFactory.clickOneway();
        searchPageFactory.setOriginCity("蒙特利尔, 魁北克, 加拿大 (YMQ)");
        searchPageFactory.setDestinationCity("多伦多, 安大略, 加拿大 (YTO)");
        searchPageFactory.setDepartingDate("2018/06/01");
        searchPageFactory.setAdult();
        searchPageFactory.setSearchButton();

    }





}
