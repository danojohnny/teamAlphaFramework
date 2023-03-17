package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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
    @DataProvider
    public Object[][] airportDataProvider() {
        return new Object[][]{
                {"IAD"},
                {"LAX"},
                {"CGD"}
        };
    }
    @Test (priority = 1, groups = {"smoke"})
    public void testRoundTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeRound();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "Round Trip");
        Assert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
        Assert.assertEquals(flightsPage.getDatesSelectorReturn().getText(), "Return");
    }
    @Test (priority = 2, groups = {"smoke"})
    public void testOneWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeOneWay();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "One Way");
        Assert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
    }
    @Test (priority =3, groups = {"smoke"})
    public void testMultiWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeMultiCity();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "Multi-City");
        Assert.assertEquals(flightsPage.getMultiCityFlight1().getText(), "FLIGHT 1");
        Assert.assertEquals(flightsPage.getMultiCityFlight2().getText(), "FLIGHT 2");
    }
    }


    // try first commit of derya