package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class SkyMilesPage {

    public SkyMilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login-modal-button")
    private WebElement getLoginButton;

    public void clickOnLoginButton() {
        getLoginButton.click();
    }

    @FindBy(xpath = "//* [@ class='joinSkyMilesDiv']")
    private WebElement getJoinSkyMiles;

    public void clickOnJoinSkyMiles() {
        getJoinSkyMiles.click();
    }

    @FindBy(xpath = "//* [@ class='idp-standard-enrollment__title']")
    private WebElement getSkyMilesMain;

    public WebElement SkyMilesMain() {
        return getSkyMilesMain;
    }

    @FindBy(xpath = "//* [@ aria-label='First Name']")
    private WebElement getFirstName;

    public void skyMilesFirstName(String firstName) {
        getFirstName.click();
        getFirstName.sendKeys(firstName);
    }

    @FindBy(xpath = "//* [@ aria-label='Last Name']")
    private WebElement getLastName;

    public void skyMilesLastName(String lastName) {
        getLastName.click();
        getLastName.sendKeys(lastName);
    }

    @FindBy(id="idp-month__selected")
    private WebElement dropdownMonth;

    public void clickDropdownMonth() {
        dropdownMonth.click();
    }


    @FindBy(id="monthoption-5")
    private WebElement dropdownMonthSelection;

    public void clickDropdownMonthSelection() {
        dropdownMonth.click();
    }

    @FindBy(id= "idp-date__selected")
    private WebElement dobDayDropdown;

    public void clickOnDayDropdown() {
        dobDayDropdown.click();
    }

    @FindBy(id= "dateoption-7")
    private WebElement dobDay;

    public void clickOnDay() {
        dobDay.click();
    }

    @FindBy(id= "idp-year__selected")
    private WebElement dobYearDropdown;
    public void clickOnDropdownYear() {
        dobYearDropdown.click();
    }

    @FindBy(id = "yearoption-28")
    private WebElement dobYearSelected;

    public void clickOnYear() {
        dobYearSelected.click();
    }

    @FindBy(id = "idp-gender__selected")
    private WebElement getGenderDropdown;

    public void clickOnGenderDropdown() {
        getGenderDropdown.click();
    }
    @FindBy(id="genderoption-1")
    private WebElement getGenderSelected;

    public void clickOnGenderSelected() {
        getGenderDropdown.click();
    }




    @FindBy(id = "primary-static-link-0")
    private WebElement getJoinSkyMilesThruSkyMilesOnMain;

    public void clickOnJoinSkyMilesThruSkyMilesOnMain() {
        getJoinSkyMilesThruSkyMilesOnMain.click();
    }

    @FindBy(id = "basic-info-next")
    private WebElement basicInfoNextButton;


    public void clickOnBasicInfoNextButton() {
        basicInfoNextButton.click();
    }

    @FindBy(xpath = "//* [@ aria-label='Step 2']")
    private WebElement getBasicInfoStepTwo;
    public WebElement basicInfoStepTwo() {
        return getBasicInfoStepTwo;

    }

    @FindBy(xpath = "//*[@ class='idp-alert-warning-message-text ng-star-inserted']")
    private WebElement basicInfoAlert;

    public WebElement basicInfoMissingAlert() {
        return basicInfoAlert;

    }
}
