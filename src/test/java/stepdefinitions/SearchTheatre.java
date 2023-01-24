package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SearchPage;
import pageobjects.SearchTheatrePage;
import utilities.Utility;

public class SearchTheatre extends Utility{
	
	
	
	 public SearchTheatre(WebDriver driverInstance) {
	        super(driverInstance);
	    }
	    public SearchTheatre() {
	    }

	@Given("Open the bookmyshow website")
	public void open_the_bookmyshow_website() throws Exception {
		try {
            SearchTheatrePage.launchApp();
        } catch (Exception e) {
            throw e;
        }
	}

	@When("Search {string} name in the website")
	public void search_name_in_the_website(String string) throws Exception {
		try {
			SearchTheatrePage.SetLocation();
			SearchTheatrePage.SearchTheatre(string);
        } catch (Exception e) {
            throw e;
        }
	}

	@Then("Click enter and verify the result {string}")
	public void click_enter_and_verify_the_result(String string) throws Exception {
		 SearchTheatrePage.VerifyResultspage(string);
	}
	
}
