package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.HotelPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

public class HotelTests extends TestBase {



    public void EnterHotelLocation(){
        Driver.getDriver().findElement(By.id("location-field-destination")).sendKeys("MIA");

    }

    public void clickOnMiami(){
        Actions action = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.id("data-stid='location-field-destination-result-item-button'"));
        action.moveToElement(element).click().perform();
    }



    }


