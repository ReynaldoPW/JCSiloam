package com.juaracoding.siloam.pages;

import com.juaracoding.siloam.drivers.DriverSingleton;
import io.cucumber.java.en.When;
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
    WebElement dropdownMenuCity;
    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputCity;
    @FindBy(xpath = "//li[@id='select2-ktp_city-result-8183-KOTA JAKARTA PUSAT']")
    WebElement pilihJakPus;
    @FindBy(xpath = "//li[@id='select2-ktp_city-result-mzfg-KOTA JAKARTA SELATAN']")
    WebElement pilihJakSel;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-lijv-2||Clinic Kepu Timur||Kota Jakarta Pusat']")
    WebElement pilihFaskesJakpus;
    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-mvp8-3||Clinic Bona Indah||Kota Jakarta Selatan']")
    WebElement pilihFaskesJakSel;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement txtCity;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement txtFaskesAwal;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement dropdownFaskesTujuan;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement txtFaskesTujuan;
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
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtSuccessSave;
    @FindBy(xpath = "//div[@id='default-tab-1']")
    WebElement txtWarningMessageInputFields;
    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement txtFieldAlamatMessage;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement txtFieldAlasanMessage;

//    public void inputData(String nama,String Bpjs, String KTP, String alamat, String faskesAwal, String alasan){
//        fieldsName.sendKeys(nama);
//        fieldsBpjs.sendKeys(Bpjs);
//        fieldsKtp.sendKeys(KTP);
//        fieldsAddress.sendKeys(alamat);
//        inputCityJakPus();
//        inputFaskesAwal(faskesAwal);
//        inputFaskesTujuanJakPus();
//        btnSubmit.click();
//    }
    public String getTxtFieldAlasanMessage(){
        return txtFieldAlasanMessage.getText();
    }
    public String getTxtFieldAlamatMessage(){
        return txtFieldAlamatMessage.getText();
    }
    public String getTxtNoKTP(){
        return txtKtp.getText();
    }
    public String getTxtNama(){
        return txtName.getText();
    }
    public String getTxtBpjs(){
        return txtBpjs.getText();
    }
    public String getTxtAddress(){
        return txtAddress.getText();
    }
    public String getTxtCity(){
        return txtCity.getText();
    }
    public String getTxtFaskesAwal(){
        return txtFaskesAwal.getText();
    }
    public String getTxtFaskesTujuan(){
        return txtFaskesTujuan.getText();
    }
    public String getTxtAlasan(){
        return txtAlasan.getText();
    }
    public String getTxtSubmit(){
        return txtSubmit.getText();
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
    public void inputCityJakPus() throws InterruptedException {
        dropdownMenuCity.click();
        Thread.sleep(1000);
        inputCity.sendKeys("Jakarta");
        pilihJakPus.click();
    }
    public void inputCityJakSel(){
        dropdownMenuCity.click();
        inputCity.sendKeys("Jakarta");
        pilihJakSel.click();
    }
    public void inputFaskesAwal(String faskesA){
        faskesAwal.sendKeys(faskesA);
    }
    public void inputFaskesTujuanJakPus(){
        dropdownFaskesTujuan.click();
        pilihFaskesJakpus.click();
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
