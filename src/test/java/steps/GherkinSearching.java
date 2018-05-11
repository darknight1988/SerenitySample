package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;
import serenity.tutorial.features.StepLibrary.GherkinTesting;




public class GherkinSearching {
	
	@Steps
	GherkinTesting gherkin;
	
	
	@Given("^I want to write a step with Danh$")
	public void i_want_to_write_a_step_with_Danh() throws Exception {
		gherkin.openGooglePage();
	    
	}

	@When("^I check for the '(.*?)' in step$")
	public void i_check_for_the_TestingBDD_in_step(String value) throws Exception {
	    gherkin.searchByKeyword(value);
	    
	}

	@Then("^I verify the status in step$")
	public void i_verify_the_status_in_step() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    gherkin.verifyResult();
	    
	}

}
