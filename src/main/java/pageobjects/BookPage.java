package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class BookPage extends Utility {
	
	public  BookPage(WebDriver driverInstance)
	{
		driver=driverInstance;
	}
	
	
	public static void launchApp() throws Exception {
        AutomationBase.launchApp("https://in.bookmyshow.com/");
        explicitWait(2);
        logger.info("BookMyShow is launched");
    }
	
	public static void SetLocation() throws Exception
	{
		sendKeys(PageObjects.CityName,"Pune");
		explicitWait(2);
		
		pressEnter();

		explicitWait(2);
		
	}
	
	public static void SearchMovie(String a) throws Exception
	{
		
		clickElement(PageObjects.MovieSearch);
		sendKeys(PageObjects.MovieText,a);
		
		explicitWait(2);
		pressEnter();
		
		explicitWait(2);
	}
	
	public static void BookTicket() throws Exception 
	{
		clickElement(PageObjects.BookTicket);
		explicitWait(5);
		clickElement(PageObjects.NotNow);
		explicitWait(2);
		
	}
	
	
	


	


	public static void SelectTiming() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.showtiming);
		explicitWait(2);
	}


	public static void clickAccept() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.Accept);
		explicitWait(2);
		
	}


	public static void selectCount() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.count3);
		explicitWait(3);
	}


	public static void selectSeats() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.SelectSeats);
		explicitWait(5);
	}


	public static void pay() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.Pay);
		explicitWait(3);
	}


	public static void proceed() throws Exception {
		// TODO Auto-generated method stub
		clickElement(PageObjects.Proceed);
		explicitWait(3);
	}
	
	
	
public static void VerifyResultspage() {
		
		boolean a=(PageObjects.OrderSummary).isDisplayed();
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	

}
