package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ChangeDatePage;
import pageobjects.PriceRangePage;
import utilities.Utility;

public class PriceRange extends Utility {
	
	public PriceRange(WebDriver driverInstance) {
        super(driverInstance);
    }
    public PriceRange() {
    }
	

@Given("Open the Bookmyshow website and search the {string}")
public void open_the_bookmyshow_website_and_search_the(String string) throws Exception {
	try {
		PriceRangePage.launchApp();
		PriceRangePage.SetLocation();
		PriceRangePage.SearchMovie(string);
    } catch (Exception e) {
        throw e;
    }
}

@When("Change the price range")
public void change_the_price_range() throws Exception {
	try {
		PriceRangePage.BookTicket();
		PriceRangePage.ChangePriceRange();
    } catch (Exception e) {
        throw e;
    }
}

@Then("Verify that the price range is changed")
public void verify_that_the_price_range_is_changed() {
	try {
		PriceRangePage.VerifyResultspage();
    } catch (Exception e) {
        throw e;
    }
}

}
