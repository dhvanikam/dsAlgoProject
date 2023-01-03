package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.SigninPage;
import utilities.Loggerload;

public class Common_SD {
	SigninPage sign = new SigninPage();
	HomePage home = new HomePage();
	ArrayPage arrayPage = new ArrayPage();

	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_login_page_of_ds_algo_portal() {
		Loggerload.info("The user is on Signin page of DS Algo portal");
		sign.login_page();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_eneter_valid_and(String username, String password) {
		sign.doLogin(username, password);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		Loggerload.info("User clicks on login button");
		sign.click_login();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		String Title = home.getPageTitle();
		Loggerload.info("Title of current page is" + Title);
		assertEquals(Title, "NumpyNinja", "Pass : Titles match");
	}

	// @TS_array_02
	@Given("The user is on the Home page after logged in")
	public void the_user_is_on_the_home_page_after_logged_in() {
		String Title = home.getPageTitle();
		Loggerload.info("Title of current page is " + Title);
	}

	// @TS_array_02,@TS_array_02
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String pagename) {
		String page_name = pagename.replaceAll("\\s+", "");
		arrayPage.navigateTo(page_name);
		Loggerload.info("The user is on the " + pagename + " after logged in");
	}
}
