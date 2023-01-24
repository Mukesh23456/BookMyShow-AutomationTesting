package pageobjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class PriceRangePage extends Utility{
	
	
	public PriceRangePage(WebDriver driverInstance) {
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
		explicitWait(5);
		
	}
	
	public static void ChangePriceRange() throws Exception
	{
		clickElement(PageObjects.NotNow);
		explicitWait(2);
		clickElement(PageObjects.DownArrow);

		
		List<WebElement> options = PageObjects.FilterPrice.findElements(By.tagName("li"));
		for (WebElement option : options)
		{
		       option.click(); 
		        break;
		}
		
		explicitWait(3);
	}


	public static void VerifyResultspage() {
		
		boolean a=driver.findElement(By.xpath("//div[@class='__text _prices-text _highlighted']")).getText().equals("Filter Price Range");
		
        Assert.assertFalse(a);
        explicitWait(3);
		
	}
	
	

}
