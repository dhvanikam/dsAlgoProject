package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.Loggerload;

public class Home_SD {
	HomePage home = new HomePage();

	// User launch DsAlgo page
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws Exception {

		Loggerload.info("User is on DSAlgo portal page");
		home.dsalgopage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {

		Loggerload.info("User clicks on \"Getstarted link\" on Main Page");
		home.getStarted_link(string);
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

		String Title = home.getPageTitle();
		Loggerload.info("Title of current page is ***** " + Title + " ****");
		assertEquals(Title, "NumpyNinja", "Title do not match");

	}

	// The user tried to access link - click without login in home page
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		Loggerload.info("User is on Home page");
		home.homepage();
	}

	// user click Getstarted link on home page
	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {

		home.getStarted_home(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {

		String alert = home.alert();
		Loggerload.info("Actual Message : " + alert);
		assertEquals(alert, string, "Title do not match");
	}

	// User clicks drop down
	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		Loggerload.info("User clicks on dropdown without login");
		home.dropdown(string);
	}

	@When("The user clicks on dropdown")
	public void the_user_clicks_on_dropdown() {

	}

	// User click on sign in
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
		Loggerload.info("User clicks on Sign in ");
		home.signin_link();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {

		Loggerload.info("User redirected to login page ");
		String Title = home.login_page();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Login", "Title do not match");
	}

	// USer click on Register
	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
		Loggerload.info("User clicks on Register ");
		home.register_link();
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
		Loggerload.info("User redirected to Registraion page ");
		String Title = home.register_page();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Registration", "Title do not match");
	}

}
