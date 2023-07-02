package com.qa.stepDefinition;

import org.openqa.selenium.By;

import com.qa.pages.ProductDetailsPage;

import io.cucumber.java.en.And;

public class ProductDeatilsSteps {
	
	By cartbutton1 = By.xpath("//div[@class='a-button-stack']//input[@id='add-to-cart-button']");
	
	private ProductDetailsPage pd = new ProductDetailsPage();
	
	@And("Add the product to cart")
	public void Add_the_product_to_cart() {
		
		pd.clicktocart(cartbutton1);
		
	}

}
