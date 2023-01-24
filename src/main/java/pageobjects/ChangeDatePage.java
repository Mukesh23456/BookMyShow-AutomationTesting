package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class ChangeDatePage extends Utility{
	
	
	public ChangeDatePage(WebDriver driverInstance) {
        driver = driverInstance;
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
		explicitWait(3);
		
	}
	
	public static void Changedate() throws Exception
	{
		
		clickElement(PageObjects.NotNow);
		explicitWait(2);
		clickElement(PageObjects.ChangeDate);
		explicitWait(3);
	}


	public static void VerifyResultspage() {
		
		boolean a=driver.findElement(By.xpath("//a[@href='/buytickets/drishyam-2-pune/movie-pune-ET00331997-MT/20230108']")).isEnabled();
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	

}
