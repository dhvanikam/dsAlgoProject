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

public class QueuePage {

	public static WebDriver driver = DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	String queueurl = ConfigReader.getQueueUrl();
	String qpracquesurl = ConfigReader.getQPracQuesUrl();
	String homepage = ConfigReader.getHomePage();
	String impofqpythonurl = ConfigReader.getImpOfQPythonUrl();
	String editorurl = ConfigReader.getEditorUrl();
	String impcolldqurl = ConfigReader.getImpCollDQUrl();
    String impusingarray=ConfigReader.getImpUsingArrayUrl();
    
	// homepage
	@FindBy(xpath = "//*//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy(xpath = "//a[normalize-space()='Queue']")WebElement dropdown_queue;

	// queuepage
	@FindBy(xpath = "//a[normalize-space()='Implementation of Queue in Python']")WebElement ImplementationQueuePythonLink;
	@FindBy(xpath = "//a[@class='btn btn-info']")WebElement TryHereLink;

	@FindBy(xpath = "//a[@href='implementation-collections']")WebElement ImpCollectionsDequeLink;
	@FindBy(xpath = "//a[@href='Implementation-array']")WebElement ImpUsingArrayLink;
	@FindBy(xpath = "//a[@href='QueueOp']")WebElement QueueOperationsLink;
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement PracticeQuestionsLink;

	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy(xpath = "//button[@type='button']")WebElement runButton;
	@FindBy(id = "output")WebElement output;

	public QueuePage() {

		PageFactory.initElements(driver, this);
	}

	// Dropdown
	public void dropdown_queue() {
		dropdown.click();
		Loggerload.info("user clicked on Data Structure dropdown");
		dropdown_queue.click();
		Loggerload.info("user selected queue from data structures dropdown");

	}

	public String getQueuePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void navigateToHomePage() {
		driver.get(homepage);
		Loggerload.info("user is in homepage");
	}

	public void navigateToQueuePage() {
		driver.get(queueurl);
		Loggerload.info("User is in queue page");
	}

	public void navigateToQPracQuesPage() {
		driver.get(qpracquesurl);
	}

	public void navigateToImpOfQPython() {
		driver.get(impofqpythonurl);
		Loggerload.info("User is in Implementation of Queue in Python Page ");
	}

	public void navigateToEditorUrl() {
		driver.get(editorurl);
		Loggerload.info("User is in editor page");
	}

	public void navigateToImpCollDequePage() {
		driver.get(impcolldqurl);
		Loggerload.info("User is in Implementation using collections deque page");
	}

	public void clickOnImplementationQueuePythonLink() {
		Loggerload.info("click " + ImplementationQueuePythonLink.getText() + " in Queue page");
		ImplementationQueuePythonLink.click();
		Loggerload.info("User clicked on Implementation of Queue Python Link ");
	}
	
	public void navigateToImpUsingArrayUrl() {
		driver.get(impusingarray);
	}
	
	

	public void clickOnTryHereLink() {
		TryHereLink.click();
		Loggerload.info("User clicked on Try here link");

	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editorInput);
	}

	public String getExpectedResult(String sheetname, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetname, rowNum);
		return expectedResult;
	}

	public void clickOnRunButton() {
		runButton.click();
		Loggerload.info("User clicked on Run Button");
	}

	public String getActualResult() {

		return output.getText();
	}

	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}

	public void clickOnImpUsingCollLink() {
		Loggerload.info("click " + ImpCollectionsDequeLink.getText() + "On Queue page");
		ImpCollectionsDequeLink.click();
		Loggerload.info("User clicked on Implementation using collections deque link");
	}

	public void clickOnImpUsingArray() {
		ImpUsingArrayLink.click();
		Loggerload.info("User clicked on Implementation using array link");
	}

	public void clickOnQueueOperationsLink() {
		QueueOperationsLink.click();
		Loggerload.info("User clicked on Queue Operations link");
	}

	public void clickOnPracticeQuestionsLink() {
		PracticeQuestionsLink.click();
		Loggerload.info("User clicked on Practice Questions link");
	}

	
}
