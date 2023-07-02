package com.qa.stepDefinition;

import com.qa.pages.CheckoutPage;

import io.cucumber.java.en.When;

public class CheckoutProductSteps {

	private CheckoutPage cp = new CheckoutPage();

	@When("User confirms delivery address, payment method and items delivery date")
	public void user_confirms_delivery_address_payment_method_and_items_delivery_date() throws InterruptedException {

		cp.proceedToCheckout();
		
	}

//	@When("Entering \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\" details")
//	public  void entering_details(String Fullname, String Mobilenumber, String Pincode, String Housenumber, String Landmark,
//			String Town, String state) {
//		
//		cp.editAddress(Fullname, Mobilenumber, Pincode, Housenumber, Landmark, Town, state);

	@When("Entering {string},{string},{string},{string},{string},{string},{string} details")
	public void entering_details(String Fullname, String Mobilenumber, String Pincode, String Housenumber,
			String Landmark, String Town, String state) {

		cp.editAddress(Fullname, Mobilenumber, Pincode, Housenumber, Landmark, Town, state);

	}

}
