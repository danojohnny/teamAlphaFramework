package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;
import utils.SeleniumUtils;

public class HotelPage {

    public HotelPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@data-analytics-id='home-shop-2']")
    public WebElement ShopHotels;

    public void selectShopHotels() {
    SeleniumUtils.jsClick(hotels.clickOnShopHotels);}

    @FindBy(id = "location-field-destination")
    public WebElement dropDownGoingTo;

    @FindBy(id = "d1-btn")
    public WebElement clickOnCheckIn;

    @FindBy(xpath = " //td[@data-date='2023-4-10']")
    public WebElement clickOnFirstDate;

    public void clickOnFirstDate(){
        Driver.getDriver().findElement(By.xpath("//td[@data-date='2023-4-10']")).click();
    }

    @FindBy(id = "d2-btn")
    public WebElement clickonCheckOut;

    @FindBy(xpath = "//td[@data-date='2023-4-17']")
    public WebElement clickOnLastDate;

    public void clickOnLastDate(){
        Driver.getDriver().findElement(By.xpath("//td[@data-date='2023-4-17']")).click();
    }


    //public void EnterHotelLocation(){
    //Driver.getDriver().findElement(By.xpath(" //input[@name='q-destination']")).sendKeys("MIA");
    //}

    //public void clickOnMiami(){
    // Actions action = new Actions(Driver.getDriver());
    // WebElement element = Driver.getDriver().findElement(By.id("citysqm-asi0-s1"));
    // action.moveToElement(element).click().perform();
    //}

    public void Travelers(){

        Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-compact-occupancy")));
        select.selectByVisibleText("More options…");

    }

    public void Child(){

        Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-room-0-children")));
        select.selectByValue("1");

        //public void clickOnChildAge(){Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-room-0-child-0-age")));select.selectByValue("5");}




    }
    }


