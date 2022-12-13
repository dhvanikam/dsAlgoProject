package stepDefinition;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Currency_SD {

	public WebDriver driver=DriverFactory.getdriver();
	private HomePage homepage = new HomePage();
	private static ConfigReader configreader=new ConfigReader();
	
	
	@Given("is product home page")
	public void is_product_home_page() throws Throwable {
		configreader.loadConfig();
		DriverFactory.getdriver().get(configreader.getApplicationUrl());	
		Loggerload.info("user is on product home page");
	}

	@When("user click on select currency and set currency to EUR")
	public void user_click_on_select_currency_and_set_currency_to_eur() {
		homepage.setCurrency();
	}

	@Then("currency should set to EUR")
	public void currency_is_set_to_eur() {
		homepage.verifyCurrency();
	}

}
