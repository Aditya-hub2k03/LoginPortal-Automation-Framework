package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    @Test
    public void testValidLogin() {
        logger.info("Starting valid login test...");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john@example.com", "12345");
        Assert.assertTrue(loginPage.getPageSource().contains("Welcome"));
        logger.info("Valid login test passed.");
    }

    @Test
    public void testInvalidLogin() {
        logger.info("Starting invalid login test...");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrong@example.com", "wrongpass");
        Assert.assertTrue(loginPage.getPageSource().contains("Login Failed"));
        logger.info("Invalid login test passed.");
    }
}
