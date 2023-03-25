package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Flights2Page;
import pages.FlightsPage;
import utils.Driver;

public class SearchFlightsTests extends TestBase{

    @Test (dataProvider = "airportDataProvider")
    public void testFlightFromTo(String airportCodeFrom, String airportCodeTo)  {
        FlightsPage flightsPage = new FlightsPage();
        flightsPage.findFlightsFrom(airportCodeFrom);
        flightsPage.findFlightsTo(airportCodeTo);
        flightsPage.selectTripTypeRound();
        flightsPage.searchFlightDates();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(flightsPage.getOutboundSearchResultHeader().getText(), "Outbound");
        softAssert.assertAll();
    }

    @DataProvider (name = "airportDataProvider", parallel = false)
    public Object[][] airportDataProvider() {
        return new Object[][]{
                {"IAD", "DEN"},
              //  {"LAX", "BOS"},
              //  {"LAS", "DCA"}
        };
    }





    @Test(priority = 1, groups = {"smoke"})

    public void testChooseFlightDatesThenClear() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getFlightDatesCalendar().click();
        flights2Page.getSelectDeparture().click();
        flights2Page.getSelectArrival().click();
        flights2Page.getFlightDatesClearButton().click();
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


