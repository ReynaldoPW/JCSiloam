package com.juaracoding.siloam;

import com.juaracoding.siloam.pages.LoginPage;
import com.juaracoding.siloam.pages.SalesPages;
import com.juaracoding.siloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTTDDigital {
    public static WebDriver driver;
    public static LoginPage loginpage = new LoginPage();
    public static SalesPages salespage = new SalesPages();

    public static ExtentTest extentTest;
    public TestTTDDigital(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //INPUT TTD DIGITAL
    @Given("User sudah membuka alamat url login input data dan upload dokumen")
    public void user_sudah_membuka_alamat_url_login_input_data_dan_upload_dokumen(){
        driver.get(Constants.URL);
        loginpage.loginSales("D6200927","1997-10-23");
        salespage.inputData("test","1234565678456","1212121212121212","jljl","abcde","jauh");
        salespage.uploadDokumen(salespage.fileJpg, salespage.fileJpg, salespage.fileJpg);
        extentTest.log(LogStatus.PASS,"User sudah membuka alamat url login input data dan upload dokumen");
    }
    @When("User edit nama menjadi null")
    public  void user_edit_nama_menjadi_null(){
        salespage.clickBtnEdit();
        salespage.editHapusNama();
        extentTest.log(LogStatus.PASS,"User edit nama menjadi null");
    }
    @And("User click simpan data")
    public void user_click_simpan_data(){
        salespage.simpanDataEdit();
        extentTest.log(LogStatus.PASS,"User click simpan data");
    }
    @Then("User mendapatkan info data berhasil disimpan")
    public void user_mendapatkan_info_data_berhasil_disimpan(){
        Hooks.delay(1);
        String txtDataBerhasilDisimpan = salespage.getTxtDataBerhasilDisimpan();
        Assert.assertTrue(txtDataBerhasilDisimpan.contains("Data"));
        extentTest.log(LogStatus.PASS,"User mendapatkan info data berhasil disimpan");
    }
}
