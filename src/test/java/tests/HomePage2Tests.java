package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login2Page;
import utils.ConfigReader;
import utils.Driver;

public class HomePage2Tests extends TestBase{


    @Test (groups = {"smoke"})
    public void positiveLoginPageObjectModel(){

        logger.info("Navigating to Login Page");
        Login2Page loginPage = new Login2Page();
        loginPage.ableToLogin();
        logger.info("Entering th username");
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        logger.info("Entering the password");
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        logger.info("Clicking login button");
        loginPage.clickLoginButton();

        Assert.assertEquals( Driver.getDriver().getTitle(), "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars");
    }

    @Test (groups = {"smoke"})
    public void negativeLoginPageObjectModel(){

        logger.info("Navigating to Login Page");
        Login2Page loginPage = new Login2Page();
        loginPage.ableToLogin();
        logger.info("Entering th username");
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        logger.info("Entering the password");
        loginPage.enterPassword(ConfigReader.getProperty("password-wrong"));
        logger.info("Clicking login button");
        loginPage.clickLoginButton();

        Assert.assertTrue(Driver.getDriver().findElement(By.id("formAlertId")).isDisplayed());

    }

    @Test (groups = {"smoke"})
    public void wrongUsernameTest() {

        logger.info("Navigating to Login Page");
        Login2Page loginPage = new Login2Page();
        loginPage.ableToLogin();
        logger.info("Entering th username");
        loginPage.enterUsername("2");
        loginPage.enterPassword(ConfigReader.getProperty("password-wrong"));

        Assert.assertTrue(Driver.getDriver().findElement(By.className("errorMessageText")).isDisplayed());

    }
    @Test (groups = {"smoke"})
    public void wrongPassWord() {

        logger.info("Navigating to Login Page");
        Login2Page loginPage = new Login2Page();
        loginPage.ableToLogin();
        logger.info("Entering th username");
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword("2");
        logger.info("Clicking login button");
        loginPage.clickLoginButton();

        Assert.assertTrue(Driver.getDriver().findElement(By.className("errorMessageText")).isDisplayed());

    }




}
