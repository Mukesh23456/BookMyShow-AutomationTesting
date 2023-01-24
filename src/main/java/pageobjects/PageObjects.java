package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	
	public static WebDriver driver;
	

	public PageObjects(WebDriver driverInstance) {
		PageFactory.initElements(driverInstance, this);
		driver = driverInstance;
	}
	
	@FindBy(xpath="//input[@class=\"sc-hCaUpS cLnzvB\"]")
	public static WebElement CityName;
	
	@FindBy(id="4")
	public static WebElement MovieSearch;
	
	@FindBy(xpath="//input[@class=\"sc-hCaUpS cLnzvB\"]")
	public static WebElement MovieText;
	
	@FindBy(xpath="//*[@class=\"sc-fQejPQ jWuMjc\"]")
	public static WebElement Signin;
	
	
	@FindBy(id="mobileNo")
	public static WebElement MobileNo;
	
	@FindBy(xpath="//button[@class=\"CommonContainers__ButtonComponent-sc-8f9mtj-0 CommonContainers__CtaComponent-sc-8f9mtj-1 styles__CtaButtonContainer-sc-1vmod7e-0 emIChW\"]")
	public static WebElement BookTicket;
	
	
	
	@FindBy(xpath="//a[@href='/buytickets/drishyam-2-pune/movie-pune-ET00331997-MT/20230108']")
	public static WebElement ChangeDate;
	
	
	
	@FindBy(xpath="//i[@class='__icon icon-arrow-down']")
	public static WebElement DownArrow;
	
	
	
	@FindBy(xpath="//li[@class=\"prices\"]")
	public static WebElement ChangePriceRange;
	
	
	@FindBy(id="filterPrice")
	public static WebElement FilterPrice;
	
	@FindBy(id="wzrk-cancel")
	public static WebElement NotNow;
	
	
	@FindBy(xpath="//div[@class='sc-7o7nez-0 egWxJQ']")
	public static WebElement SeeAll;
	
	
	@FindBy(xpath="//div[@class='sc-7o7nez-0 eOgwQo']")
	public static WebElement Language;
	
	@FindBy(xpath="//a[@href='/booktickets/CPAR/98572']")
	public static WebElement showtiming;
	
	@FindBy(id="btnPopupAccept")
	public static WebElement Accept;
	
	
	@FindBy(id="pop_3")
	public static WebElement count3;
	
	
	@FindBy(id="proceed-Qty")
	public static WebElement SelectSeats;
	
	
	@FindBy(id="btmcntbook")
	public static WebElement Pay;
	
	@FindBy(id="prePay")
	public static WebElement Proceed;
	
	
	@FindBy(id="dOrderSummaryWrap")
	public static WebElement OrderSummary;
	
	
}
