package pageObjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.ElementsUtils;
import utilities.Loggerload;

public class ArrayPage {
	public static WebDriver driver=DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	String tryEditorURL=ConfigReader.tryEditorURL();
	
	//Homepage
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
	@FindBy (xpath="//a[@href='array']")WebElement getstart_array;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[contains(@href, '/array')]")WebElement dropdown_array;
	
	//ArrayPage
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//a[@href='arrays-using-list']")WebElement arraysUsingListLink;
	@FindBy (xpath="//a[@href='basic-operations-in-lists']")WebElement basicOpinListsLink;
	@FindBy (xpath="//a[@href='applications-of-array']")WebElement appOfArrayLink;
	
	@FindBy (xpath="//a[@href='/array/practice']")WebElement practiceQueLink;
	@FindBy (xpath="//a[@href='/question/1']")WebElement searchArrayLink;
	@FindBy (xpath="//a[@href='/question/2']")WebElement mostConOnesLink;
	@FindBy (xpath="//a[@href='/question/3']")WebElement findEvenNumLink;
	@FindBy (xpath="//a[@href='/question/4']")WebElement sqOfSortedArrayLink;
	
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
	@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//*[@id='answer_form']/button")WebElement runButton;
	@FindBy (xpath="//*[@class='button']")WebElement submitButton;
	@FindBy (id="output")WebElement output; 
	
	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}

	public void dropdown_Array() {
		Loggerload.info("click " + dropdown.getText() + " on drop down");
		dropdown.click();
		Loggerload.info("click " + dropdown_array.getText() + " from the drop down");
		dropdown_array.click();
	}

	public void getStarted_Array() {
		Loggerload.info("click " + getstart_datastructures.getText() + " link on  DataStructures ");
		getstart_datastructures.click();
		Loggerload.info("click " + getstart_array.getText() + " link on Array ");
		getstart_array.click();
	}

	public String getArrayPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnarraysInPythonLink() {
		Loggerload.info("click " + arraysInPythonLink.getText() + " On array page");
		arraysInPythonLink.click();
	}

	public void clickOnTryHereLink(String bname, String dsname) {
		Loggerload.info("click on " + bname + " button on " + dsname);
		TryHereLink.click();

	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editorInput);

	}

	public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		eleUtil.waitForElement(answerform);
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCodePractice(code, editorInput);

	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getActualResult() {
		eleUtil.waitForElement(output);
		return output.getText();

	}

	public void clickOnRunButton() {
		Loggerload.info("Click on Run button");
		runButton.click();

	}

	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;

	}

	public void clickArraysUsingList() {
		Loggerload.info("click " + arraysUsingListLink.getText() + " On array page");
		arraysUsingListLink.click();

	}

	public void clickBasicOpInLists() {
		Loggerload.info("click " + basicOpinListsLink.getText() + " On array page");
		basicOpinListsLink.click();

	}

	public void clickAppOfArray() {
		Loggerload.info("click " + appOfArrayLink.getText() + " On array page");
		appOfArrayLink.click();

	}

	public void clickPracticeQue() {
		Loggerload.info("click " + practiceQueLink.getText() + " On array page");
		practiceQueLink.click();

	}

	public void clickarrayLink() {
		Loggerload.info("click " + searchArrayLink.getText() + " On array page");
		searchArrayLink.click();

	}

	public void clickOnSubmitButton() {
		Loggerload.info("Click on Submit button");
		submitButton.click();
	}

	public void navigateTotryEditor() {

		driver.get(tryEditorURL);

	}

	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}

	public void maxConsOnes() {
		Loggerload.info("The user clicks the Max Consecutive Ones link");
		mostConOnesLink.click();

	}

	public void findNumbers() {
		Loggerload.info("The user clicks the Find Numbers with Even Number of Digits link");
		findEvenNumLink.click();

	}

	public void squaresSortedArray() {
		Loggerload.info("The user clicks the Squares of a Sorted Array link");
		sqOfSortedArrayLink.click();
	}

}