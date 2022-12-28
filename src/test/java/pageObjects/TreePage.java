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

	
	public static WebDriver driver=DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();
	String tryEditorURL=ConfigReader.tryEditorURL();
	
	//Homepage
		@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
		@FindBy (xpath="//a[@href='tree']")WebElement getstart_tree;
		@FindBy (xpath="//*[@id=\"navbarCollapse\"]//a[contains(text(), 'Data Structures')]")WebElement dropdown;
		@FindBy (xpath="//*[@id='navbarCollapse']//a[contains(@href, '/tree')]")WebElement dropdown_tree;
			
		@FindBy (xpath="//*[@href='overview-of-trees']") WebElement overviewOfTreesLink;
		@FindBy (xpath="//*[@href='terminologies']") WebElement terminologiesLink;
		@FindBy (xpath="//*[@href='types-of-trees']") WebElement typesoftreesLink;
		@FindBy (xpath="//*[@href='tree-traversals']") WebElement treetraversalsLink;
		@FindBy (xpath="//*[@href='traversals-illustration']") WebElement trav_illustrationsLink;
		@FindBy (xpath="//*[@href='binary-trees']") WebElement binarytreesLink;
		@FindBy (xpath="//*[@href='types-of-binary-trees']") WebElement typesofBinaryTreesLink;
		
		@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
		@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
		@FindBy (xpath="//*[@id='answer_form']/button")WebElement runButton; 
		@FindBy (id="output") WebElement output;

	
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
			Loggerload.info("click " + overviewOfTreesLink.getText() + "On Trees page");
			overviewOfTreesLink.click();
		}

		public void enterTreePythoncode(String sheetname, Integer rownumber) throws InvalidFormatException, IOException{
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
		public void clickOnTerminologiesLink() {
			terminologiesLink.click();
		}

		public void clickOnTypesOfTreesPage() {
			typesoftreesLink.click();
		}

		public void clickOnTreeTraversalsLink() {
			treetraversalsLink.click();
		}

		public void clickOnTrav_illus_Link() {
			trav_illustrationsLink.click();
		}

		public void clickOnBinaryTreesLink() {
			binarytreesLink.click();
		}

		public void clickOnTypesOfBTLink() {
			typesofBinaryTreesLink.click();
		}
		
		
	
	
}
