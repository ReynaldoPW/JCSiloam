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
    @FindBy(xpath = "//select[@id='destination_faskes']")
    WebElement txtFaskesTujuan;
    @FindBy(xpath = "//select[@id='destination_faskes']")
    WebElement selectFaskesTujuan;

    @FindBy(xpath = "//select[@id='ktp_city']")
    WebElement txtPilihKota;
    @FindBy(xpath = "//select[@id='ktp_city']")
    WebElement selectKotaKtp;

//    @FindBy(xpath = "//*[text()=\"KOTA JAKARTA PUSAT\"]")
//    WebElement pilihJakPus;
//    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-lijv-2||Clinic Kepu Timur||Kota Jakarta Pusat']")
//    WebElement pilihFaskesJakpus;
//    @FindBy(xpath = "//li[@id='select2-destination_faskes-result-mvp8-3||Clinic Bona Indah||Kota Jakarta Selatan']")
//    WebElement pilihFaskesJakSel;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement txtFaskesAwal;
//    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
//    WebElement btnFaskesTujuan;


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

    @FindBy(xpath = "//*[@id=\"row-reason\"]/span")
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
        return txtPilihKota.getAttribute("required");
    }
    public String getTxtFaskesAwal(){
        return txtFaskesAwal.getAttribute("required");
    }
    public String getTxtFaskesTujuan(){
        return txtFaskesTujuan.getAttribute("required");
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


    public void pilihKota(){
        Select selectKota = new Select(selectKotaKtp);
        selectKota.selectByValue("KOTA JAKARTA PUSAT");
    }
    public void pilihKotaKtp(String kota){
        txtPilihKota.sendKeys(kota,Keys.ENTER);
    }

    public void setTxtFaskesTujuan(String faskesTujuan){
        txtFaskesTujuan.sendKeys(faskesTujuan, Keys.ENTER);
    }
    public void pilihFaskesTujuan(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", pilihFaskesJakpus);
        Select selectFaskesDestination = new Select(selectFaskesTujuan);
        selectFaskesDestination.selectByValue("2||Clinic Kepu Timur||Kota Jakarta Pusat");
    }
    public void pilihFaskesTujuanBeda(){
        Select selectFaskesDestinationBeda = new Select(selectFaskesTujuan);
        selectFaskesDestinationBeda.selectByValue("3||Clinic Bona Indah||Kota Jakarta Selatan");
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

    //input data
    public void inputData(String nama, String Bpjs, String KTP, String alamat, String faskesAwal, String alasan) {
        menuInput.click();
        delay(1);
        fieldsName.sendKeys(nama);
        fieldsBpjs.sendKeys(Bpjs);
        fieldsKtp.sendKeys(KTP);
        fieldsAddress.sendKeys(alamat);
        pilihKota();
        inputFaskesAwal(faskesAwal);
        pilihFaskesTujuanBeda();
        delay(1);
        fieldsAlasan.sendKeys(alasan);
        btnSubmit.click();
    }

    //Upload Dokumen
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement fotoFaskesAwalBtn;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement fotoFaskesTujuanBtn;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement fotoTtdDigial;
    @FindBy(xpath = "//input[@id='file']")
    WebElement chooseFile;


    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement btnSaveFile;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement btnAlert;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement btnSelanjutnya;

    public final String fileJpg = "C:\\Users\\Reypau\\Downloads\\photo-1577017040065-650ee4d43339.jpg";

    public void uploadDokumen(String directoryFile1,String directoryFile2,String directoryFile3){
        delay(1);
        fotoFaskesAwalBtn.click();
        chooseFile.sendKeys(directoryFile1);
        delay(1);
        btnSaveFile.click();
        btnAlert.click();
        fotoFaskesTujuanBtn.click();
        chooseFile.sendKeys(directoryFile2);
        delay(1);
        btnSaveFile.click();
        btnAlert.click();
        fotoTtdDigial.click();
        chooseFile.sendKeys(directoryFile3);
        delay(1);
        btnSaveFile.click();
        btnAlert.click();
        delay(1);
        btnSelanjutnya.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    //ttd digital
    @FindBy(xpath = "//button[@id='btnEdit']")
    WebElement btnEdit;
    @FindBy(xpath = "//button[@id='btnUpdate']")
    WebElement btnUpdate;

    @FindBy(xpath = "//button[@id='btnCancelUpdate']")
    WebElement btnCancel;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/a[2]")
    WebElement deleteBefore;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/a[2]")
    WebElement deleteAfter;
    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/a[2]")
    WebElement deleteTTD;

    @FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[1]/td[4]/a")
    WebElement btnAddFilesBefore;

    @FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[2]/td[4]/a")
    WebElement btnAddFilesAfter;

    @FindBy(xpath = "//*[@id=\"fileupload\"]/div/table/tbody/tr[3]/td[4]/a")
    WebElement btnAddFilesTTD;

    @FindBy(xpath = "//a[normalize-space()='Submit']")
    WebElement btnSubmitTTD;

    @FindBy(xpath = "//strong[normalize-space()='Terima kasih dokumen anda sudah lengkap !']")
    WebElement txtAlertDokumenLengkap;

    @FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
    WebElement txtAlertDokumenTidakLengkap;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtDataBerhasilDiSimpan;

    public void clickBtnEdit(){
        btnEdit.click();
    }
    public void editHapusNama(){
        fieldsName.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
    }
    public void simpanDataEdit(){
        btnUpdate.click();
    }
    public void hapusGambarBefore(){
        deleteBefore.click();
    }
    public void hapusGambarAfter(){
        deleteAfter.click();
    }
    public void hapusGambarTTD(){
        deleteTTD.click();
    }
    public void addNewFilesBefore(){
        btnAddFilesBefore.click();
    }
    public void addNewFilesAfter(){
        btnAddFilesAfter.click();
    }
    public void addNewFilesTTD(){
        btnAddFilesTTD.click();
    }

    public void submitTTD(){
        btnSubmitTTD.click();
    }
    public void scrollToSubmit(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", btnSubmitTTD);
    }
    public String getTxtDataBerhasilDisimpan(){
        return txtDataBerhasilDiSimpan.getText();
    }

    //delay
    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
