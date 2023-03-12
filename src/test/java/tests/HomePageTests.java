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

    @Test
    public void flightForm(){

        Assert.assertEquals(Driver.getDriver().findElement(By.id("fromAirportName")).findElement(By.className("airport-code")).getText(), "From");
        Assert.assertEquals(Driver.getDriver().findElement(By.id("toAirportName")).findElement(By.className("airport-code")).getText(), "To");


    }

    @Test
    public void loginForm(){
        Driver.getDriver().findElement( By.id("login-modal-button")).click();
        Assert.assertNotNull(Driver.getDriver().findElement(By.id("login-content-body")));
        Assert.assertNotNull(Driver.getDriver().findElement(By.id("userId")));
        Assert.assertNotNull(Driver.getDriver().findElement(By.id("password")));


    }

}
