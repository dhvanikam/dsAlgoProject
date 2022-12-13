package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.Loggerload;

public class Home_SD {
	HomePage home=new HomePage();

	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws Exception {
		Loggerload.info("User is on DSAlgo portal page");
		home.homepage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		
		Loggerload.info("User clicks on \"Getstarted link\" on Main Page");
		home.getStarted_link(string);
	}
	
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
	     String Title=home.getPageTitle();
	     Loggerload.info("Verify Title of current page as ***** "+Title+" ****");
	     assertEquals(Title, "NumpyNinja", "HomePage - Verified successfully");
	     
	}
	
	//The user tried to access link - click without login 
	
	@When("The user clicks on {string} link on homepage without login")
	public void the_user_clicks_on_link_on_homepage_without_login(String string) {
		
		Loggerload.info("User clicks on \"Getstarted link\" without login on Home page");
		home.getStarted_link(string);
	}

	@Then("The user warnin message {string}")
	public void the_user_warnin_message(String string) {
		 String alert=home.alert_login();
		 Loggerload.info("Verify the warning as ***** "+alert+"*****");
		 assertEquals(alert, "You are not logged in", "Without sigin alert message - Verified successfully");
	}

}
