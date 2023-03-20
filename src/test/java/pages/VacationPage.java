package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class VacationPage {

    public VacationPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath="//*[@id='tab_vacations']/a/div/p")
    private WebElement vacationDeals;
    @FindBy(xpath = "//*[text()='From']")
    private WebElement fromButton;

    @FindBy(xpath = "//*[text()='To'][@class='title airportcode']")
    private WebElement toButton;

    @FindBy(xpath = "//input[@class='ancillary-widget_dropdown-search ancillary-widget_dropdown-vacations-origin-search']")
    private WebElement airportSearchInputFrom;

    @FindBy(xpath = "//input[@class='ancillary-widget_dropdown-search ancillary-widget_dropdown-vacations-dest-search']")
    private WebElement airportSearchInputTo;

    @FindBy(xpath = "//div[@class='ancillary-widget_dropdown-item']//span[1]")
    private WebElement dropdownFirstSelectionFrom;

    @FindBy(xpath = "/html/body/app-root/app-home/ngc-global-nav/header/div/div[1]/ngc-book/div[5]/div/div/div[1]/div[1]/div[3]/div/div/span")
    private WebElement dropdownFirstSelectionTo;

    @FindBy(xpath = "//input[@class='ancillary-widget_dropdown-vacations-from ancillary-widget_date']")
    private WebElement datesSelectorDepart;

    @FindBy(xpath = "//input[@class='ancillary-widget_dropdown-vacations-to ancillary-widget_date hide-text']")
    private WebElement datesSelectorReturn;

    @FindBy(xpath ="//select[@class='ancillary-widget_dropdown-vacations-rooms']")
    private WebElement roomSelectorReturn;



    public void clickVacationTab() {
        vacationDeals.click();
    }
    public void findVacationFrom(String from) {

        fromButton.click();
        airportSearchInputFrom.sendKeys(from);
        dropdownFirstSelectionFrom.click();

        }

    public void findDestinationTo(String to) {
        toButton.click();
        airportSearchInputTo.sendKeys(to);
        dropdownFirstSelectionTo.click();
    }


    public WebElement getFromButton() {
        return fromButton;
    }
    public WebElement getToButton(){
        return toButton;
    }

    private WebElement getAirportSearchInputFrom(){
        return airportSearchInputFrom;
    }

    private WebElement getAirportSearchInputTo(){
        return airportSearchInputTo;
    }

    private WebElement getDatesSelectorDepart(){
        return datesSelectorDepart;
    }

    public WebElement getDatesSelectorReturn(){
      return datesSelectorReturn;
    }

    private WebElement getRoomSelectorReturn(){
        return roomSelectorReturn;
    }


}

