package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ChooseLanguagePage;
import pageobjects.PriceRangePage;
import utilities.Utility;

public class ChangeLanguage extends Utility{
	
	public ChangeLanguage()
	{
		
	}
	
	public ChangeLanguage(WebDriver driverInstance)
	{
		super(driverInstance);
	}
	
	
	@Given("Open the Bookmyshow website")
	public void open_the_bookmyshow_website() throws Exception {
		try {
			ChooseLanguagePage.launchApp();
			
	    } catch (Exception e) {
	        throw e;
	    }
	}

	@When("Enter location and Click SeeAll")
	public void enter_location_and_click_see_all() throws Exception {
		try {
			
			ChooseLanguagePage.SetLocation();
			ChooseLanguagePage.SeeAll();
	    } catch (Exception e) {
	        throw e;
	    }
	}

	@Then("Choose language and verify the output")
	public void choose_language_and_verify_the_output() throws Exception {
		try {
			ChooseLanguagePage.Language();
			ChooseLanguagePage.VerifyResultspage();
			
	    } catch (Exception e) {
	        throw e;
	    }
	}


}
