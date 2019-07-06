package com.nkma.nangkhieumaianh.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;

public class LogUtil {

    ExtentReports extent;

    private static LogUtil instance;

    public static LogUtil getInstance() {
        if (instance == null)
            instance = new LogUtil();

        return instance;
    }

    private LogUtil() {
        extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/report.html", true);
        extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
    }

    public ExtentTest startTest(String title, String desc) {
        return extent.startTest(title, desc);
    }

    public void endTest(ExtentTest logger) {
        extent.endTest(logger);
    }

    public void flush() {
        extent.flush();
        extent.close();
    }
}
