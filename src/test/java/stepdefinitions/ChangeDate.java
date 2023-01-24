package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ChangeDatePage;
import pageobjects.SearchPage;
import utilities.Utility;

public class ChangeDate extends Utility {

	
	public ChangeDate(WebDriver driverInstance) {
        super(driverInstance);
    }
    public ChangeDate() {
    }
	
	@Given("Open the Bookmyshow website and search {string}")
	public void open_the_bookmyshow_website_and_search(String string) throws Exception {
		try {
            ChangeDatePage.launchApp();
            ChangeDatePage.SetLocation();
            ChangeDatePage.SearchMovie(string);
        } catch (Exception e) {
            throw e;
        }
	}

	@When("Change the movie date")
	public void change_the_movie_date() throws Exception {
		try {
            ChangeDatePage.BookTicket();
            ChangeDatePage.Changedate();
        } catch (Exception e) {
            throw e;
        }
	}

	@Then("Verify that the date is changed")
	public void verify_that_the_date_is_changed() {
		try {
            ChangeDatePage.VerifyResultspage();
        } catch (Exception e) {
            throw e;
        }
	}

}
