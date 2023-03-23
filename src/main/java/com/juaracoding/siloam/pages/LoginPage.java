package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement txtBtnLogin;
    @FindBy(xpath = "//h1[normalize-space()='Home']")
    WebElement txtHome;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    WebElement menuAdmin;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement btnLogout;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']")
    WebElement txtWrongUsernameorPassword;
    @FindBy(xpath = "//form[@class='margin-bottom-0']")
    WebElement txtPleaseFillThisFields;

    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    WebElement txtDikaSiloam;
    public String getTxtHome(){
        return txtHome.getText();
    }
    public String getTxtWrongUsernameorPassword(){
        return txtWrongUsernameorPassword.getText();
    }
    public void validUsername(String username){
        this.username.sendKeys(username);
    }
    public void validPassword(String password){
        this.password.sendKeys(password);
    }
    public void btnLogin(){
        btnLogin.click();
    }
    public void invalidUsername(String username){
        this.username.sendKeys(username);
    }
    public void invalidPassword(String password){
        this.password.sendKeys(password);
    }
    public void logout(){
        menuAdmin.click();
        btnLogout.click();
    }
    public void loginAdmin(){
       username.sendKeys("admindika");
       password.sendKeys("d1k4@passw0rd");
       btnLogin.click();
    }
    public void loginSales(){
        username.sendKeys("D6200927");
        password.sendKeys("1997-10-23");
        btnLogin.click();
    }
    public String getTxtPleaseFillsThisFields(){
        return txtPleaseFillThisFields.getText();
    }
    public String getTxtUsername(){
        return txtUsername.getText();
    }
    public String getTxtPassword(){
        return txtPassword.getText();
    }
    public String getTxtLoginBtn(){
        return txtBtnLogin.getText();
    }
    public String getTxtDikaSiloam(){return txtDikaSiloam.getText();}
}
