package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	private final String propertyFilePath = "./src/test/resources/config/config.properties";

	public void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getBrowserType() {
		String browser = properties.getProperty("browser");
		Loggerload.info("Get property BrowserType");
		System.out.println(browser);
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		Loggerload.info("Get property URL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

}
