package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.SheetNameFormatter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;
import pageObjects.TreePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Tree_SD {
	TreePage treepage = new TreePage();
	StackPage stackpage = new StackPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	String expectedMsg;
	
// @TS_tree_02
	@When("The user selects Tree item from the drop down menu")
	public void the_user_selects_tree_item_from_the_drop_down_menu() {
		Loggerload.info("User click on Data Structure dropdown ");
		Loggerload.info("User select Tree from Data Structure dropdown ");
		treepage.dropdown_Tree();
	}
	
	@Then("The user should be directed to the {string} Page")
	public void the_user_should_be_directed_to_the_page(String string) {
		Loggerload.info("User redirected to Tree Data Structure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Tree", "Title do not match");
	}

// @TS_tree_03
	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
	    treepage.clickOnoverviewOfTreesPage();
	}

	@Then("The user should then be directed to Overview of Trees Page")
	public void the_user_should_then_be_directed_to_overview_of_trees_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Overview of Trees", "Title do not match");
	}

// @TS_tree_04
// @TS_tree_05
	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		treepage.enterTreePythoncode(sheetName, rowNum);
		expectedMsg = treepage.getExpectedResult(sheetName, rowNum);
	}

	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
	    treepage.clickOnRun();
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = treepage.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);
	}

// @TS_tree_06
	@When("The user gets invalid input from sheet {string} and {int} in trees")
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
	    treepage.enterTreePythoncode(sheetName, rowNum);
	}

	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
	    treepage.clickOnRun();
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
		String actualMsg = treepage.getErrormsg();
	     Loggerload.info("Actual result  :" + actualMsg);
	}

// @TS_tree_07
	@When("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
	    treepage.clickOnTerminologiesLink();
	}

	@Then("The user should be directed to Terminologies Page")
	public void the_user_should_be_directed_to_terminologies_page() {
		Loggerload.info("User redirected to Tree Implementation Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Terminologies", "Title do not match");
	}

// @TS_tree_08
// @TS_tree_09	
// @TS_tree_10
// @TS_tree_11
	
	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
	    treepage.clickOnTypesOfTreesPage();
	}

	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Types of Trees", "Title do not match");
	}
// @TS_tree_12
// @TS_tree_13
// @TS_tree_14
	
// @TS_tree_15
	@When("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
	    treepage.clickOnTreeTraversalsLink();
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Tree Traversals", "Title do not match");
	}

// @TS_tree_16
// @TS_tree_17
// @TS_tree_18

// @TS_tree_19
	@When("The user clicks on the Traversal illustration button")
	public void the_user_clicks_on_the_traversal_illustration_button() {
	    treepage.clickOnTrav_illus_Link();
	}

	@Then("The user should be directed to Traversal illustration Page")
	public void the_user_should_be_directed_to_traversal_illustration_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Traversals-Illustration", "Title do not match");
	}
// @TS_tree_20
// @TS_tree_21
// @TS_tree_22	

// @TS_tree_23
	@When("The user clicks on the binary trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
	   treepage.clickOnBinaryTreesLink();
	   }
	
	@Then("The user should be directed to binary trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Binary Trees", "Title do not match");
	}

// @TS_tree_24
// @TS_tree_25
// @TS_tree_26
	
// @TS_tree_27
	@When("The user clicks on the types of binary trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
	    treepage.clickOnTypesOfBTLink();
	}

	@Then("The user should be directed to types of binary trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
		Loggerload.info("User redirected to tree DataStructure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Types of Binary Trees", "Title do not match");
	}

// @TS_tree_28
// @TS_tree_29
// @TS_tree_30
	
	


	
}
