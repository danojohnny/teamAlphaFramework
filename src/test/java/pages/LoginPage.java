package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "headPrimary1")
    private WebElement book;

    @FindBy(id = "headPrimary2")
    private WebElement checkIn;

    @FindBy(id = "headPrimary3")
    private WebElement myTrips;

    @FindBy(id = "headPrimary4")
    private WebElement flightStatus;

    @FindBy(id = "login-modal-button")
    private WebElement logButton;

    @FindBy(id = "login-content-body")
    private WebElement logBody;

    @FindBy(id = "userId")
    private WebElement logUserId;

    public WebElement getLogBody() {
        return logBody;
    }

    public WebElement getLogUserId() {
        return logUserId;
    }

    public WebElement getLogPassword() {
        return logPassword;
    }

    @FindBy(id = "password")
    private WebElement logPassword;



    public void ableToLogin() {
        logButton.click();


    }

    public WebElement getFlightStatus() {
        return flightStatus;
    }

    public WebElement getBook() {
        return book;
    }

    public WebElement getCheckIn() {
        return checkIn;
    }

    public WebElement getMyTrips() {
        return myTrips;
    }
}