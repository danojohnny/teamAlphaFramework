package pages;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utils.Driver;
        import utils.SeleniumUtils;

public class Flights2Page {

    public Flights2Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
// LOCATORS
    @FindBy(id = "input_departureDate_1")
    private WebElement flightDatesCalendar;

    @FindBy(xpath = "//a[@aria-label='29 March 2023, Wednesday']")
    private WebElement selectDeparture;

    @FindBy(xpath = "//a[@aria-label='7 April 2023, Friday']")
    private WebElement selectArrival;

    @FindBy(xpath = "//* [@class='donebutton']")
    private WebElement flightDatesDoneButton;

    @FindBy(xpath = "//* [@class='resetButton']")
    private WebElement flightDatesClearButton;

    @FindBy(xpath = "//span[@aria-labelledby='passengers-label']")
    private WebElement passengerCount;

    @FindBy(xpath = "//*[@id='ui-list-passengers0']")
    private WebElement onePassenger;

    @FindBy(xpath = "//*[@id='ui-list-passengers1']")
    private WebElement twoPassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers2']")
    private WebElement threePassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers3']")
    private WebElement fourPassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers4']")
    private WebElement fivePassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers5']")
    private WebElement sixPassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers6']")
    private WebElement sevenPassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers7']")
    private WebElement eightPassengers;

    @FindBy(xpath = "//*[@id='ui-list-passengers8']")
    private WebElement ninePassengers;

    @FindBy(id = "btn-book-submit")
    private WebElement regularBookButton;

    @FindBy(id = "adv-search")
    private WebElement advancedSearchTab;

    @FindBy(id = "nearbyAirports")
    private WebElement nearbyAirportsTab;

    @FindBy(id="faresFor-val")
    private WebElement dropdownSeatClass;

    @FindBy(id = "ui-list-faresFor0")
    private WebElement basicEconomyClass;

    @FindBy(id = "ui-list-faresFor1")
    private WebElement mainCabinClass;

    @FindBy(id = "ui-list-faresFor2")
    private WebElement deltaComfortClass;

    @FindBy(id = "ui-list-faresFor3")
    private WebElement firstClass;

    @FindBy(id = "ui-list-faresFor4")
    private WebElement deltaPremiumClass;

    @FindBy(id = "ui-list-faresFor5")
    private WebElement deltaOneClass;

    @FindBy(id = "btnSubmit")
    private WebElement advancedBookButton;




// RETURN methods

    public WebElement getFlightDatesCalendar() {
        return flightDatesCalendar;
    }

    public WebElement getSelectDeparture() {
        return selectDeparture;
    }

    public WebElement getSelectArrival() {
        return selectArrival;
    }

    public WebElement getFlightDatesDoneButton() {
        return flightDatesDoneButton;
    }

    public WebElement getFlightDatesClearButton() {
        return flightDatesClearButton;
    }

    public WebElement getPassengerCount() {
        return passengerCount;
    }

    public WebElement getRegularBookButton() {
        return  regularBookButton;
    }

    public WebElement getAdvancedSearchTab() {
        return  advancedSearchTab;
    }

    public WebElement getNearbyAirportsTab() {
        return  nearbyAirportsTab;
    }

    public WebElement getDropdownSeatClass() {
        return  dropdownSeatClass;
    }

    public WebElement getAdvancedBookButton() {
        return  advancedBookButton;
    }



    //SELECT FROM LIST methods

    public void selectOnePassenger() {
        SeleniumUtils.jsClick(onePassenger);
    }

    public void selectTwoPassengers() {
        SeleniumUtils.jsClick(twoPassengers);
    }

    public void selectThreePassengers() {
        SeleniumUtils.jsClick(threePassengers);
    }

    public void selectFourPassengers() {
        SeleniumUtils.jsClick(fourPassengers);
    }

    public void selectFivePassengers() {
        SeleniumUtils.jsClick(fivePassengers);
    }

    public void selectSixPassengers() {
        SeleniumUtils.jsClick(sixPassengers);
    }

    public void selectBasicEconomyClass() {
        SeleniumUtils.jsClick(basicEconomyClass);
    }

    public void selectMainCabinClass() {
        SeleniumUtils.jsClick(mainCabinClass);
    }

    public void selectDeltaComfortClass() {
        SeleniumUtils.jsClick(deltaComfortClass);
    }

    public void selectFirstClass() {
        SeleniumUtils.jsClick(firstClass);
    }

    public void selectDeltaPremiumClass() {
        SeleniumUtils.jsClick(deltaPremiumClass);
    }
    public void selectDeltaOneClass() {
        SeleniumUtils.jsClick(deltaOneClass);
    }
}