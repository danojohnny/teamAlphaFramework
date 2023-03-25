package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Flights2Page;
import pages.FlightsPage;
import pages.VacationPage;

public class VacationDealsTests extends TestBase {


    @Test (priority=1 )
    public void testTopSearch(){
        VacationPage vacationPage=new VacationPage();
        vacationPage.topSearch();

    }
   @Test
    public void testSearchForTopic(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.selectSearchTop();
    }

    @Test
    public void testDeltaVacationLink(){
        VacationPage vacationPage= new VacationPage();
        vacationPage.clickDeltaVacation();
    }
   // @Test
 //   public void testClickVacationTab(){
   //     VacationPage vacationPage = new VacationPage();
     //   vacationPage.clickVacationTab();


   /* public void testClickFHC(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickFHC();
    }
    public void testClickFlightCar(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickFlightCar();
    }

    public void testClickHotelCar(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickHotelCar();
    }

    public void testClickWeddings(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickWeddings();
    }
    public void testClickHoneymoons(){
        VacationPage vacationPage = new VacationPage();
        vacationPage.clickHoneymoons();
    }
  /*  @Test(dataProvider = "airportDataProvider")
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
        vacationPage.clickVacationTab();
        vacationPage.findDestinationTo(airportcode);
        Assert.assertEquals(vacationPage.getToButton().getText(), airportcode);
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

   */
}