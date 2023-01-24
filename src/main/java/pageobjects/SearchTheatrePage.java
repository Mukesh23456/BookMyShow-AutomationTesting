package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class SearchTheatrePage extends Utility{
	

	public SearchTheatrePage(WebDriver driverInstance) {
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
	
	public static void SearchTheatre(String a) throws Exception
	{
		
		clickElement(PageObjects.MovieSearch);
		sendKeys(PageObjects.MovieText,a);
		
		explicitWait(2);
		pressEnter();
		
		explicitWait(2);
	}


	public static void VerifyResultspage(String string) throws Exception {
		boolean a=driver.findElement(By.tagName("body")).getText().contains(string);
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	

}
