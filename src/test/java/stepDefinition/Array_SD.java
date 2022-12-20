package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Loggerload;

public class Array_SD {
	ArrayPage arrayPage = new ArrayPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	String expectedMsg;

	String code;

	// Scenario#1
	@When("The user clicks the {string} button in Array Panel or select Array item from the drop down menu")
	public void the_user_clicks_the_button_in_array_panel_or_select_array_item_from_the_drop_down_menu(String string) {
		Loggerload.info("User click on Data Structure dropdown ");
		// arrayPage.Arraypage();
		Loggerload.info("User select Array from Data Structure dropdown ");
		arrayPage.dropdown_Array();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
		Loggerload.info("User redirected to Array Data Structure Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Array", "Title do not match");
	}

	// Scenario#2
	@Given("The user is in the Array page after logged in")
	public void the_user_is_in_the_array_page_after_logged_in() {
		arrayPage.navigateToArrayPage();
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
		arrayPage.clickOnarraysInPythonLink();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Loggerload.info("User redirected to Array Data Structure Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "sArrays in Python", "Title do not match");
	}

	// Scenario#3
	@Given("The user is in the Arrays in Python page after logged in")
	public void the_user_is_in_the_arrays_in_python_page_after_logged_in() {
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		arrayPage.clickOnTryHereLink();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// Scenario#4
	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks on Run button after Entering valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_try_editor_from_sheet_and(
			String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		arrayPage.enterPythonCode(sheetName, rowNum);
		expectedMsg = arrayPage.getExpectedResult(sheetName, rowNum);
		arrayPage.clickOnRunButton();

	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = arrayPage.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);

	}

	// Scenario#5
	@When("The user clicks on Run button after Entering python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_clicks_on_run_button_after_entering_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(
			String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		arrayPage.enterPythonCode(sheetName, rowNum);
		arrayPage.clickOnRunButton();
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		String actualMsg = arrayPage.getErrorText();
		Loggerload.info("Actual result  :" + actualMsg);
	}

	// Scenario#6
	@Given("The user is in the Arrays using List page after logged in")
	public void the_user_is_in_the_arrays_using_list_page_after_logged_in() {
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user clicks Arrays using List button")
	public void the_user_clicks_arrays_using_list_button() {
		arrayPage.clickArraysUsingList();
	}

	@Then("The user should be redirected to Arrays using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		Loggerload.info("User redirected to Arrays using List page");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Arrays Using List", "Title do not match");
	}

}
