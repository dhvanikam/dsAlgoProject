package utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.DriverFactory;

public class ElementsUtils {
	public static WebDriver driver = DriverFactory.getdriver();;
	String Excelpath = ConfigReader.getexcelfilepath();
	String code;
	String result;

	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));

	}

	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		code = testdata.get(rownumber).get("pythonCode");
		result = testdata.get(rownumber).get("Result");
		return code;
	}

	public void enterCode(String code, WebElement element) {

		new Actions(driver).sendKeys(element, code).perform();
	}

	public void enterCodePractice(String code, WebElement element) {
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
		/*
		 * element.sendKeys(code); element.sendKeys(str1[0]);
		 * element.sendKeys(Keys.ENTER); element.sendKeys(str1[1]);
		 * element.sendKeys(Keys.ENTER); element.sendKeys(Keys.BACK_SPACE);
		 * element.sendKeys(Keys.BACK_SPACE); element.sendKeys(str1[2]);
		 * element.sendKeys(Keys.ENTER); element.sendKeys(Keys.BACK_SPACE);
		 * element.sendKeys(Keys.BACK_SPACE); element.sendKeys(Keys.BACK_SPACE);
		 * element.sendKeys(Keys.BACK_SPACE); element.sendKeys(str1[3]);
		 * Loggerload.info("enterCodePractice is " + code);
		 */

	}

	public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		result = testdata.get(rownumber).get("Result");
		Loggerload.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
		return result;
	}
}
