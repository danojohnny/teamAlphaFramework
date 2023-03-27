package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SkyMilesPage;

public class SkyMilesTests extends TestBase {

    @Test (groups = {"smoke"})
    public void navigateToSkyMilesThruLoginPage() {
        SkyMilesPage skyMilesPage = new SkyMilesPage();
        skyMilesPage.clickOnLoginButton();
        skyMilesPage.clickOnJoinSkyMiles();
        Assert.assertEquals(skyMilesPage.SkyMilesMain().getText(), "Join SkyMiles® | Delta Air Lines");

    }

    @DataProvider
    public Object[][] firstAndLastNames() {
        return new Object[][]{
                {"Anthony", "Hopkins"}
        };
    }

    @Test(dataProvider = "firstAndLastNames", groups = {"smoke"})
    public void skyMilesBasicInfoPage(String firstName, String lastName) {
        navigateToSkyMilesThruLoginPage();
        SkyMilesPage skyMilesPage = new SkyMilesPage();
        skyMilesPage.skyMilesFirstName(firstName);
        skyMilesPage.skyMilesLastName(lastName);
        skyMilesPage.clickDropdownMonth();
        skyMilesPage.clickDropdownMonthSelection();
        skyMilesPage.clickOnDayDropdown();
        skyMilesPage.clickOnDay();
        skyMilesPage.clickOnDropdownYear();
        skyMilesPage.clickOnYear();
        skyMilesPage.clickOnGenderDropdown();
        skyMilesPage.clickOnGenderSelected();
        skyMilesPage.clickOnBasicInfoNextButton();
        Assert.assertTrue(skyMilesPage.basicInfoMissingAlert().getText().contains("Please correct"));


    }

    @Test (groups = {"smoke"})
    public void navigateToJoinSkyMilesThruSkyMilesTab() {
        SkyMilesPage skyMilesPage = new SkyMilesPage();
        skyMilesPage.clickOnSkyMilesTab();
        skyMilesPage.clickOnJoinSkyMilesThruSkyMilesOnMain();
        Assert.assertEquals(skyMilesPage.SkyMilesMain().getText(), "Join SkyMiles® | Delta Air Lines");
}
}