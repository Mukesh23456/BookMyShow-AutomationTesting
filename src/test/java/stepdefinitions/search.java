package stepdefinitions;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SearchPage;
import utilities.Utility;

public class search extends Utility{
	
	 public search(WebDriver driverInstance) {
	        super(driverInstance);
	    }
	    public search() {
	    }

	
	@Given("Open bookmyshow website")
	public void open_bookmyshow_website() throws Exception {
		try {
            SearchPage.launchApp();
        } catch (Exception e) {
            throw e;
        }
	}

	@When("Search {string} in the website")
	public void search_in_the_website(String string) throws Exception {
		try {
			SearchPage.SetLocation();
            SearchPage.SearchMovie(string);
        } catch (Exception e) {
            throw e;
        }
	    
	}

	@Then("Click enter and see the result {string}")
	public void click_enter_and_see_the_result(String string) {
	   SearchPage.VerifyResultspage(string);
	}
	
}
