package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.qa.factory.DriverFactory;

public class CheckoutPage {

	List<WebElement> countryDropdownList;

	By addNewAddress = By.id("add-new-address-popover-link");
	By countryDropdown = By.xpath("//span[@class='a-button-text a-declarative']");
	By fullname = By.id("address-ui-widgets-enterAddressFullName");
	By mobilenumber = By.id("address-ui-widgets-enterAddressPhoneNumber");
	By pincode = By.id("address-ui-widgets-enterAddressPostalCode");
	By housenumber = By.id("address-ui-widgets-enterAddressLine1");
	By landmark = By.id("address-ui-widgets-landmark");
	By town = By.id("address-ui-widgets-enterAddressCity");

	private WebDriver driver = DriverFactory.covertToWebdriver();

	public void proceedToCheckout() throws InterruptedException {

		driver.findElement(By.xpath("//span[@class='address-edit-link']")).click();
		Thread.sleep(200);
	}

	public void editAddress(String Fullname, String Mobilenumbr, String Pincode, String Housenumber, String Landmark,
			String Town, String State) {

		driver.findElement(fullname).sendKeys(Fullname);
		driver.findElement(mobilenumber).sendKeys(Mobilenumbr);
		driver.findElement(pincode).sendKeys(Pincode);
		driver.findElement(housenumber).sendKeys(Housenumber);
		driver.findElement(landmark).sendKeys(Landmark);
		driver.findElement(town).sendKeys(Town);
		List<WebElement> statelist = driver.findElements(RelativeLocator.with(countryDropdown).toRightOf(town));
		for (WebElement e : statelist) {

			String s = e.getText();
			if (s.equalsIgnoreCase("State")) {
				e.click();
			}

		}

	}
}
