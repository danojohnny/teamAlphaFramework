package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class HomePageTests extends TestBase{



    @Test
    public void checkTitle(){

        String pageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";

        Assert.assertEquals(Driver.getDriver().getTitle(), pageTitle);

    }

    @Test
    public void navigationBar(){

        String navBook = "BOOK";
        String navCHECKIn = "CHECK-IN";
        String navMyTRIPS = "MY TRIPS";
        String navFlightSTATUS = "FLIGHT STATUS";

        Assert.assertEquals(Driver.getDriver().findElement( By.id("headPrimary1")).getText(), navBook);
        Assert.assertEquals(Driver.getDriver().findElement( By.id("headPrimary2")).getText(), navCHECKIn);
        Assert.assertEquals(Driver.getDriver().findElement( By.id("headPrimary3")).getText(), navMyTRIPS);
        Assert.assertEquals(Driver.getDriver().findElement( By.id("headPrimary4")).getText(), navFlightSTATUS);

    }
}
