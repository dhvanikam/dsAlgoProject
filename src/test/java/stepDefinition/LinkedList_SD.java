package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.*;
import pageObjects.LinkedListPage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class LinkedList_SD {
	LinkedListPage ll = new LinkedListPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	static String expectedMsg;

	// @TS_ll_02
	@When("The user selecting linkedlist item from the drop down menu")
	public void the_user_selecting_linkedlist_item_from_the_drop_down_menu() {
		Loggerload.info("The user select Linked List from the drop down menu");
		ll.dropdown_LinkedList();
	}

	@Then("The user redirected to {string}  Page")
	public void the_user_redirected_to_page(String pagename) {
		Loggerload.info("User redirected to linked list data structure Page ");
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	// @TS_ll_03

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		ll.click_introduction();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String pagename) {
		Loggerload.info("User redirected to the Page " + pagename);
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is checking:" + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	// @TS_ll_04

	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String btnname, String dstname) {
		ll.click_Tryhere(btnname, dstname);
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TS_ll_05

	@Given("The user is in a try here page having  tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
		Loggerload.info("The user is in a page having an tryEditor with a Run button to test");
		ll.navigateTotryEditor();
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		ll.enterPythonCode(sheetName, rowNum);
		expectedMsg = ll.getExpectedResult(sheetName, rowNum);
	}

	@When("user click on Run button")
	public void user_click_on_run_button() {
		ll.clickOnRunButton();
	}

	@Then("The user should be presented with the Run output")
	public void the_user_should_be_presented_with_the_run_output() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = ll.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}

	// @TS_ll_06

	@When("The user Enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		ll.enterPythonCode(sheetName, rowNum);
	}

	@Then("The user get the error message")
	public void the_user_get_the_error_message() {
		String actualMsg = ll.getErrorText();
		Loggerload.info("Actual Error message is  :" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	// @TS_ll_07, @TS_ll_08, @TS_ll_09, @TS_ll_10
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		ll.click_creatingLinkedList();
	}

	// @TS_ll_11, @TS_ll_12, @TS_ll_13, @TS_ll_14
	@When("The user clicks the Types of Linked List button")
	public void the_user_clicks_the_types_of_linked_list_button() {
		ll.click_typesOflLinkedList();
	}

	// @TS_ll_15, @TS_ll_16, @TS_ll_17, @TS_ll_18
	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
		ll.click_implementlinkedListInPython();
	}

	// @TS_ll_19, @TS_ll_20, @TS_ll_21, @TS_ll_22
	@When("The user clicks the Traversal button")
	public void the_user_clicks_the_traversal_button() {
		ll.click_traversal();
	}

	// @TS_ll_23, @TS_ll_24, @TS_ll_25, @TS_ll_26
	@When("The user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
		ll.click_insertion();
	}

	// @TS_ll_27, @TS_ll_28, @TS_ll_29, @TS_ll_30
	@When("The user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
		ll.click_deletion();
	}

	// @TS_ll_31
	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
		ll.click_practiceQuestion();
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
		String Title = ll.getLinkedListPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		Loggerload.info("NO questions found ");
	}

}
