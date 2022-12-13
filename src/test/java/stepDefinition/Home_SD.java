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
		home.homepage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		home.getStarted_link(string);
	}
	
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		
	     String Title=home.getPageTitle();
	     Loggerload.info("Verify Title of current page:"+Title);
	     assertEquals(Title, "NumpyNinja", "HomePage Verified successfully");
	}

}
