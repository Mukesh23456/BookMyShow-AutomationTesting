package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.AutomationBase;

import utilities.Utility;

public class SearchPage extends Utility{

	
	public SearchPage(WebDriver driverInstance) {
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


	public static void VerifyResultspage(String string) {
		
		boolean a=driver.findElement(By.tagName("body")).getText().contains(string);
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	
	
	
	
}
