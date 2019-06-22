package com.nkma.nangkhieumaianh.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WDUtil {

    private static final int TIME_OUT = 10;

    public static WebDriver createWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

}
