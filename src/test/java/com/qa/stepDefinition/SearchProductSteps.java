package com.qa.stepDefinition;

import com.qa.pages.SearchProduct;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SearchProductSteps {

	private SearchProduct sp = new SearchProduct();

	@And("^Search plants pot \"(.*)\" from search bar$")
	public void Search_plants_pot_product_from_search_bar(String productName) throws InterruptedException {

		sp.searchProduct(productName);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.searchedProductSuggestionList();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sp.clickItemFromSuggestionList();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.findallproducts();
		Thread.sleep(100);
		sp.clickItemFromResultPage();
		Thread.sleep(400);
		
		
	}

}
