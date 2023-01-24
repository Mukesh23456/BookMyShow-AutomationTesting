package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utilities.AutomationBase;
import utilities.Utility;

public class SigninPage extends Utility{
	
	public SigninPage(WebDriver driverInstance) {
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
	
	


	public static void VerifyResultspage(String string) {
		
		boolean a=driver.findElement(By.tagName("body")).getText().contains(string);
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}


	public static void signin() throws Exception {
		clickElement(PageObjects.Signin);
		explicitWait(2);
		
	}
	
	public static void Mobileno() throws Exception {
//		clickElement(PageObjects.MobileNo);
		explicitWait(1);
		
//		PageObjects.MobileNo.sendKeys(Keys.);
		sendKeys(PageObjects.MobileNo,"7395972123");
		pressEnter();
		explicitWait(10);
		
	}
	
	
	

	public static void VerifyResultspage() {
		
		boolean a=driver.findElement(By.xpath("//*[@src=\"//in.bmscdn.com/m6/images/my-profile/bms-user.png\"]")).isDisplayed();
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	
public static void InvalidVerifyResultspage() {
		
	boolean a=driver.findElement(By.tagName("body")).getText().contains("Invalid OTP entered. Please try again");
		
        Assert.assertTrue(a);
        explicitWait(3);
		
	}
	

}
