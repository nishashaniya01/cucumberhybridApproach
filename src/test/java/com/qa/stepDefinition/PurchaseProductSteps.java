package com.qa.stepDefinition;

import org.openqa.selenium.By;

import com.qa.pages.PurchaseProduct;

import io.cucumber.java.en.And;

public class PurchaseProductSteps {

	private PurchaseProduct pp = new PurchaseProduct();

	By proceedToBuy = By.xpath("//input[@name='proceedToRetailCheckout']");

	@And("Proceed to buy the product")
	public void Proceed_to_buy_the_product() {

		pp.purchaseProduct(proceedToBuy);

	}
	
	

}
