package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BookPage;
import pageobjects.ChangeDatePage;
import utilities.Utility;

public class Book extends Utility{
	
	public Book()
	{
		
	}
	
	public Book(WebDriver driverInstance)
	{
		super(driverInstance);
	}
	

@Given("Open the bookmyshow website and search {string}")
public void open_the_bookmyshow_website_and_search(String string) throws Exception {
	try {
        BookPage.launchApp();
        BookPage.SetLocation();
        BookPage.SearchMovie(string);
    } catch (Exception e) {
        throw e;
    }
}

@When("Select theatre and book the ticket")
public void select_theatre_and_book_the_ticket() throws Exception {
	try {
		BookPage.BookTicket();
		BookPage.SelectTiming();
		BookPage.clickAccept();
		BookPage.selectCount();
		BookPage.selectSeats();
		BookPage.pay();
		BookPage.proceed();
    } catch (Exception e) {
        throw e;
    }
}

@Then("Verify the result page")
public void verify_the_result_page() {
	try {
		BookPage.VerifyResultspage();
    } catch (Exception e) {
        throw e;
    }
}


}
