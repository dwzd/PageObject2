package com.ddd.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;

    @FindBy(xpath = "//button[@id='modalCloseButton']")
    WebElement closeWelcome;

    @FindBy(id="flight-type-one-way-label")
    WebElement onewayLabel;

    @FindBy(id="flight-type-roundtrip-label")
    WebElement roundtripLabel;

    @FindBy(id="flight-type-multi-dest-label")
    WebElement multidestLabel;

    @FindBy(id = "flight-origin")  //始发地
    WebElement originText;

    @FindBy(id = "flight-destination")
    WebElement destinationText;
    @FindBy(id = "flight-departing")   //出发日期
    WebElement departingText;
    @FindBy(id = "search-button")
    WebElement searchButton;
    @FindBy(id = "flight-adults")
    WebElement chooseAdult;

    //建一个构造函数
    public SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this); //初始化driver 和上面定义的@Find By 的Webelement
    }

    //建一个点击 oneway 的方法 先关闭欢迎
    public void clickWelcome(){
        closeWelcome.click();
    }
    public void clickOneway(){
        onewayLabel.click();
    }
    public void clickRoundtrip(){
        roundtripLabel.click();
    }
    public void clickMulti(){
        multidestLabel.click();
    }

    public void setOriginCity(String originCity){
        originText.sendKeys(originCity);
    }
    public void setDestinationCity(String destinationCity){
        destinationText.sendKeys(destinationCity);
    }
    public void setDepartingDate(String departingDate){
        departingText.sendKeys(departingDate);
    }
    public void setSearchButton(){
        searchButton.click();
    }
    public void setAdult(){
        chooseAdult.click();
    }

}
