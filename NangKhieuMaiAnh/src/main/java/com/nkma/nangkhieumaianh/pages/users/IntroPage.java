package com.nkma.nangkhieumaianh.pages.users;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntroPage extends BasePage {

    @FindBy(xpath = "//div[@class='ptitle']")
    private WebElement title;

    public IntroPage(WebDriver driver, ExtentTest logger) {
        super(driver, logger);
    }

    public boolean isDisplay() {
        String title = getTitle().toUpperCase();
        boolean kq = false;
        if (title.equals("GIỚI THIỆU"))
            kq = true;

        if (kq) {
            logger.log(LogStatus.PASS, "Passed");
        } else {
            logger.log(LogStatus.ERROR, "Failed");
        }

        return kq;
    }

    public String getTitle() {
        return this.title.getText();
    }
}
