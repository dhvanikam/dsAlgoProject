package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.DriverFactory;
import utilities.Loggerload;

public class SigninPage {

	public  static WebDriver driver;
	
	@FindBy (xpath="//*[@id='id_username']")WebElement user;
	@FindBy (xpath="//*[@id='id_password']")WebElement pwd;
	@FindBy (xpath="//*[@value='Login']")WebElement login_button;
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alert;
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	@FindBy (xpath="//input[@type='hidden']")WebElement hidden;
	
	public void login_page() {
		
		driver=DriverFactory.getdriver();
		driver.get("https://dsportalapp.herokuapp.com/login");
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String username, String password) {
		
		user.clear();
		user.sendKeys(username);
		pwd.clear();
		pwd.sendKeys(password);
	}

	public void click_login() {
		
		login_button.click();
		String msg= alert.getText();
		Loggerload.warn(msg);
	}
	
	//invalid login inputs
	public void login() throws InterruptedException {
		login_button.click();
		Thread.sleep(1000);
		String msg= hidden.getText();
		Loggerload.warn(msg);
	}


	public void register_link() {
		
		register.click();
	}

	public String register_page() {
		
		String Title=driver.getTitle();
		return Title;
	}

	
}
