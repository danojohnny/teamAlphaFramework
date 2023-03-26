package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Login2Page {


    public Login2Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login-modal-button")
    private WebElement logButton;

    @FindBy(id = "login-content-body")
    private WebElement logBody;

    @FindBy(xpath = "//input[@aria-label='SkyMiles Number Or Username*']")
    private WebElement logUserId;
    @FindBy(xpath = "//input[@aria-label='Password*']")
    private WebElement logPassword;
    @FindBy(xpath ="//button[@type='submit' and text()='Log In']")
    private WebElement logInButton;

    @FindBy(id = "formAlertId")
    private WebElement loginFormAlert;

    @FindBy(xpath = "//span[@class='errorMessageText']")
    private WebElement errorMessageText;






    public void ableToLogin() {
        logButton.click();
    }

    public void enterUsername(String username){
        this.logUserId.sendKeys(username);
    }
    public void enterPassword(String password){
        this.logPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        logInButton.click();
    }


}
