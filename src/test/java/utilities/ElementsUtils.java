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
import utilities.ConfigReader;

public class ElementsUtils {
	public static WebDriver driver=DriverFactory.getdriver();;
	String Excelpath=ConfigReader.getexcelfilepath();
	String code;
	String result;
	public void clickElement(WebElement element) {
		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		if (ele.isDisplayed() && ele.isEnabled()) {

			ele.click();

		}
		Loggerload.error("Element is not clickable");
	}

	public String getElementText(WebElement element) {
		WebElement textElement = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOf(element));
		return textElement.getText();
	}

	public boolean verifyElementText(String expectedMsg, WebElement element) {
		if (getElementText(element).equals(expectedMsg)) {
			return true;
		}

		return false;
	}

	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();		   
		List <Map<String,String>> testdata= reader.getData(Excelpath,sheetname);
		Loggerload.info("sheetname is " + sheetname);
		Loggerload.info("rownumber is " + rownumber);
		code=testdata.get(rownumber).get("pythonCode");
		result=testdata.get(rownumber).get("Result");
		Loggerload.info("code is " + code);
		return code;
	}

	public void enterCode(String code, WebElement element) {
		new Actions(driver).sendKeys(element, code).perform();
	}
	

	public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();		   
		List <Map<String,String>> testdata= reader.getData(Excelpath,sheetname);
		result=testdata.get(rownumber).get("Result");
		Loggerload.info("result is " + result);
		return result;
	}
}
