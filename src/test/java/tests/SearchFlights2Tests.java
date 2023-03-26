package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Flights2Page;
import pages.FlightsPage;

public class SearchFlights2Tests extends TestBase {


    @Test(priority = 1, groups = {"smoke"})

    public void testChooseFlightDatesThenClear() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getFlightDatesCalendar().click();
        flights2Page.getSelectDeparture().click();
        flights2Page.getSelectArrival().click();
        flights2Page.getFlightDatesClearButton().click();
    }


    @Test(priority = 2, groups = {"smoke"})

    public void testChooseFlightDatesThenSubmit() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getFlightDatesCalendar().click();
        flights2Page.getSelectDeparture().click();
        flights2Page.getSelectArrival().click();
        flights2Page.getFlightDatesDoneButton().click();
    }


    @Test(priority = 3, groups = {"smoke"})

    public void testNumberOfPassengers1() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getPassengerCount().click();
        flights2Page.selectOnePassenger();
        Assert.assertEquals(flights2Page.getPassengerCount().getText(), "1 Passenger");

    }

    @Test(priority = 4, groups = {"smoke"})

    public void testNumberOfPassengers2() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getPassengerCount().click();
        flights2Page.selectTwoPassengers();
        Assert.assertEquals(flights2Page.getPassengerCount().getText(), "2 Passengers");

    }

    @Test(priority = 5, groups = {"smoke"})

    public void testNumberOfPassengers5() {
        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getPassengerCount().click();
        flights2Page.selectFivePassengers();
        Assert.assertEquals(flights2Page.getPassengerCount().getText(), "5 Passengers");

    }

    @Test(priority = 6, groups = {"smoke"})

    public void testRegularBookButton() {

        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getRegularBookButton().click();

    }

    @Test(priority = 7, groups = {"smoke"})

    public void testAdvancedSearchFlightClassFirst() {

        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getAdvancedSearchTab().click();
        flights2Page.getDropdownSeatClass().click();
        flights2Page.selectFirstClass();
        Assert.assertEquals(flights2Page.getDropdownSeatClass().getText(), "First Class");

    }

    @Test(priority = 8, groups = {"smoke"})

    public void testAdvancedSearchFlightClassDeltaOne() {

        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getAdvancedSearchTab().click();
        flights2Page.getDropdownSeatClass().click();
        flights2Page.selectDeltaOneClass();
        Assert.assertEquals(flights2Page.getDropdownSeatClass().getText(), "Delta One®");
    }

    @Test(priority = 9, groups = {"smoke"})
    public void testAdvancedSearchFlightClassEconomy() {

        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getAdvancedSearchTab().click();
        flights2Page.getDropdownSeatClass().click();
        flights2Page.selectBasicEconomyClass();
        Assert.assertEquals(flights2Page.getDropdownSeatClass().getText(), "Basic Economy");
    }

    @Test(priority = 6)   // this test must fail because flight details are not selected

    public void testAdvancedBookButton() {

        Flights2Page flights2Page = new Flights2Page();
        flights2Page.getAdvancedSearchTab().click();
        flights2Page.getDropdownSeatClass().click();
        flights2Page.selectFirstClass();
        flights2Page.getAdvancedBookButton().click();

    }

         @DataProvider
        public Object[][] airportCode() {
        return new Object[][]{
                {"MCI", "MCI"}
        };

        }

        @Test(dataProvider = "airportCode", groups = {"smoke"})

        public void testBusinessFlightWithSameFromAndTo (String airportCode1, String airportCode2){
            Flights2Page flights2Page = new Flights2Page();
            flights2Page.findFlightsFrom(airportCode1);
            flights2Page.findFlightsTo(airportCode2);
            flights2Page.chooseFlightAndSubmit();
            Assert.assertEquals(flights2Page.invalidSearchErrorMessage().getText(), "Origin cannot be same as destination");
        }

    }
