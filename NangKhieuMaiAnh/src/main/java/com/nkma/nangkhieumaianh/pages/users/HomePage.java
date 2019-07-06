package com.nkma.nangkhieumaianh.pages.users;

import com.nkma.nangkhieumaianh.utils.Util;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Giới thiệu')]")
    private WebElement intro;

    @FindBy(xpath = "//a[@title='Môn Năng Khiếu']")
    private WebElement monNK;

    @FindBy(xpath = "//a[contains(@title,'Toán Tư Duy')]")
    private WebElement toanTuDuy;

    @FindBy(xpath = "//a[contains(@title,'Anh Văn')]")
    private WebElement anhVan;

    @FindBy(xpath = "//a[contains(@title,'Mỹ Thuật')]")
    private WebElement myThuat;

    @FindBy(xpath = "//a[contains(@title,'Thể Dục Aerobic')]")
    private WebElement theDuc;

    @FindBy(xpath = "//a[contains(@title,'Luyện Chữ Đẹp')]")
    private WebElement luyenChuDep;

    public HomePage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
    }

    public void navigate() {
        String url = "https://www.nangkhieumyanh.edu.vn/";
        this.driver.get(url);
        this.logger.log(LogStatus.INFO, "Naviagte to: " + url);
    }

    public void clickIntro() {
        this.intro.click();
        this.logger.log(LogStatus.INFO, "Click Gioi Thieu");
    }

    public void hoverMonNK() {
        Actions actions = new Actions(driver);
        actions.moveToElement(monNK).perform();
        Util.sleep(1000);

        this.logger.log(LogStatus.INFO, "Hover Mon Nawn Khieu");
    }

    public boolean isMenuNKDisplay() {
        boolean isToanTuDuyDisplay = this.toanTuDuy.isDisplayed();
        boolean isAnhVanDisplay = this.anhVan.isDisplayed();
        boolean isMyThuatDisplay = this.myThuat.isDisplayed();
        boolean isTheDucDisplay = this.theDuc.isDisplayed();
        boolean isLuyenChuDepDisplay = this.luyenChuDep.isDisplayed();

        boolean kq = false;
        if (isToanTuDuyDisplay == true && isAnhVanDisplay == true
                && isMyThuatDisplay == true && isTheDucDisplay == true
                && isLuyenChuDepDisplay == true)
            kq = true;

        if (kq) {
            logger.log(LogStatus.PASS, "Passed");
        } else {
            logger.log(LogStatus.PASS, "Failed");
        }

        return kq;
    }
}
