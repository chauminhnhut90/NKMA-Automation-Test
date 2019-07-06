package com.nkma.nangkhieumaianh;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TestNG testng = new TestNG();

        List<String> list = Lists.newArrayList();
        list.add("./testng.xml");
        testng.setTestSuites(list);

        testng.run();
        // Hello
    }

}
