package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.Loggerload;

public class DataStructure {
	public static WebDriver driver=DriverFactory.getdriver();
	
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement dataStrucIntroLink;
	@FindBy (xpath="//a[@href='time-complexity']")WebElement timeComplexitylink;

	public DataStructure() {

		PageFactory.initElements(driver, this);
	}

	public void getStarted_DS() {

		Loggerload.info("click " + dataStrucIntroLink.getText() + " link on home page");
		dataStrucIntroLink.click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnTimeComplexitylink() {
		timeComplexitylink.click();

	}

}
