package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Flights2Page;
import pages.FlightsPage;
import pages.VacationPage;

public class VacationDealsTests extends TestBase {

    @Test
    public void testClickVacationTab() throws InterruptedException {
        Thread.sleep(5);
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickVacationTab();
    }

    @Test(dataProvider = "airportDataProvider")
    public void testFromButton(String airportcode) {
        VacationPage vacationPage = new VacationPage();
        vacationPage.findVacationFrom(airportcode);
        Assert.assertEquals(vacationPage.getFromButton().getText(), airportcode);
    }

    public void testClickVacationTab1() throws InterruptedException {
        Thread.sleep(5);
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickVacationTab();
    }

    @Test(dataProvider = "airportDataProvider")
    public void testToButton(String airportcode) {
        VacationPage vacationPage = new VacationPage();
        vacationPage.findDestinationTo(airportcode);
        Assert.assertEquals(vacationPage.getToButton().getText(), airportcode);
    }

    public void testClickVacationTab2() throws InterruptedException {
        Thread.sleep(5);
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickVacationTab();
    }

    @DataProvider
    public Object[][] airportDataProvider() {
        return new Object[][]{
                {"BWI"},
                //  {"MIA"},
                //  {"BOS"},
                //{"IAD"},
                // {"AUA"}

        };
    }
}