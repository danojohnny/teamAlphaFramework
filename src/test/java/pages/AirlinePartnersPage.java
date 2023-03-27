package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class AirlinePartnersPage {

    public AirlinePartnersPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[contains(., 'Travel Info')]")
    private WebElement travelInfo;

    @FindBy(xpath = "//a[contains(., 'Airline Partners')]")
    private WebElement airlinePartnersMenu;

    @FindBy (xpath ="//a[@class='inspiration-sub-nav-link']")
    private WebElement airPartnersDropDown;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[2]/div/div/a")
    private WebElement aeroMexico;

    @FindBy(xpath ="//span/h1[contains(., 'Aeromexico')]")
    private WebElement aeroMexicoPageTitle;

    @FindBy(xpath  ="//*[@id=\"accordion2\"]/li[3]/div/div/a")
    private WebElement airFrance;

    @FindBy(xpath  ="//span/h1[contains(., 'Air France')]")
    private WebElement airFrancePageTitle;

    @FindBy(xpath="//*[@id=\"accordion2\"]/li[4]/div/div/a")
    private WebElement chinaEastern;

    @FindBy(xpath ="//span/h1[contains(., 'China Eastern')]")
    private WebElement chinaEaternPageTitle;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[5]/div/div/a")
    private WebElement kLM;

    @FindBy(xpath ="//span/h1[contains(., 'KLM')]")
    private WebElement klmPageTitle;

    @FindBy(xpath="//*[@id=\"accordion2\"]/li[6]/div/div/a")
    private WebElement koreanAir;

    @FindBy(xpath ="//span/h1[contains(., 'Korean Air')]")
    private WebElement koreanAirPageTitle;

    @FindBy(xpath = "//*[@id=\"accordion2\"]/li[7]/div/div/a")
    private WebElement lATAM;

    @FindBy(xpath ="//span/h1[contains(., 'LATAM')]")
    private WebElement latamPageTitle;

    @FindBy (xpath="//*[@id=\"accordion2\"]/li[8]/div/div/a")
    private WebElement virginAtlantic;

    @FindBy(xpath ="//span/h1[contains(., 'Virgin Atlantic')]")
    private WebElement virginAtlanticPageTitle;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[9]/div/div/a")
    private WebElement westJest;

    @FindBy(xpath ="//span/h1[contains(., 'WestJet')]")
    private WebElement westJetPageTitle;


    public void airlinePartners(){
        travelInfo.click();
        utils.SeleniumUtils.jsClick(airlinePartnersMenu);
        utils.SeleniumUtils.jsClick(airPartnersDropDown);
    }


//    public void clickAirPartnersDropDownMenu(){
//        travelInfo.click();
//        utils.SeleniumUtils.jsClick(airPartnersDropDown);
//    }

    public void selectAeromexico() {
        airlinePartners();
        SeleniumUtils.jsClick(aeroMexico);
    }

    public void selectAirFrance() {
        airlinePartners();
        SeleniumUtils.jsClick(airFrance);
    }

    public void selectChinaEastern() {
        airlinePartners();
        SeleniumUtils.jsClick(chinaEastern);
    }

    public void selectKLM() {
        airlinePartners();
        SeleniumUtils.jsClick(kLM);}

    public void selectKoreanAir() {
        airlinePartners();
        SeleniumUtils.jsClick(koreanAir);
    }
    public void selectLatam() {
        airlinePartners();
        SeleniumUtils.jsClick(lATAM);
    }
    public void selectVirginAtlantic() {
        airlinePartners();
        SeleniumUtils.jsClick(virginAtlantic);
    }

    public void selectWestJet(){
        airlinePartners();
        SeleniumUtils.jsClick(westJest);
    }


    public WebElement getAirPartnersDropDown() {
        return airPartnersDropDown;
    }

    public WebElement getAirFrancePageTitle() {
        return airFrancePageTitle;
    }

    public WebElement getAeroMexicoPageTitle() {
        return aeroMexicoPageTitle;
    }

    public WebElement getChinaEaternPageTitle() {
        return chinaEaternPageTitle;
    }

    public WebElement getKlmPageTitle() {
        return klmPageTitle;
    }

    public WebElement getKoreanAirPageTitle() {
        return koreanAirPageTitle;
    }

    public WebElement getLatamPageTitle() {
        return latamPageTitle;
    }

    public WebElement getVirginAtlanticPageTitle() {
        return virginAtlanticPageTitle;
    }

    public WebElement getWestJetPageTitle() {
        return westJetPageTitle;
    }
}
