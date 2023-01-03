package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructure;
import utilities.ConfigReader;
import utilities.Loggerload;

public class DataStructure_SD {
	DataStructure dspage = new DataStructure();
	String Excelpath = ConfigReader.getexcelfilepath();
	static String expectedMsg;

	// @TS_DS_02
	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		dspage.getStarted_DS();
	}

	@Then("The user be directed to {string} page")
	public void the_user_be_directed_to_page(String pgname) {
		Loggerload.info("User redirected to " + pgname + " Page ");
		String Title = dspage.getPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, pgname, "Title do not match");
	}

	// @TS_DS_03
	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		dspage.clickOnTimeComplexitylink();
	}

	// @TS_DS_04
	// @TS_DS_05
	// @TS_DS_06

}
