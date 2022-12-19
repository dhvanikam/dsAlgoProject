package driverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Loggerload;

public class DriverFactory {

	public static WebDriver driver;
	//public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

	public WebDriver initializeDrivers(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			Loggerload.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//threadDriver.set(driver);

		} else if (browser.equalsIgnoreCase("chrome")) {
			Loggerload.info("Testing on chrome");
			WebDriverManager.chromedriver().browserVersion("108.0.0").setup();
			driver = new ChromeDriver();
			//threadDriver.set(driver);

		} else if (browser.equalsIgnoreCase("safari")) {
			Loggerload.info("Testing on safari");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			//threadDriver.set(driver);

		} else if (browser.equalsIgnoreCase("edge")) {
			Loggerload.info("Testing on Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			//threadDriver.set(driver);
		}
		//Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		return getdriver();
	}

	public static synchronized WebDriver getdriver() {
		return driver;
				//threadDriver.get();
	}

	public void closeallDriver() {
		driver.close();
		//getdriver().close();
	}

}
