package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class VacationPage {

    public VacationPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "/html/body/app-root/app-home/ngc-global-nav/header/div/nav/div/div[2]/ngc-search/div")
    private WebElement topSearchButton;

    @FindBy(xpath = "//input[@id='search_input']")
    private WebElement searchForTopic;

    @FindBy(xpath= "/html/body/modal-container/div/div/ngc-flyout-search/div/div/div/div/div[2]/div[3]/ul/li[1]/a")
    private WebElement dropDownFirst;
    @FindBy(xpath = "//span[contains(text(), 'Vacation Deals')]")
    private WebElement vacationDeals;

    @FindBy(xpath = "//*[@id=\"main_content\"]/idp-site-search/idp-site-search-page/div/div[3]/div/idp-search-result[1]/div/div[3]/a[1]")
    private WebElement deltaVacationsPage;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-0\"]/div/div")
    private WebElement flightHotelCars;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-1\"]/div/div")
    private WebElement flightCar;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-2\"]/div/div")
    private WebElement hotelCar;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-3\"]/div/div")
    private WebElement destinationWeddings;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-4\"]/div/div")
    private WebElement honeymoons;

    @FindBy(xpath = "//input[@id='fromAirport']")
    private WebElement OriginAirport;

    @FindBy(xpath = "//label[@name='Destination']")
    private WebElement destinationAirport;

    @FindBy(xpath = "//label[@id='DepartureLabel']")
    private WebElement departureDate;

    @FindBy(xpath = "//label[@id='returnLabel']")
    private WebElement returnDate;

    @FindBy(xpath = "//input[@name='travelersAdultsDisplayField']")
    private WebElement passenger;

    @FindBy(xpath = "//input[@id='promoCode']")
    private WebElement promoCode;

    @FindBy(xpath = "//button[@id='vacationsSubmitButton']")
    private WebElement searchButton;


    public void topSearch() {
        topSearchButton.click();
    }

    //public void searchForTopic() {
      //  searchForTopic.sendKeys("Vacation Deals");
       // dropDownFirst.click();

    public void selectSearchTop() {
        SeleniumUtils.jsClick(searchForTopic);
    }

        public void clickDeltaVacation(){
        deltaVacationsPage.click();
    }

    public void scrollPageDown() {
        SeleniumUtils.jsClick(vacationDeals);
    }

    public void clickVacationTab() {
        vacationDeals.click();
    }

    public void clickFHC() {
        flightHotelCars.click();
    }

    public void fightCar() {
        flightCar.click();
    }

    public void clickHotelCar() {
        hotelCar.click();
    }

    public void clickWeddings() {
        destinationWeddings.click();
    }

    public void clickHoneymoons() {
        honeymoons.click();
    }


    public WebElement getSearchForTopic() {
        return getSearchForTopic();
    }

    private WebElement getOriginAirport() {
        return OriginAirport;
    }

    private WebElement getDestinationAirport() {
        return destinationAirport;
    }

    private WebElement getDepartureDate() {
        return departureDate;
    }

    public WebElement getReturnDate() {
        return returnDate;
    }

}




