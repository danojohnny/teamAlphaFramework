package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AirlinePartnersPage;
import pages.Flights2Page;

public class AirlinePartnersTest  extends TestBase {


    @Test
    public void testAirlinePartnersMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.airlinePartners();
    }

    @Test
    public void testAirlinePartnersDropDownMenu() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.airlinePartners();
    }
    @Test
    public void testAirFrance() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectAirFrance();
        Assert.assertEquals(airlinePartnersPage.getAirFrancePageTitle().getText(), "Air France");

    }
    @Test
    public void testAeroMexico() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectAeromexico();
        Assert.assertEquals(airlinePartnersPage.getAeroMexicoPageTitle().getText(), "Aeromexico");
    }
    @Test
    public void testChinaEastern() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectChinaEastern();
        Assert.assertEquals(airlinePartnersPage.getChinaEaternPageTitle().getText(), "China Eastern Airlines");

    }
    @Test
    public void testKlm() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectKLM();
        Assert.assertEquals(airlinePartnersPage.getKlmPageTitle().getText(), "KLM");

    }
    @Test
    public void testKoreanAir() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectKoreanAir();
        Assert.assertEquals(airlinePartnersPage.getKoreanAirPageTitle().getText(), "Korean Air");
    }
    @Test
    public void testLatam() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectLatam();
        Assert.assertEquals(airlinePartnersPage.getLatamPageTitle().getText(), "LATAM");

    }
    @Test
    public void testVirginAtlantic() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectVirginAtlantic();
        Assert.assertEquals(airlinePartnersPage.getVirginAtlanticPageTitle().getText(), "Virgin Atlantic®");

    }
    @Test
    public void testWestJet() {
        AirlinePartnersPage airlinePartnersPage = new AirlinePartnersPage();
        airlinePartnersPage.selectWestJet();
        Assert.assertEquals(airlinePartnersPage.getWestJetPageTitle().getText(), "WestJet");
    }
}