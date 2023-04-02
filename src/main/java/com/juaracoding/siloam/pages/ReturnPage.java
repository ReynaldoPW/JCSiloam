package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnPage {
    private WebDriver driver;

    public ReturnPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Form Return buka menu new
    @FindBy(xpath = "//span[normalize-space()='New']")
    WebElement menuNew;

    @FindBy(xpath = "//input[@id='tgl']")
    WebElement inputTglStart;

    @FindBy(xpath = "//input[@id='tgl2']")
    WebElement inputTglEnd;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtHeader;

    @FindBy(xpath = "//select[@id='status']")
    WebElement selectStatus;
    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement btnFilter;
    @FindBy(xpath = "//button[@id='btn-reset']")
    WebElement btnReset;
    @FindBy(xpath = "//input[@type='search']")
    WebElement inputSearch;
    @FindBy(xpath = "//span[@id='btnSearch']")
    WebElement btnSearch;
    @FindBy(xpath = "//span[@id='btnRefresh']")
    WebElement btnRefresh;
    @FindBy(xpath = "//select[@name='table_length']")
    WebElement selectTableEntries;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/center[1]/a[1]")
    WebElement viewDataAtas;
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement btnPrevious;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement btnNext;


}
