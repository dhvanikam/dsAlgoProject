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

public class TreePage {

	public static WebDriver driver = DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	String tryEditorURL = ConfigReader.tryEditorURL();

	// Homepage
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
	@FindBy(xpath = "//a[@href='tree']")WebElement getstart_tree;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(@href, '/tree')]")WebElement dropdown_tree;

	@FindBy(xpath = "//*[@href='overview-of-trees']")WebElement overviewOfTreesLink;
	@FindBy(xpath = "//*[@href='terminologies']")WebElement terminologiesLink;
	@FindBy(xpath = "//*[@href='types-of-trees']")WebElement typesoftreesLink;
	@FindBy(xpath = "//*[@href='tree-traversals']")WebElement treetraversalsLink;
	@FindBy(xpath = "//*[@href='traversals-illustration']")WebElement trav_illustrationsLink;
	@FindBy(xpath = "//*[@href='binary-trees']")WebElement binarytreesLink;
	@FindBy(xpath = "//*[@href='types-of-binary-trees']")WebElement typesofBinaryTreesLink;
	@FindBy(xpath = "//a[@href='implementation-in-python']")WebElement implementationInPythonLink;
	@FindBy(xpath = "//a[@href='binary-tree-traversals']")WebElement binaryTreeTraversalsLink;
	@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='binary-search-trees']")WebElement binarySearchTreesLink;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")WebElement implementationOfBSTLink;
	@FindBy(xpath = "//a[@href='/tree/practice']")WebElement practiceQuestionLink;

	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement TryHereLink;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy(xpath = "//*[@id='answer_form']/button")WebElement runButton;
	@FindBy(id = "output")WebElement output;

	public TreePage() {
		PageFactory.initElements(driver, this);
	}

	// Dropdown
	public void dropdown_Tree() {
		Loggerload.info("click " + dropdown.getText() + "on drop down");
		dropdown.click();
		Loggerload.info("click " + dropdown_tree.getText() + "from the drop down");
		dropdown_tree.click();
	}

	public String getTreePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnoverviewOfTreesPage() {
		Loggerload.info("click " + overviewOfTreesLink.getText() + " On Trees page");
		overviewOfTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_Tryhere(String bname, String dsname) {
		Loggerload.info("click on " + bname + " button on " + dsname);
		TryHereLink.click();
	}

	public void enterTreePythoncode(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editorInput);
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = eleUtil.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public void clickOnRun() {
		runButton.click();
	}

	public String getActualResult() {
		return output.getText();
	}

	public String getErrormsg() {
		String errormsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errormsg;
	}

	public void navigateTotryEditor() {
		driver.get(tryEditorURL);
	}

	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}

	public void clickOnTerminologiesLink() {
		Loggerload.info("click " + terminologiesLink.getText() + " On tree page");
		terminologiesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTypesOfTreesPage() {
		Loggerload.info("click " + typesoftreesLink.getText() + " On tree page");
		typesoftreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTreeTraversalsLink() {
		Loggerload.info("click " + treetraversalsLink.getText() + " On tree page");
		treetraversalsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTrav_illus_Link() {
		Loggerload.info("click " + trav_illustrationsLink.getText() + " On tree page");
		trav_illustrationsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnBinaryTreesLink() {
		Loggerload.info("click " + binarytreesLink.getText() + " On tree page");
		binarytreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTypesOfBTLink() {
		Loggerload.info("click " + typesofBinaryTreesLink.getText() + " On tree page");
		typesofBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationinPython() {
		Loggerload.info("click " + implementationInPythonLink.getText() + " On tree page");
		implementationInPythonLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_binaryTreeTraversals() {
		Loggerload.info("click " + binaryTreeTraversalsLink.getText() + " On tree page");
		binaryTreeTraversalsLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationOfBinaryTrees() {
		Loggerload.info("click " + implementationOfBinaryTreesLink.getText() + " On tree page");
		implementationOfBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_applicationsOfBinaryTrees() {
		Loggerload.info("click " + applicationsOfBinaryTreesLink.getText() + " On tree page");
		applicationsOfBinaryTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_binarySearchTrees() {
		Loggerload.info("click " + binarySearchTreesLink.getText() + " On tree page");
		binarySearchTreesLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationOfBST() {
		Loggerload.info("click " + implementationOfBSTLink.getText() + " On tree page");
		implementationOfBSTLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

	public void click_practiceQuestion() {
		Loggerload.info("click " + practiceQuestionLink.getText() + " On tree page");
		practiceQuestionLink.click();
		Loggerload.info(" Title of the page " + driver.getTitle());
	}

}
