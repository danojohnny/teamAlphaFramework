package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.FlightsPage;
import utils.Driver;

public class SearchFlightsTests extends TestBase{

    @Test (dataProvider = "airportDataProvider")
    public void testFlightFrom(String airportCode){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.findFlightsFrom(airportCode);
        Assert.assertEquals(flightsPage.getFromButton().getText(), airportCode);
    }
    @Test (dataProvider = "airportDataProvider")
    public void testFlightTo(String airportCode){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.findFlightsTo(airportCode);
        Assert.assertEquals(flightsPage.getToButton().getText(), airportCode);
    }
    @DataProvider (name = "airportDataProvider", parallel = true)
    public Object[][] airportDataProvider() {
        return new Object[][]{
                {"IAD"},
                {"LAX"},
                {"CGD"}
        };
    }
    @Test (priority = 1)
    public void testRoundTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeRound();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(flightsPage.getSelectedTripType().getText(), "Round Trip");
        softAssert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
        softAssert.assertEquals(flightsPage.getDatesSelectorReturn().getText(), "Return");
        softAssert.assertAll();
    }
    @Test (priority = 2)
    public void testOneWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeOneWay();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(flightsPage.getSelectedTripType().getText(), "One Way");
        softAssert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
        softAssert.assertAll();
    }
    @Test (priority =3)
    public void testMultiWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeMultiCity();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(flightsPage.getSelectedTripType().getText(), "Multi-City");
        softAssert.assertEquals(flightsPage.getMultiCityFlight1().getText(), "FLIGHT 1");
        softAssert.assertEquals(flightsPage.getMultiCityFlight2().getText(), "FLIGHT 2");
        softAssert.assertAll();
    }
    }


