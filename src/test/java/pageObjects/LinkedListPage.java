package pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;

public class LinkedListPage {
	public static WebDriver driver = DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	// String linkedlistURL=ConfigReader.getLinkedListUrl();
	String tryEditorURL = ConfigReader.tryEditorURL();

	// Homepage
	@FindBy(linkText = "Get Started")WebElement getStarted;
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement getStartDataStructures;
	@FindBy(xpath = "//a[@href='linked-list']")WebElement getstart_linkedlist;
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;
	@FindBy(xpath = "//a[@href='/linked-list']")WebElement dropdown_linkedlist;

	// LinkedListPage
	@FindBy (xpath="//a[@href='introduction']")WebElement introductionLink;  //https://dsportalapp.herokuapp.com/linked-list/introduction/
	@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creatinglinkedlistLink; //https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/
	@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLLLink;  //https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/
	@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLLInPythonLink; //https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/
	@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; //https://dsportalapp.herokuapp.com/linked-list/traversal/
	@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; //https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/
	@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink; //https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/
	@FindBy (xpath="//a[@href='/linked-list/practice']")WebElement practiceQuestionLink; //https://dsportalapp.herokuapp.com/linked-list/practice
	
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHereLink;
	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")WebElement editorInput; // textarea[@tabindex='0']
	@FindBy(xpath = "//*[@id='answer_form']/button")WebElement runButton;
	@FindBy(id = "output")WebElement output;

	public LinkedListPage() {

		PageFactory.initElements(driver, this);
	}

	public void dropdown_LinkedList() {
		Loggerload.info("click " + dropDown.getText() + "on drop down"); // Data Structure
		dropDown.click();
		Loggerload.info("click" + dropdown_linkedlist.getText() + "from drop down"); // Linked List
		dropdown_linkedlist.click();
	}

	public String getLinkedListPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void click_introduction() {
		Loggerload.info("click " + introductionLink.getText()); // Introduction
		introductionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle()); // https://dsportalapp.herokuapp.com/linked-list/introduction/
	}

	public void click_Tryhere(String bname, String dsname) {
		// Loggerload.info("click " + tryHereLink.getText() + " In the page" ); //Try
		// here >>>
		Loggerload.info("click on " + bname + " button on " + dsname);
		tryHereLink.click();
	}

	public void editorpagetitle() {
		Loggerload.info(" Title of the page " + driver.getTitle()); // https://dsportalapp.herokuapp.com/tryEditor
	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editorInput);
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getActualResult() {
		// eleUtil.waitForElement(output);
		return output.getText();
	}

	public void clickOnRunButton() {
		runButton.click();
	}

	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}

	// public void navigateToLinkedListPage()
	public void navigateTotryEditor() {
		driver.get(tryEditorURL);
	}

	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}

	public void click_creatingLinkedList() {
		Loggerload.info("click " + creatinglinkedlistLink.getText() + " On linked list page");
		creatinglinkedlistLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_typesOflLinkedList() {
		Loggerload.info("click " + typesOfLLLink.getText() + " On linked list page");
		typesOfLLLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementlinkedListInPython() {
		Loggerload.info("click " + implementLLInPythonLink.getText() + " On linked list page");
		implementLLInPythonLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_traversal() {
		Loggerload.info("click " + traversalLink.getText() + " On linked list page");
		traversalLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_insertion() {
		Loggerload.info("click " + insertionLink.getText() + " On linked list page");
		insertionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_deletion() {
		Loggerload.info("click " + deletionLink.getText() + " On linked list page");
		deletionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_practiceQuestion() {
		Loggerload.info("click " + practiceQuestionLink.getText() + " On linked list page");
		practiceQuestionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

}
