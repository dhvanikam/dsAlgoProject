package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class HomePage {
	public  static WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	@FindBy (xpath="//a[@href=\"/home\"]")WebElement getstart_link;
	
	
	@Test
	public void homepage() throws Exception {
		
		Loggerload.info("User is on DSAlgo portal page");
		try {
			
			driver=DriverFactory.getdriver();
			driver.get(URL);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		PageFactory.initElements(driver, this);
	
				
	}

	public void getStarted_link(String str) {
		
		Loggerload.info("User clicks on "+str+" Link");
		getstart_link.click();
		
	}

	public String getPageTitle() {
		Loggerload.info("Get the Title of the Page:");
		String title=driver.getTitle();
		return title;
		
	}
	
}
