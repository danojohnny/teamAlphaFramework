package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BaggagePage;
import pages.FlightsPage;

public class BaggageTests extends TestBase {

    @Test (dataProvider = "airportDataProvider")
    public void calculateBaggageFeesBasicEconomy(String from, String to, String baggageFee) {
        logger.info("Navigating to baggage page");
        BaggagePage baggagePage = new BaggagePage();
        logger.info("Filling out origin and destination airports");
        baggagePage.selectingOriginDestinationAirports(from, to);
        logger.info("Selecting the onboard experience");
        baggagePage.selectBasicEconomyExperience();
        logger.info("Filling out dates of purchase and travel");
        baggagePage.calculateBaggageFee();
        Assert.assertEquals(baggagePage.getBaggageFeeLabel().getText(), baggageFee);
    }

    @Test (dataProvider = "airportDataProvider")
    public void calculateBaggageFeesMainCabin(String from, String to, String baggageFee) {
        logger.info("Navigating to baggage page");
        BaggagePage baggagePage = new BaggagePage();
        logger.info("Filling out origin and destination airports");
        baggagePage.selectingOriginDestinationAirports(from, to);
        logger.info("Selecting the onboard experience");
        baggagePage.selectMainCabinExperience();
        logger.info("Filling out dates of purchase and travel");
        baggagePage.calculateBaggageFee();
        Assert.assertEquals(baggagePage.getBaggageFeeLabel().getText(), baggageFee);
    }

    @Test (dataProvider = "airportDataProviderPremium")
    public void calculateBaggageFeesDeltaPremiumExperience(String from, String to, String baggageFee) {
        logger.info("Navigating to baggage page");
        BaggagePage baggagePage = new BaggagePage();
        logger.info("Filling out origin and destination airports");
        baggagePage.selectingOriginDestinationAirports(from, to);
        logger.info("Selecting the onboard experience");
        baggagePage.selectDeltaPremiumExperience();
        logger.info("Filling out dates of purchase and travel");
        baggagePage.calculateBaggageFee();
        Assert.assertEquals(baggagePage.getBaggageFeeLabel().getText(), baggageFee);
    }

    @Test (dataProvider = "airportDataProviderPremium")
    public void calculateBaggageFeesFirstClassExperience(String from, String to, String baggageFee) {
        logger.info("Navigating to baggage page");
        BaggagePage baggagePage = new BaggagePage();
        logger.info("Filling out origin and destination airports");
        baggagePage.selectingOriginDestinationAirports(from, to);
        logger.info("Selecting the onboard experience");
        baggagePage.selectFirstClassExperience();
        logger.info("Filling out dates of purchase and travel");
        baggagePage.calculateBaggageFee();
        Assert.assertEquals(baggagePage.getBaggageFeeLabel().getText(), baggageFee);
    }


    @Test (dataProvider = "airportDataProvider2Bags")
    public void calculateBaggageFeesBasicEconomy2bags(String from, String to, String baggageFee) {
        logger.info("Navigating to baggage page");
        BaggagePage baggagePage = new BaggagePage();
        logger.info("Filling out origin and destination airports");
        baggagePage.selectingOriginDestinationAirports(from, to);
        logger.info("Selecting the onboard experience");
        baggagePage.selectBasicEconomyExperience();
        logger.info("Filling out dates of purchase and travel");
        baggagePage.calculateBaggageFee2Bags();
        Assert.assertEquals(baggagePage.getBaggageFeeLabel().getText(), baggageFee);
    }
    @DataProvider(name = "airportDataProvider", parallel = true)
    public Object[][] airportDataProvider() {
        return new Object[][]{
                {"IAD", "DEN", "$30.00 USD"},
                {"LAX", "DCA", "$30.00 USD"},
                {"ATL", "BOS", "$30.00 USD"}

        };
    }

    @DataProvider(name = "airportDataProviderPremium", parallel = true)
    public Object[][] airportDataProviderPremiumFirstExperience() {
        return new Object[][]{
                  {"IAD", "DEN", "$0.00 USD"},
                {"LAX", "DCA", "$0.00 USD"},
                {"ATL", "BOS", "$0.00 USD"}

        };
    }

    @DataProvider(name = "airportDataProvider2Bags", parallel = true)
    public Object[][] airportDataProviderBasicPremium2Bags() {
        return new Object[][]{
                  {"IAD", "DEN", "$70.00 USD"},
                {"LAX", "DCA", "$70.00 USD"},
                {"ATL", "BOS", "$70.00 USD"}

        };
    }
}