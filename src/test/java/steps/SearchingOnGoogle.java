package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.tutorial.features.StepLibrary.UserGoogle;

public class SearchingOnGoogle {

	@Steps
	UserGoogle user;
	
	@Given("I open the Chrome browser and navigation to Google page")
	public void i_open_the_Chrome_browser_and_navigation_to_Google_page() throws Exception {
		user.openBrowser();
	}

	@When("I fill the keyword in Search dialog")
	public void i_fill_the_keyword_in_Search_dialog(String value) throws Exception {
		user.searchWithKeyword(value);
	}

	@Then("I check the output")
	public void i_check_the_output() throws Exception {
		user.verifyTheResult();
	}
}