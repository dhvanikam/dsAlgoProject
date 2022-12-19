package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.Loggerload;

public class Array_SD {
	ArrayPage arrayPage = new ArrayPage();
	
	//Scenario#1
	@When("The user clicks the {string} button in Array Panel or select Array item from the drop down menu")
	public void the_user_clicks_the_button_in_array_panel_or_select_array_item_from_the_drop_down_menu(String string) {
		Loggerload.info("User click on Data Structure dropdown ");
		//arrayPage.Arraypage();
		Loggerload.info("User select Array from Data Structure dropdown ");
		arrayPage.dropdown_Array();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
		Loggerload.info("User redirected to Array Data Structure Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Array", "Pass: Title matches");
	}

	//Scenario#2
	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {
		String Title=arrayPage.getArrayPageTitle();
	    Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
	    arrayPage.clickOnlink();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String pagename) {
		Loggerload.info("User redirected to "+pagename+"Array Data Structure Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, pagename, "Pass: Title matches");
	}
	
	//Scenario#3
	@Given("The user is in the Arrays in Python page after logged in")
	public void the_user_is_in_the_arrays_in_python_page_after_logged_in() {
		String Title=arrayPage.getArrayPageTitle();
	    Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String pagename) {
		 arrayPage.clickOnTryHereLink();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Pass: Title matches");
	}


}
