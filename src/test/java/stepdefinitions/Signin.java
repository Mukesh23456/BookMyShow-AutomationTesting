package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SearchPage;
import pageobjects.SigninPage;
import utilities.Utility;

public class Signin extends Utility{
	
	
	public Signin(WebDriver driverInstance) {
        super(driverInstance);
    }
    public Signin() {
    }

	
	@Given("Open Bookmyshow website")
	public void open_bookmyshow_website() throws Exception {
		try {
            SigninPage.launchApp();
        } catch (Exception e) {
            throw e;
        }
	}

	@When("Enter location and Click signin")
	public void enter_location_and_click_signin() throws Exception {
		try {
			SigninPage.SetLocation();
			SigninPage.signin();
            
        } catch (Exception e) {
            throw e;
        }
	}

	@Then("Enter credentials and signin the website")
	public void enter_credentials_and_signin_the_website() throws Exception {
		try {
			SigninPage.Mobileno();
			SigninPage.VerifyResultspage();
            
        } catch (Exception e) {
            throw e;
        }
	}
	
	
	@Then("Enter invalid credentials and signin the website")
	public void enter_invalid_credentials_and_signin_the_website() throws Exception {
		try {
			SigninPage.Mobileno();
			SigninPage.InvalidVerifyResultspage();
            
        } catch (Exception e) {
            throw e;
        }
	}
}
