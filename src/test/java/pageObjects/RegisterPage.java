package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.ConfigReader;
import utilities.Loggerload;

public class RegisterPage {
	public static WebDriver driver=DriverFactory.getdriver();
	String registerPageURL=ConfigReader.registerPageURL();
		
	@FindBy (xpath="//form/input[@type='submit']")WebElement registerButton;
	@FindBy (xpath="//*[@id='id_username']") WebElement user;
	@FindBy (xpath="//*[@id='id_password1']") WebElement pwd;
	@FindBy (xpath="//*[@id='id_password2']") WebElement confirmpwd;
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement errorMsg;
	

	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}

	public void navigatetoRegisterPage() {
		driver.get(registerPageURL);

	}

	public void clickOnRegisterButton() {
		Loggerload.info("The user clicks on Register button");
		registerButton.click();
	}

	public Boolean getEmptyRequiredUser() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (user.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);
		}
		return isRequired;
	}

	public Boolean getEmptyRequiredPswd() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (pwd.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", pwd);
		}
		return isRequired;
	}

	public Boolean getEmptyRequiredCofmPswd() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (confirmpwd.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", confirmpwd);
		}
		return isRequired;
	}

	public String getEmptyfieldErrormsgUser() {
		return user.getAttribute("validationMessage");
	}

	public String getEmptyfieldErrormsgPswd() {
		return pwd.getAttribute("validationMessage");
	}

	public String getEmptyfieldErrormsgCofmPswd() {
		return confirmpwd.getAttribute("validationMessage");
	}

	public void enterUsername(String username) {
		user.clear();
		user.sendKeys(username);

	}

	public void enterPassword(String password) {
		pwd.clear();
		pwd.sendKeys(password);

	}

	public String getErrormsg() {
		String msg = null;
		try {
			msg = errorMsg.getText();
		} catch (NoSuchElementException e) {
			Loggerload.info("No such element");
		}
		return msg;

	}

	public void enterCofmPassword(String cpassword) {
		confirmpwd.clear();
		confirmpwd.sendKeys(cpassword);

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void entervalidUsername(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String userName = form.get("username");
			Loggerload.info("The user enter username as : " + userName);
			user.sendKeys(userName);
		}

	}

	public void entervalidPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String passwd = form.get("password");
			Loggerload.info("The user enter password as : " + passwd);
			pwd.sendKeys(passwd);

		}

	}

	public void entervalidConfmPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String cpasswd = form.get("password confirmation");
			Loggerload.info("The user enter confirm password as : " + cpasswd);
			confirmpwd.sendKeys(cpasswd);

		}

	}
}