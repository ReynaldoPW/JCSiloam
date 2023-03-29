package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPages {
    private WebDriver driver;
    public SalesPages(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='name']")
    WebElement fieldsName;
    @FindBy(xpath = "//input[@id='name']")
    WebElement txtName;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement fieldsBpjs;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement txtBpjs;
    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement fieldsKtp;
    @FindBy(xpath ="//input[@id='no_ktp']")
    WebElement txtKtp;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement fieldsAddress;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement txtAddress;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement btnKota;
    @FindBy(xpath = "//input[@role='textbox']")
    WebElement txtFaskesTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement txtPilihKota;
    @FindBy(xpath = "//*[text()=\"KOTA JAKARTA PUSAT\"]")
    WebElement pilihJakPus;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-lijv-2||Clinic Kepu Timur||Kota Jakarta Pusat']")
    WebElement pilihFaskesJakpus;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-mvp8-3||Clinic Bona Indah||Kota Jakarta Selatan']")
    WebElement pilihFaskesJakSel;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement txtFaskesAwal;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement btnFaskesTujuan;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement txtFaskesTujuanField;

    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement fieldsAlasan;
    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement txtAlasan;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement txtSubmit;
    @FindBy(xpath = "//span[normalize-space()='Input']")
    WebElement menuInput;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]")
    WebElement txtSuccessSave;
    @FindBy(xpath = "//div[@id='default-tab-1']")
    WebElement txtWarningMessageInputFields;
    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement txtFieldAlamatMessage;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement txtFieldAlasanMessage;

    @FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
    WebElement txtBpjsAlreadyExist;


    public String getTxtBpjsAlreadyExist(){
        return txtBpjsAlreadyExist.getText();
    }
    public String getTxtFieldAlasanMessage(){
        return txtFieldAlasanMessage.getText();
    }
    public String getTxtFieldAlamatMessage(){
        return txtFieldAlamatMessage.getText();
    }
    public String getTxtNoKTP(){
        return txtKtp.getAttribute("required");
    }
    public String getTxtNama(){
        return txtName.getAttribute("required");
    }
    public String getTxtBpjs(){
        return txtBpjs.getAttribute("required");
    }
    public String getTxtAddress(){
        return txtAddress.getAttribute("required");
    }
    public String getTxtCity(){
        return btnKota.getAttribute("required");
    }
    public String getTxtFaskesAwal(){
        return txtFaskesAwal.getAttribute("required");
    }
    public String getTxtFaskesTujuan(){
        return txtFaskesTujuanField.getAttribute("required");
    }
    public String getTxtAlasan(){
        return txtAlasan.getAttribute("required");
    }
    public void inputName(String name){
       fieldsName.sendKeys(name);
    }
    public void inputBpjs(String nobpjs){
        fieldsBpjs.sendKeys(nobpjs);
    }
    public void inputKtp(String noktp){
        fieldsKtp.sendKeys(noktp);
    }
    public void btnKota(){
        btnKota.click();
    }

    public void pilihKota(){
        pilihJakPus.click();
    }
    public void pilihKotaKtp(String kota){
        txtPilihKota.sendKeys(kota,Keys.ENTER);
    }
    public void btnFaskesTujuan(){
        btnFaskesTujuan.click();
    }
    public void setTxtFaskesTujuan(String faskesTujuan){
        txtFaskesTujuan.sendKeys(faskesTujuan, Keys.ENTER);
    }
    public void pilihFaskesTujuan(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", pilihFaskesJakpus);
    }
    public void pilihFaskesTujuanJakSel(){
       pilihFaskesJakSel.click();
    }
    public void inputFaskesAwal(String faskesA){
        faskesAwal.sendKeys(faskesA);
    }

    public String getTxtWarningPleaseInputMessage(){
        return txtWarningMessageInputFields.getText();
    }
    public void inputAlasan(String alasan){
        fieldsAlasan.sendKeys(alasan);
    }
    public void inputAddress(String address){
        fieldsAddress.sendKeys(address);
    }
    public void btnSubmit(){
        btnSubmit.click();
    }
    public void menuInput(){
        menuInput.click();
    }
    public String getTxtSuccessSave(){
        return txtSuccessSave.getText();
    }
}
