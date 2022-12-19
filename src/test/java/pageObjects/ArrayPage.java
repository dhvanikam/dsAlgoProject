package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.Loggerload;

public class ArrayPage {
	public static WebDriver driver=DriverFactory.getdriver();
	
	//Homepage
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
	@FindBy (xpath="//a[@href='array']")WebElement getstart_array;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]//a[contains(@href, '/array')]")WebElement dropdown_array;
	
	//ArrayPage
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
	
	// Array page Elements
	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}

	// Dropdown
	public void dropdown_Array() {
		Loggerload.info("click " + dropdown.getText() + "on drop down");
		dropdown.click();
		Loggerload.info("click " + dropdown_array.getText() + "from the drop down");
		dropdown_array.click();
	}

	// Get started link
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

	public void clickOnlink() {
		Loggerload.info("click " + arraysInPythonLink.getText() + "On array page");
		arraysInPythonLink.click();
	}

	public void clickOnTryHereLink() {
		Loggerload.info("click " + TryHereLink.getText() + "On Arrays in Python page");
		TryHereLink.click();

	}

}