package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Queue_SD {
	QueuePage queuePage = new QueuePage();
	String Excelpath = ConfigReader.getexcelfilepath();
	String expectedMsg;

	// @TS_queue_02

	@Given("The user is in homepage")
	public void the_user_is_in_homepage() {
		queuePage.navigateToHomePage();
	}

	@When("The user clicks the queue item from the drop down menu")
	public void the_user_clicks_the_queue_item_from_the_drop_down_menu() {
		queuePage.dropdown_queue();
	}

	@Then("The user be directed to Queue Data Structure Page")
	public void the_user_be_directed_to_queue_data_structure_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("title of current page : " + Title);
		assertEquals(Title, "Queue", "Title not matched");
	}

	// @TS_queue_03

	@Given("The user in queue page")
	public void the_user_in_queue_page() {
		queuePage.navigateToQueuePage();
	}

	@When("The user clicks on Implementation of queue in python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
		queuePage.clickOnImplementationQueuePythonLink();
	}

	@Then("The user should be directed to Implementation of Queue in Python page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Implementation of Queue in Python", "Title not matched");
	}

	// @TS_queue_04

	@Given("The user is in Implementation of queue in python link page")
	public void the_user_is_in_implementation_of_queue_in_python_link_page() {
		queuePage.navigateToImpOfQPython();
	}

	@When("The user clicks on Tryhere link")
	public void the_user_clicks_on_tryhere_link() {
		queuePage.clickOnTryHereLink();
	}

	@Then("The user navigates to Editor page with Run button")
	public void the_user_navigates_to_editor_page_with_run_button() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title not matched");

	}
	// @TS_queue_05

	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		queuePage.navigateToEditorUrl();
	}

	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		queuePage.enterPythonCode(sheetName, rowNum);
		expectedMsg = queuePage.getExpectedResult(sheetName, rowNum);
	}

	@When("clicks run button")
	public void clicks_run_button() {
		queuePage.clickOnRunButton();

	}

	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = queuePage.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);

	}

	// @TS_queue_06
	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		queuePage.enterPythonCode(sheetName, rowNum);

	}

	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		Loggerload.info("Invalid code is taken from excel and clicked on run button");
		String actualMsg = queuePage.getErrorText();
		Loggerload.info("Error message for invalid python code is -" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");

	}

	// @TS_queue_07

	@Given("The user in editor page and navigates to the queue page")
	public void the_user_in_editor_page_and_navigates_to_the_queue_page() {
		queuePage.navigateToQueuePage();

	}

	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
		queuePage.clickOnImpUsingCollLink();

	}

	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("Title of current page is " + Title);
		assertEquals(Title, "Implementation using collections.deque", "Title not matched");
		
	}

	// @TS_queue_08
	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
		queuePage.navigateToImpCollDequePage();

	}

	// @TS_queue_11
	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
		queuePage.clickOnImpUsingArray();

	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("User is in " + Title);
		assertEquals(Title, "Implementation using array", "Title not matched");
	}

	// @TS_queue_12
	@Given("The user in implementation using array page")
	public void the_user_in_implementation_using_array_page() {
        queuePage.navigateToImpUsingArrayUrl();
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("User is in " + Title);
	}

	// @TS_queue_15
	@When("The user clicks on Queue Operations link")
	public void the_user_clicks_on_queue_operations_link() {
		queuePage.clickOnQueueOperationsLink();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("User is in " + Title );
		assertEquals(Title, "Queue Operations", "Title not matched");
	}

	// @TS_queue_16
	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
		queuePage.navigateToQPracQuesPage();
		Loggerload.info("User is in Queue Operations page");
	}

	// @TS_queue_19
	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		queuePage.navigateToQPracQuesPage();

	}

	@When("the user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		queuePage.clickOnPracticeQuestionsLink();

	}

	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		String Title = queuePage.getQueuePageTitle();
		Loggerload.info("User is in " + Title );
		assertEquals(Title, "Practice Questions", "Title not matched");
	}

}
