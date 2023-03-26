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

    @FindBy(xpath = "//a[contains(., 'Travel Info')]\"")
    private WebElement travelInfo;

    @FindBy(xpath = "//a[contains(., 'Airline Partners')]")
    private WebElement airlinePartnersMenu;

    @FindBy (xpath ="//a[@class='inspiration-sub-nav-link']")
    private WebElement airPartnersDropDown;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[2]/div/div/a")
    private WebElement aeroMexico;

    @FindBy(xpath  ="//*[@id=\"accordion2\"]/li[3]/div/div/a")
    private WebElement airFrance;

    @FindBy(xpath="//*[@id=\"accordion2\"]/li[4]/div/div/a")
    private WebElement chinaEastern;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[5]/div/div/a")
    private WebElement kLM;

    @FindBy(xpath="//*[@id=\"accordion2\"]/li[6]/div/div/a")
    private WebElement koreanAir;

    @FindBy(xpath = "//*[@id=\"accordion2\"]/li[7]/div/div/a")
    private WebElement lATAM;

    @FindBy (xpath="//*[@id=\"accordion2\"]/li[8]/div/div/a")
    private WebElement virginAtlantic;

    @FindBy(xpath ="//*[@id=\"accordion2\"]/li[9]/div/div/a")
    private WebElement westJest;


    public void airlinePartners(){
        travelInfo.click();
        utils.SeleniumUtils.jsClick(airlinePartnersMenu);
    }


    public void clickAirPartnersDropDownMenu(){
        airPartnersDropDown.click();
    }

    public void selectAeromexico() {
        SeleniumUtils.jsClick(aeroMexico);
    }

    public void selectAirFrance() {
        SeleniumUtils.jsClick(airFrance);
    }

    public void selectChinaEastern() {
        SeleniumUtils.jsClick(chinaEastern);
    }

    public void selectKLM() {SeleniumUtils.jsClick(kLM);}

    public void selectKoreanAir() {
        SeleniumUtils.jsClick(koreanAir);
    }
    public void selectLatam() {
        SeleniumUtils.jsClick(lATAM);
    }
    public void selectVirginAtlantic() {
        SeleniumUtils.jsClick(virginAtlantic);
    }

    public void selectWestJet(){ SeleniumUtils.jsClick(westJest);}


    public WebElement getAirPartnersDropDown() {
        return airPartnersDropDown;
    }



}
