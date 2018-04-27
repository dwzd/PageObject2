package com.ddd.testng.testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testng_parallel_parameter {
    WebDriver driver;
    String baseUrl;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String browser) {
        baseUrl = "https://www.yahoo.com";
        if(browser.equalsIgnoreCase("edge")){
            //System.setProperty("webdriver.ie.driver", "D:\\Java\\SeleniumWebDriverJava2\\src\\main\\resources\\IEDriverServer.exe");
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.findElement(By.id("uh-signin")).click();
        WebElement userName = driver.findElement(By.id("login-username"));
        userName.sendKeys("darwin");
        Thread.sleep(100);
//        driver.findElement(By.id("login-signin")).click();

    }

    @AfterClass
    public void tearDown() {

    }
}
