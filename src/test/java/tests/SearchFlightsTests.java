package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightsPage;
import utils.Driver;

public class SearchFlightsTests extends TestBase{

    @Test
    public void testFlightFrom(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.findFlightsFrom("BWI");
        Assert.assertEquals(flightsPage.getFromButton().getText(), "BWI");
    }
    @Test
    public void testFlightTo(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.findFlightsTo("CDG");
        Assert.assertEquals(flightsPage.getToButton().getText(), "CDG");
    }
    @Test
    public void testRoundTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeRound();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "Round Trip");
        Assert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
        Assert.assertEquals(flightsPage.getDatesSelectorReturn().getText(), "Return");
    }
    @Test
    public void testOneWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeOneWay();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "One Way");
        Assert.assertEquals(flightsPage.getDatesSelectorDepart().getText(), "Depart");
    }
    @Test
    public void testMultiWayTripSelection(){
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.selectTripTypeMultiCity();
        Assert.assertEquals(flightsPage.getSelectedTripType().getText(), "Multi-City");
        Assert.assertEquals(flightsPage.getMultiCityFlight1().getText(), "FLIGHT 1");
        Assert.assertEquals(flightsPage.getMultiCityFlight2().getText(), "FLIGHT 2");
    }
    }

