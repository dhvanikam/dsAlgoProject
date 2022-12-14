package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class HomePage {
	public  static WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	String homeURL=ConfigReader.getHomePage();
	
	//Dsalgo page
	@FindBy (xpath="//a[@href=\"/home\"]")WebElement getstart_link;
	@FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart;
	
	//alert 
	@FindBy (xpath="//*[@class=\"alert alert-primary\"]")WebElement alert_msg;
	
	//Homepage
	@FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart_home;
	@FindBy (xpath="//a[@href='#']")WebElement dropdown;
	@FindBy (xpath="//div[@class='dropdown-menu show']")WebElement dropdown_list;
	
	//sigin
	@FindBy (xpath="//a[@href='/login']")
	static WebElement signin;
	//register
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	
	
	//Dsalgo page elements
	public void dsalgopage() {
		
			driver=DriverFactory.getdriver();
			driver.get(URL);
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
				
		String msg=alert_msg.getText();
		Loggerload.warn(msg);
		return msg;
		
	}

	//Home page Elements
	public void homepage() {
		
		driver=DriverFactory.getdriver();
		driver.get(homeURL);
		PageFactory.initElements(driver, this);
	}

	public void getStarted_home(String string) {
		
		getstart.click();
	}

	//Dropdown
	public void dropdown() {
		
		dropdown.click();
		dropdown_list.click();
		
	}

	//Signin 
	public static void signin_link() {
		signin.click();
	}

	public String login_page() {
		String title=driver.getTitle();
		return title;
	}

	//Register
	public void register_link() {
		
		register.click();
		
	}

	public String register_page() {
		String title=driver.getTitle();
		return title;
	}
	
}
