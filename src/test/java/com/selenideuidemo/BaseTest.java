package com.selenideuidemo;

import infra.WebDriverHandler;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void setUpAll() {
        new WebDriverHandler().init();
    }
}
