package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class BaggagePage {

    public BaggagePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//a[contains(., 'Travel Info')]")
    private WebElement travelInfoMenu;

    @FindBy(xpath = "//a[contains(., 'Baggage')]")
    private WebElement baggageMenu;

    @FindBy(xpath = "//input[@aria-label='Origin']")
    private WebElement originAirport;

    @FindBy(xpath = "//input[@aria-label='Destination']")
    private WebElement destinationAirport;


    @FindBy(id = "input_origin_option-1")
    private WebElement firstDropdownSelectionFrom;

    @FindBy(id = "input_destination_option-1")
    private WebElement firstDropdownSelectionTo;

// Onboard experience
    @FindBy(id = "idp-input_onboard_experience__selected")
    private WebElement onboardExpDropdown;

    @FindBy(id = "input_onboard_experience-desc")
    private WebElement onboardExpList;


    @FindBy(xpath = "//li[@data-label='Basic Economy']")
    private WebElement basicEconomySelection;

    @FindBy(xpath = "//li[@data-label='Main Cabin']")
    private WebElement mainCabinSelection;

    @FindBy(xpath = "//li[@data-label='First Class']")
    private WebElement firstClassSelection;

    @FindBy(xpath = "//li[@data-label='Delta Premium Select']")
    private WebElement deltaPremiumSelection;

    // Dates of purchase and travel
    @FindBy(id = "idp-input_date_purchase__selected")
    private WebElement calendarPurchase;

    @FindBy(xpath = "(//div[@aria-label='15 March 2023, Wednesday'])[1]")
    private WebElement purchaseDate;
    @FindBy(xpath = "(//button[contains(., 'done')])[1]")
    private WebElement datesDoneButton1;

    @FindBy(id = "idp-input_date_travel__selected")
    private WebElement calendarTravel;

    @FindBy(xpath = "(//div[@aria-label='31 March 2023, Friday'])[2]")
    private WebElement travelDate;

    @FindBy(xpath = "(//button[contains(., 'done')])[2]")
    private WebElement datesDoneButton2;

    // Calculate estimate
    @FindBy(xpath = "//button[contains(., 'Calculate Estimate')]")
    private WebElement calculateEstimateButton;

    //baggage calculator

    @FindBy(id = "plus-0")
    private WebElement plusBagButton;

    @FindBy(xpath = "(//span[@class='idp-dialog__footer-price ng-star-inserted'])[1]")
    private WebElement baggageFeeLabel;

    public void selectingOriginDestinationAirports(String fromAirport, String toAirport) {
        travelInfoMenu.click();
        utils.SeleniumUtils.jsClick(baggageMenu);
        originAirport.sendKeys(fromAirport);
        utils.SeleniumUtils.waitFor(3);
        firstDropdownSelectionFrom.click();
        destinationAirport.sendKeys(toAirport);
        utils.SeleniumUtils.waitFor(3);
        firstDropdownSelectionTo.click();
    }
    public void selectBasicEconomyExperience(){
        onboardExpDropdown.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basicEconomySelection).click().build().perform();
    }

    public void selectMainCabinExperience(){
        onboardExpDropdown.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mainCabinSelection).click().build().perform();
    }

    public void selectDeltaPremiumExperience(){
        onboardExpDropdown.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deltaPremiumSelection).click().build().perform();
    }

    public void selectFirstClassExperience(){
        onboardExpDropdown.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(firstClassSelection).click().build().perform();
    }



    public void calculateBaggageFee(){
        calendarPurchase.click();
        purchaseDate.click();
        datesDoneButton1.click();
        calendarTravel.click();
        travelDate.click();
        datesDoneButton2.click();
        calculateEstimateButton.click();
        utils.SeleniumUtils.waitFor(3);
        plusBagButton.click();
        utils.SeleniumUtils.waitFor(5);
    }

    public void calculateBaggageFee2Bags(){
        calculateBaggageFee();
        plusBagButton.click();
        utils.SeleniumUtils.waitFor(5);
    }

    public WebElement getBaggageFeeLabel() {
        return baggageFeeLabel;
    }
}

