package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class SigninPage {

	public  static WebDriver driver;
	String loginURL=ConfigReader.getLoginPage();
	
	@FindBy (xpath="//*[@id='id_username']")static WebElement user;
	@FindBy (xpath="//*[@id='id_password']")static WebElement pwd;
	@FindBy (xpath="//*[@value='Login']")WebElement login_button;
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alert;
	@FindBy (xpath="//a[@href='/register']")WebElement register;
		
	public void login_page() {
		
		driver=DriverFactory.getdriver();
		driver.get(loginURL);
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password) {
		
		user.clear();
		user.sendKeys(username);
		pwd.clear();
		pwd.sendKeys(password);

	//To check empty fields , we need to check "required" field is on an attribute  
	if (username.isBlank()) {
	JavascriptExecutor js_user = (JavascriptExecutor) driver;  
	boolean isRequired = (Boolean) js_user.executeScript("return arguments[0].required;",user);
	if(isRequired ) //if required is true for username
	{
	   Loggerload.info("Username is Required - Field is empty");
	}
	}
	else if (password.isBlank()) {
	JavascriptExecutor js_password = (JavascriptExecutor) driver;  
	boolean isRequired = (Boolean) js_password.executeScript("return arguments[0].required;",pwd);
	if(isRequired )//if required is  true for password
	{
	   Loggerload.info("Password is Required - Field is empty");
	}
	}
			
	}

	//input fields empty -click login 
	public void login_button() {
			
			login_button.click();
					
		}
		
	//login for excel sheet data
	public String click_login() {
		
		login_button.click();
		String msg= alert.getText();
		return msg;
	}
	
	
	public void register_link() {
		
		register.click();
	}

	public String register_page() {
		
		String Title=driver.getTitle();
		return Title;
	}

	
}
