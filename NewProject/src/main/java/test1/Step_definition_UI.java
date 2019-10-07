package test1;

import static net.serenitybdd.rest.SerenityRest.then;

import java.sql.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.*;

public class Step_definition_UI {
	
	@Steps
	HomePage hp;
	

	
		// TODO Auto-generated method stub
	//API_Demo api;

	@Given("^Navigate to the page$")
	public void navigate_to_the_page() throws Throwable {
	    
	   
	}
	
	//@SuppressWarnings("deprecation")
	//@Screenshots(forEachAction=true)
	@When("^Provide the valid details with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void provide_the_valid_details_with(String departure_City,String Destination_place,String Onward_date,String Return_date,String text) throws Throwable {
		//Thucydides.takeScreenshot();
	    hp.searchFor(departure_City, Destination_place, Onward_date, Return_date,text);
	}

	@When("^validate the web page$")
	public void validate_the_web_page() throws Throwable {
	    
	    
	}


	

}
