package appHooks;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.Loggerload;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	private static ConfigReader configreader;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		configreader = new ConfigReader();
		Loggerload.info("Loading Config file");
		configreader.loadConfig();
		String browser = configreader.getBrowserType();
		
		//Initialize driver from driver factory
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);
		Loggerload.info("Initializing driver for : "+browser);
	}

	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}

	@AfterAll
	public static void after() {
		Loggerload.info("Closing Driver");
		driverfactory.closeallDriver();
	}
}
