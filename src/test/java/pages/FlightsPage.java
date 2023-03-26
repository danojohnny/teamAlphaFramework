package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class FlightsPage {

    public FlightsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[@id='fromAirportName']/span[1]")
    //@FindBy(xpath = "//span[contains(., 'From')]")
    private WebElement fromButton;

    @FindBy(xpath = "//a[@id='toAirportName']/span[1]")
    private WebElement toButton;

    @FindBy(id = "selectTripType-val")
    private WebElement tripType;

    @FindBy(id = "search_input")
    private WebElement cityOrAirportSearchInputFrom;

    @FindBy(id = "search_input")
    private WebElement getCityOrAirportSearchInputTo;

    @FindBy(xpath = "//div[ @class='search-result-container']/div/ul/li[1]")
    private WebElement dropdownFirstSelectionFrom;

    @FindBy(xpath = "//div[ @class='search-result-container']/div/ul/li[1]")
    private WebElement dropdownFirstSelectionTo;

    @FindBy(xpath = "//*[@id='selectTripType-desc']/li[1]")
    private WebElement tripTypeRoundTrip;

    @FindBy(xpath = "//*[@id='selectTripType-desc']/li[2]")
    private WebElement tripTypeOneWayTrip;

    @FindBy(xpath= "//*[@id='selectTripType-desc']/li[3]")
    private WebElement tripTypeMultiCityTrip;

    @FindBy(id= "selectTripType-val")
    private WebElement selectedTripType;

    @FindBy(xpath= "//span[.='Depart']")
    private WebElement datesSelectorDepart;

    @FindBy(xpath= "//span[.='Return']")
    private WebElement datesSelectorReturn;

    @FindBy(id= "flightLabel1")
    private WebElement multiCityFlight1;

    @FindBy(id= "flightLabel2")
    private WebElement multiCityFlight2;



    public void findFlightsFrom(String from) {
        fromButton.click();
        cityOrAirportSearchInputFrom.sendKeys(from);
        dropdownFirstSelectionFrom.click();

    }

    public void findFlightsTo(String to) {
        toButton.click();
        getCityOrAirportSearchInputTo.sendKeys(to);
        dropdownFirstSelectionTo.click();

    }

    public WebElement getFromButton() {
        return fromButton;
    }

    public WebElement getToButton() {
        return toButton;
    }

    public WebElement getSelectedTripType() {
        return selectedTripType;
    }

    public WebElement getDatesSelectorDepart() {
        return datesSelectorDepart;
    }

    public WebElement getDatesSelectorReturn() {
        return datesSelectorReturn;
    }

    public WebElement getMultiCityFlight1() {
        return multiCityFlight1;
    }

    public WebElement getMultiCityFlight2() {
        return multiCityFlight2;
    }

    public void selectTripTypeRound() {
        SeleniumUtils.jsClick(tripTypeRoundTrip);


    }
    public void selectTripTypeOneWay() {
        SeleniumUtils.jsClick(tripTypeOneWayTrip);

    }
    public void selectTripTypeMultiCity() {
        SeleniumUtils.jsClick(tripTypeMultiCityTrip);

    }
}
