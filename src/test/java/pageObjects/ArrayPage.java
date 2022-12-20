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
	String arrayURL=ConfigReader.getArrayUrl();
	
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
	
	
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;//(//*[@class=\"CodeMirror-scroll\"]//*[@class=\"CodeMirror-lines\"]//pre)[1]
	@FindBy (xpath="//*[@id='answer_form']/button")WebElement runButton;
	@FindBy (id="output")WebElement output; 
	
	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}

	public void dropdown_Array() {
		Loggerload.info("click " + dropdown.getText() + "on drop down");
		dropdown.click();
		Loggerload.info("click " + dropdown_array.getText() + "from the drop down");
		dropdown_array.click();
	}

	public void getStarted_Array() {
		Loggerload.info("click " + getstart_datastructures.getText() + "link on  DataStructures ");
		getstart_datastructures.click();
		Loggerload.info("click " + getstart_array.getText() + "link on Array ");
		getstart_array.click();
	}

	public String getArrayPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnarraysInPythonLink() {
		Loggerload.info("click " + arraysInPythonLink.getText() + "On array page");
		arraysInPythonLink.click();
	}

	public void clickOnTryHereLink() {
		Loggerload.info("click " + TryHereLink.getText() + "On Arrays in Python page");
		TryHereLink.click();

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

	public void navigateToArrayPage() {
		driver.get(arrayURL);

	}

	public void clickArraysUsingList() {
		Loggerload.info("click " + arraysUsingListLink.getText() + "On array page");
		arraysUsingListLink.click();

	}

}