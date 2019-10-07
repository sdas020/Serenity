package test1;

import static net.serenitybdd.rest.SerenityRest.then;

import java.sql.Driver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.*;

public class Cab_book_Step_definition {
	
	@Steps
	HomePage hp;
	@Steps
	Cab_Book_Page cb;

	
		// TODO Auto-generated method stub
	//API_Demo api;


@Given("^Open one cognizant portal$")
public void open_one_cognizant_portal() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   cb.Login();
}

@When("^Book the cab with \"([^\"]*)\",\"([^\"]*)\"$")
public void book_the_cab_with(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^validate the cab booking procedure with \"([^\"]*)\",\"([^\"]*)\"$")
public void validate_the_cab_booking_procedure_with(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}


	

}
