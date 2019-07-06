package com.nkma.nangkhieumaianh.scripts;

import com.nkma.nangkhieumaianh.pages.users.HomePage;
import com.nkma.nangkhieumaianh.pages.users.IntroPage;
import com.nkma.nangkhieumaianh.utils.LogUtil;
import com.nkma.nangkhieumaianh.utils.WDUtil;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NKMAScript {

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    }

    @AfterSuite
    public void afterSuite() {
        LogUtil.getInstance().flush();
    }

    /*@Test
    public void listEvent() {
        WebDriver driver = WDUtil.createWebDriver();
        ExtentTest logger = LogUtil.getInstance().startTest(
                "Verify List Event Display",
                "Step1: ..."
        );

        EventPage eventPage = new EventPage(driver, logger);
        eventPage.navigate();
        eventPage.listEventItem();

        LogUtil.getInstance().endTest(logger);
        driver.quit();

        boolean result = eventPage.getEventSize() > 0;
        Assert.assertTrue(result, "Empty Size");
    }*/

    @Test
    public void verifyIntroPageDisplay() {
        WebDriver driver = WDUtil.createWebDriver();
        ExtentTest logger = LogUtil.getInstance().startTest(
                "Verify Info Page Display",
                "Step1: ..."
        );

        HomePage homePage = new HomePage(driver, logger);
        homePage.navigate();
        homePage.clickIntro();

        IntroPage introPage = new IntroPage(driver, logger);
        boolean isDisplay = introPage.isDisplay();
        Assert.assertTrue(isDisplay, "Intro page do not display");

        LogUtil.getInstance().endTest(logger);
        driver.quit();
    }

    /*@Test
    public void verifyMonNK() {
        WebDriver driver = WDUtil.createWebDriver();
        ExtentTest logger = LogUtil.getInstance().startTest(
                "Verify Menu Mon Nang Khieu Display",
                "Step1: ..."
        );

        HomePage homePage = new HomePage(driver, logger);
        homePage.navigate();
        homePage.hoverMonNK();

        boolean isDisplay = homePage.isMenuNKDisplay();
        Assert.assertTrue(isDisplay, "Menu Mon Nang Khieu does not display");

        LogUtil.getInstance().endTest(logger);
        driver.quit();
    }*/
}
