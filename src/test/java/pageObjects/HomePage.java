package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverFactory.DriverFactory;


import utilities.Loggerload;

public class HomePage {
	WebDriver driver=DriverFactory.getdriver();

	By selectCurrency = By.xpath("//*[@class='btn btn-link dropdown-toggle']");
	By currencyEUR = By.xpath("//*[@name='EUR']");
	By currency = By.xpath("(//*[@id=\"content\"]//*[@class='caption']//span[contains(text(),'€')])[1]");
	By Item_CanonEOS5D = By.xpath("//*[@id='content']//a[text()='Canon EOS 5D']");
	By Item_iPhone = By.xpath("//*[@id='content']//a[text()='iPhone']");
	By Item_Mac = By.xpath("//*[@id='content']//a[text()='MacBook']");
	By quantityMac = By.id("input-quantity");
	By addToCart = By.id("button-cart");
	By successMsg1 = By.xpath("//div[@class='alert alert-success alert-dismissible']");

	public void navigatetoHomePage() {

		driver.navigate().to("http://tutorialsninja.com/demo/index.php");
	}

	public void setCurrency() {
		Loggerload.info("Step 1 : Select the currency in the left top corner to Euro");
		driver.findElement(selectCurrency).click();
		driver.findElement(currencyEUR).click();

	}

	public void verifyCurrency() {
		Loggerload.info("check currency set to Euro");
		String cur = driver.findElement(currency).getText();
		if (cur.contains("€")) {
			Loggerload.info(cur);
			Loggerload.info("Currency match");
			Assert.assertTrue(true, "Currency changed");
		} else
			Assert.assertTrue(false, "Currency not changed");
	}

	public void orderItemCanonEOS5D() {
		driver.findElement(Item_CanonEOS5D).click();
	}

	public void orderItemiPhone() {

		Loggerload.info("Click on iphone");
		driver.findElement(Item_iPhone).click();
	}

	public void selectItemMacBook() {
		driver.findElement(Item_Mac).click();
		Loggerload.info("Clicked on MacBook");
	}

	public void chkQuanMac() {

		WebElement quan = driver.findElement(quantityMac);
		if (quan.getAttribute("value").equals("1")) {
			Loggerload.info("Succes : Default quantity is " + quan.getAttribute("value"));
		} else {
			Loggerload.info("Error : Default quantity is " + quan.getAttribute("value"));
		}
	}

	public void addToCart() {
		driver.findElement(By.id("button-cart")).click();
		Loggerload.info("Added to cart");
	}

	public void successMsg() {
		WebElement successMsgEle = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(successMsg1));
		Loggerload.info(successMsgEle.getText());

	}

}
