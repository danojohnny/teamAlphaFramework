package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.LoginPage;
import utils.Driver;

public class HomePageTests extends TestBase{



    @Test
    public void checkTitle(){


        String pageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";

        Assert.assertEquals(Driver.getDriver().getTitle(), pageTitle);

    }

    @Test
    public void navigationBar(){
        LoginPage loginPage = new LoginPage();
        String navBook = "BOOK";
        String navCHECKIn = "CHECK-IN";
        String navMyTRIPS = "MY TRIPS";
        String navFlightSTATUS = "FLIGHT STATUS";

        Assert.assertEquals(loginPage.getBook().getText(), navBook);
        Assert.assertEquals(loginPage.getCheckIn().getText(), navCHECKIn);
        Assert.assertEquals(loginPage.getMyTrips().getText(), navMyTRIPS);
        Assert.assertEquals(loginPage.getFlightStatus().getText(), navFlightSTATUS);

    }

    @Test
    public void flightForm(){
        Assert.assertEquals(Driver.getDriver().findElement(By.id("fromAirportName")).findElement(By.className("airport-code")).getText(), "From");
        Assert.assertEquals(Driver.getDriver().findElement(By.id("toAirportName")).findElement(By.className("airport-code")).getText(), "To");


    }

    @Test
    public void loginForm(){

        LoginPage loginPage = new LoginPage();
        loginPage.ableToLogin();
        Assert.assertNotNull(loginPage.getLogBody().getText());
        Assert.assertNotNull(loginPage.getLogUserId().getText());
        Assert.assertNotNull(loginPage.getLogPassword().getText());


    }

}