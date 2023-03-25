package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AirlinePartnersPage {

    public AirlinePartnersPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath="//*[@id=\"navPrimary\"]/li[6]")
    private WebElement travelInfo;

    public void clickTravelInfo(){
        travelInfo.click();
    }
}
