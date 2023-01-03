package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Stack_SD {
	StackPage stackpage = new StackPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	String expectedMsg;

	@When("The user selects Stack item from the drop down menu")
	public void the_user_selects_stack_item_from_the_drop_down_menu() {
		Loggerload.info("User click on Data Structure dropdown ");
		Loggerload.info("User select Stack from Data Structure dropdown ");
		stackpage.dropdown_Stack();
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		Loggerload.info("User redirected to Stack Data Structure Page ");
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Stack", "Title do not match");
	}

	// @TS_stack_03

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		stackpage.clickOnOperationsInstackpage();
	}

	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {

		Loggerload.info("User redirected to Stack DataStructure Page ");
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Operations in Stack", "Title do not match");
	}

	// @TS_stack_04	

	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String btnname, String dstname) {
		stackpage.clickTryHereLink(btnname, dstname);
	}

	@Then("The user should be redirected to operationsinstack page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_operationsinstack_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TS_stack_05
	@Given("The user is in stack page having an tryEditor with a Run button to test")
	public void the_user_is_in_stack_page_having_an_try_editor_with_a_run_button_to_test() {
		stackpage.navigateTotryEditor();
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		stackpage.enterStackPythoncode(sheetName, rowNum);
		expectedMsg = stackpage.getExpectedResult(sheetName, rowNum);
	}

	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		stackpage.clickOnRun();
	}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = stackpage.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);
	}

	// @TS_stack_06	
	@When("The user gets invalid input from sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		stackpage.enterStackPythoncode(sheetName, rowNum);
	}

	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		stackpage.clickOnRun();
	}

	@Then("The user should get the error message")
	public void the_user_should_get_the_error_message() {
		String actualMsg = stackpage.getErrormsg();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	// @TS_stack_07

	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		stackpage.clickOnimplementationlink();
	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {
		Loggerload.info("User redirected to Stack Implementation Page ");
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Implementation", "Title do not match");
	}

	// @TS_stack_08
	// @TS_stack_09
	// @TS_stack_10
	// @TS_stack_11

	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		stackpage.clickOnapplicationslink();
		Loggerload.info("User redirected to Stack Applications Page ");
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Applications", "Title do not match");
	}

	// @TS_stack_12
	// @TS_stack_13	
	// @TS_stack_14	
	// @TS_stack_15

	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		stackpage.clickOnapplicationslink();
		stackpage.clickOnPracticeQuestionspage();
		Loggerload.info("User redirected to Practice Questions  Page ");
	}

	@Then("The user should be directed to Practice Questions  Page")
	public void the_user_should_be_directed_to_practice_questions_page() {
		String Title = stackpage.getStackPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		Loggerload.info("NO questions found ");
	}

}
