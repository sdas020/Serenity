package test1;

import static net.serenitybdd.rest.SerenityRest.then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.*;

public class Step_definition1 {
	
	@Steps
	API_Testing gh;
	

	
		// TODO Auto-generated method stub
	//API_Demo api;

		@Given("^I want to write a step with precondition with \"([^\"]*)\"$")
		public void I_want_to_write_a_step_with_precondition_with(String posts)  {
		    // Write code here that turns the phrase above into concrete actions
			
			gh.API_Demo(posts);
		}

		@Given("^some other precondition with \"([^\"]*)\"$")
		public void some_other_precondition_with(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //gh.switchCase(arg1);
		}

		@When("^I complete action$")
		public void i_complete_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@When("^some other action$")
		public void some_other_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  
		}

		@When("^yet another action$")
		public void yet_another_action() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@Then("^I validate the outcomes$")
		public void i_validate_the_outcomes() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 
		}

		@Then("^check more outcomes$")
		public void check_more_outcomes() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	
		}

		@Given("^I want to write a step with name(\\d+)$")
		public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@When("^I check for the (\\d+) in step$")
		public void i_check_for_the_in_step(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("^I verify the success in step$")
		public void i_verify_the_success_in_step()  {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("^I verify the Fail in step$")
		public void i_verify_the_Fail_in_step() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		 
		}


	

}
