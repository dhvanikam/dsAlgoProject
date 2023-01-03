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

public class GraphPage {

	public static WebDriver driver = DriverFactory.getdriver();
	ElementsUtils eleUtil = new ElementsUtils();

	String homepage = ConfigReader.getHomePage();
	String graphurl = ConfigReader.getGraphUrl();
	String graphgraphurl = ConfigReader.getGraphGraphUrl();
	String graphrepresentationsurl = ConfigReader.getGraphRepresentationsUrl();

	// homepage
	@FindBy(xpath = "//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy(xpath = "//a[normalize-space()='Graph']")WebElement dropdown_graph;

	// graphpage
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Graph']")WebElement GraphLink;
	@FindBy(xpath = "//a[normalize-space()='Graph Representations']")WebElement GraphRepresentationslink;
	@FindBy(xpath = "//a[@class='btn btn-info']")WebElement GraphTryherelink;
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement GraphPracQuesLink;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy(xpath = "//button[@type='button']")WebElement runButton;
	@FindBy(id = "output")WebElement output;

	public GraphPage() {
		PageFactory.initElements(driver, this);
	}

	// Dropdown
	public void dropdown_graph() {
		dropdown.click();
		Loggerload.info("user clicked on Data Structure dropdown");
		dropdown_graph.click();
		Loggerload.info("user selected graph from data structures dropdown");
	}

	public String getGraphPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void navigateToHomePage() {
		driver.get(homepage);
		Loggerload.info("user is in home page");
	}

	public void navigateToGraphPage() {
		driver.get(graphurl);
		Loggerload.info("user is in graph page");
	}

	public void navigateToGraphGraphPage() {
		driver.get(graphgraphurl);
		Loggerload.info("user is in graphgraphpage");
	}

	public void navigateToGraphRepresentationsPage() {
		driver.get(graphrepresentationsurl);
		Loggerload.info("user is in graph representations page");
	}

	public void clickOnGraphPracQuesLink() {
		GraphPracQuesLink.click();
		Loggerload.info("User clicked on Graph Practice Questions link");
	}

	public void clickOnGraphLink() {
		GraphLink.click();
		Loggerload.info("User clicked on Graph link");
	}

	public void clickOnGraphRepresentationsLink() {
		GraphRepresentationslink.click();
		Loggerload.info("User clicked on Graph Representations link");
	}

	public void clickOnGraphTryhereLink() {
		GraphTryherelink.click();
		Loggerload.info("User clicked on Graph Try here link");
	}

	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		String code = eleUtil.getCodefromExcel(sheetname, rownumber);
		eleUtil.enterCode(code, editorInput);
	}
}
