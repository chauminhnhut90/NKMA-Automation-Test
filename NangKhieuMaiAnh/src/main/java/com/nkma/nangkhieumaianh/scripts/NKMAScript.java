package com.nkma.nangkhieumaianh.scripts;

import com.nkma.nangkhieumaianh.pages.users.EventPage;
import com.nkma.nangkhieumaianh.utils.WDUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NKMAScript {

    @BeforeSuite
    public void setUpWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/macbook/Downloads/chromedriver");
    }

    @Test
    public void listEvent() {
        WebDriver driver = WDUtil.createWebDriver();
        EventPage eventPage = new EventPage(driver);
        eventPage.navigate();
        eventPage.listEventItem();

        if (eventPage.getEventSize() > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false, "Empty Size");
        }
        
        driver.quit();
    }
}
