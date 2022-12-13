package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class HomePage {
	public  static WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	@FindBy (xpath="//a[@href=\"/home\"]")WebElement getstart_link;
	@FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart;
	@FindBy (xpath="//*[@class=\"alert alert-primary\"]")WebElement alert_msg;
	
	
	@Test
	public void homepage() throws Exception {
		
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
		
		getstart_link.click();
		
	}

	public String getPageTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	
	public String alert_login() {
		
		getstart.click();
		String msg=alert_msg.getText();
		Loggerload.warn(msg);
		return msg;
		
	}
	
}
