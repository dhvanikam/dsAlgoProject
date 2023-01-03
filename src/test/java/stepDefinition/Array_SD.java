package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Array_SD {
	ArrayPage arrayPage = new ArrayPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	static String expectedMsg;

	@When("The user select Array item from the drop down menu")
	public void the_user_select_array_item_from_the_drop_down_menu() {
		Loggerload.info("The user select Array item from the drop down menu");
		arrayPage.dropdown_Array();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String pagename) {
		Loggerload.info("User redirected to " + pagename + " Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");

	}

	// @TS_array_03
	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {
		arrayPage.clickOnarraysInPythonLink();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String pagename) {
		Loggerload.info("User redirected to " + pagename + " Page ");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	// @TS_array_04
	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String btnname, String dstname) {
		arrayPage.clickOnTryHereLink(btnname, dstname);
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TS_array_05
	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("The user is in a page having an tryEditor with a Run button to test");
		arrayPage.navigateTotryEditor();
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		arrayPage.enterPythonCode(sheetName, rowNum);
		expectedMsg = arrayPage.getExpectedResult(sheetName, rowNum);
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		arrayPage.clickOnRunButton();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() throws InterruptedException {
		String actualMsg = arrayPage.getActualResult();
		Loggerload.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");

	}

	// @TS_array_06
	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		arrayPage.enterPythonCode(sheetName, rowNum);
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
		String actualMsg = arrayPage.getErrorText();
		Loggerload.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	// @TS_array_07
	// @TS_array_08
	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
		arrayPage.clickArraysUsingList();
	}

	// @TS_array_09
	// @TS_array_10

	// @TS_array_11
	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
		arrayPage.clickBasicOpInLists();
	}

	// @TS_array_12
	// @TS_array_13
	// @TS_array_14
	// @TS_array_15
	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		arrayPage.clickAppOfArray();
	}
	// @TS_array_16
	// @TS_array_17
	// @TS_array_18

	// Practice questions
	// @TS_array_19
	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		arrayPage.clickPracticeQue();
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		Loggerload.info("User redirected to Practice page");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
	}

	// @TS_array_20
	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		arrayPage.clickarrayLink();
	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
		Loggerload
				.info("User redirected to Question page contains a question,an tryEditor with Run and Submit buttons");
		String Title = arrayPage.getArrayPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TS_array_21
	@Given("The user is on {string} page of {string} after logged in")
	public void the_user_is_on_page_of_after_logged_in(String pname, String pname2) {
		Loggerload.info("The user is on " + pname + "page of " + pname2 + " after logged in");
		String page_name = pname + pname2.replaceAll("\\s+", "");
		arrayPage.navigateTo(page_name);
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number :" + rowNum);
		arrayPage.enterPythonCodePractice(sheetName, rowNum);
		expectedMsg = arrayPage.getExpectedResult(sheetName, rowNum);
	}

	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
		arrayPage.clickOnSubmitButton();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() throws InterruptedException {
		String actualMsg = arrayPage.getActualResult();
		Loggerload.info("Actual result of successful submission message :" + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

	// @TS_array_23
	// @TS_array_24

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {

		arrayPage.maxConsOnes();
	}

	// @TS_array_25
	// @TS_array_26
	// @TS_array_27
	// @TS_array_28

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		arrayPage.findNumbers();
	}

	// @TS_array_29
	// @TS_array_30
	// @TS_array_31
	// @TS_array_32

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arrayPage.squaresSortedArray();
	}

	// @TS_array_33
	// @TS_array_34
	// @TS_array_35
	@Then("The user should be presented with error message as {string}")
	public void the_user_should_be_presented_with_error_message_as(String expectedmsg) {
		String actualMsg = arrayPage.getErrorText();
		Loggerload.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg, expectedmsg, "Result do not match");
	}
}
