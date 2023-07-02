package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class PurchaseProduct {

	private WebDriver driver = DriverFactory.covertToWebdriver();

	public void purchaseProduct(By e) {

		driver.findElement(e).click();

	}
}
