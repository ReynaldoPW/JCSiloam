package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class TestReturn {
    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();

    public static ExtentTest extentTest;
    public TestReturn(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("user sudah login")
    public void user_sudah_login(){
        loginpage.loginSales("D6200927","1997-10-23");
        extentTest.log(LogStatus.PASS,"user sudah login");
    }
}
