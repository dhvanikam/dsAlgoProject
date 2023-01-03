package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TreePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Tree_SD {
	TreePage treepage = new TreePage();
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
	public void the_user_should_be_directed_to_the_page(String pagename) {
		Loggerload.info("User redirected to Tree Data Structure Page ");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	// @TS_tree_03
	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		treepage.clickOnoverviewOfTreesPage();
	}

	@Then("The user should be directed to the {string} of tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String pagename) {
		Loggerload.info("User redirected to " + pagename);
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	// @TS_tree_04
	@When("The user clicks {string} button in a {string} page")
	public void the_user_clicks_button_in_a_page(String btnname, String dstname) {
		treepage.click_Tryhere(btnname, dstname);

	}

	@Then("The user should be redirected to a page having tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
		Loggerload.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}

	// @TS_tree_05
	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		Loggerload.info("The user is in a page having an tryEditor with a Run button to test");
		treepage.navigateTotryEditor();
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
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
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String sheetName, Integer rowNum)
			throws InvalidFormatException, IOException {
		Loggerload.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
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
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}

	// @TS_tree_07
	@When("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
		treepage.clickOnTerminologiesLink();
	}

	// @TS_tree_08, @TS_tree_09, @TS_tree_10
	// @TS_tree_11
	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
		treepage.clickOnTypesOfTreesPage();
	}

	// @TS_tree_12, @TS_tree_13, @TS_tree_14
	// @TS_tree_15
	@When("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
		treepage.clickOnTreeTraversalsLink();
	}
	// @TS_tree_16, @TS_tree_17, @TS_tree_18
	// @TS_tree_19

	@When("The user clicks on the Traversal illustration button")
	public void the_user_clicks_on_the_traversal_illustration_button() {
		treepage.clickOnTrav_illus_Link();
	}

	// @TS_tree_20, @TS_tree_21, @TS_tree_22
	// @TS_tree_23
	@When("The user clicks on the binary trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
		treepage.clickOnBinaryTreesLink();
	}

	// @TS_tree_24, @TS_tree_25, @TS_tree_26
	// @TS_tree_27
	@When("The user clicks on the types of binary trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
		treepage.clickOnTypesOfBTLink();
	}

	// @TS_tree_28, @TS_tree_29, @TS_tree_30
	// @TS_tree_31
	@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
		treepage.click_implementationinPython();
	}

	// @TS_tree_32, @TS_tree_33, @TS_tree_34
	// @TS_tree_35
	@When("The user clicks on the binary tree traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
		treepage.click_binaryTreeTraversals();
	}

	// @TS_tree_36, @TS_tree_37, @TS_tree_38
	// @TS_tree_39
	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
		treepage.click_implementationOfBinaryTrees();
	}

	// @TS_tree_40, @TS_tree_41, @TS_tree_42
	// @TS_tree_43
	@When("The user clicks on the Applications of Binary Trees button")
	public void the_user_clicks_on_the_Applications_of_binary_trees_button() {
		treepage.click_applicationsOfBinaryTrees();
	}

	// @TS_tree_44, @TS_tree_45, @TS_tree_46
	// @TS_tree_47
	@When("The user clicks on the Binary Search Trees button")
	public void the_user_clicks_on_the_binary_search_trees_button() {
		treepage.click_binarySearchTrees();
	}

	// @TS_tree_48, @TS_tree_49, @TS_tree_50
	// @TS_tree_51
	@When("The user clicks on the Implementation of BST button")
	public void the_user_clicks_on_the_implementation_of_bst_button() {
		treepage.click_implementationOfBST();
	}

	// @TS_tree_52, @TS_tree_53, @TS_tree_54
	// @TS_tree_55
	@When("The user clicks on the Practice Questions in Overview of Trees")
	public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
		treepage.click_practiceQuestion();
	}

	@Then("The user should be directed to Practice Questions of tree page Page")
	public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
		String Title = treepage.getTreePageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		Loggerload.info("NO questions found ");
	}

}
