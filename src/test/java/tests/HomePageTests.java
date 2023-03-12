package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class HomePageTests extends TestBase{



    @Test
    public void checkTitle(){

        String pageTitle = "Delta Air Lines | Flights & Plane Tickets + Hotels & Rental Cars";

        Assert.assertEquals(Driver.getDriver().getTitle(), pageTitle);

    }
}
