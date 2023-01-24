package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.AutomationBase;
import utilities.Utility;

public class ChooseLanguagePage extends Utility{
	
	public ChooseLanguagePage(WebDriver driverInstance)
	{
		super(driverInstance);
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

	public static void SeeAll() throws Exception {
		clickElement(PageObjects.SeeAll);
		explicitWait(3);
		
	}

	public static void Language() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='sc-7o7nez-0 eOgwQo']"));
		for (WebElement option : options)
		{
			if(option.getText().equals("Hindi") || option.getText().equals("Telugu")) {
		       option.click(); 
		        
			}
		}
		
		explicitWait(2);
		
	}

	public static void VerifyResultspage() {
		
		boolean a=driver.findElement(By.xpath("//div[@class='sc-7o7nez-0 eOgwQo']")).isEnabled();
		
		Assert.assertTrue(a);
		explicitWait(2);
		
		
	}
	
	
	
	
	

}
