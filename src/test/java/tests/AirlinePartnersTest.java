package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AirlinePartnersPage;
import pages.Flights2Page;

public class AirlinePartnersTest  extends TestBase {


    @Test (priority= 1 , groups = {"smoke"})
    public void testAirlinePartnersMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.airlinePartners();
    }

    public void testAirlinePartnersDropDownMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.clickAirPartnersDropDownMenu();
    }

    public void testAirFrance() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectAirFrance();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Air France");

    }

    public void testAeroMexico() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectAeromexico();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "AeroMexico");
    }

    public void testChinaEastern() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectChinaEastern();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "China Eastern");

    }

    public void testKlm() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectKLM();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "KLM");

    }

    public void testKoreanAir() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectKoreanAir();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Korean Air");
    }

    public void testLatam() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectLatam();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "LATAM");

    }

    public void testVirginAtlantic() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectVirginAtlantic();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "Virgin Atlantic");

    }

    public void testWestJet() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.getAirPartnersDropDown().click();
        airlinePartnersPage.selectWestJet();
        Assert.assertEquals(airlinePartnersPage.getAirPartnersDropDown().getText(), "WestJet");
    }
}