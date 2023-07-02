package com.qa.stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPageHybrid;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageHybirdSteps {

	private LoginPageHybrid lph = new LoginPageHybrid(DriverFactory.covertToWebdriver());
	private WebDriver driver = DriverFactory.covertToWebdriver();

	@Given("user is on homepage")
	public void user_is_on_homepage() {

		driver.get("https://www.amazon.in/");

	}

	@When("user hover to Sign-In option")
	public void user_hover_to_sign_in_option() throws InterruptedException {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(lph.signinButtonHover)).perform();
//		driver.findElement(lph.emailormobTextField).sendKeys("9634517163");
//		driver.findElement(lph.continueButton).click();
//		driver.findElement(lph.password).sendKeys("Shaniya@2023");
//		driver.findElement(lph.rememberMeCheckbox).click();
//		driver.findElement(lph.buttonSignin).click();
//		try {
//			Thread.sleep(250);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@When("User opens side menu and clicks to Hello signin title")
	public void User_opens_side_menu_and_clicks_to_Hello_signin_title() {

		System.out.println("hey its second scenario");
		driver.findElement(By.xpath("//a[@id = 'nav-hamburger-menu']")).click();
		driver.findElement(By.id("hmenu-customer-profile")).click();

	}

	@And("click to button")
	public void click_to_button() {

		driver.findElement(lph.signButton).click();
	}

	@And("enters the {string}")
	public void enters_the_(String mobileNumber) {

		driver.findElement(lph.emailormobTextField).sendKeys(mobileNumber);

	}

	@And("clicks to Sign-In button")
	public void clicks_to_sign_in_button() {

		driver.findElement(lph.continueButton).click();
	}

	@And("enter the {string}")
	public void enters_the_password(String password) {

		driver.findElement(lph.password).sendKeys(password);

	}

	@And("ticks the terms&condition option")
	public void ticks_the_terms_condition_option() {
		driver.findElement(lph.rememberMeCheckbox).click();

	}

	@And("clicks the final sign-in button")
	public void clicks_the_final_sign_in_button() {
		driver.findElement(lph.buttonSignin).click();
	}

	@Then("user should land to homepage")
	public void user_should_land_to_homepage() {
		// Write code here that turns the phrase above into concrete actions
	}

	/* =========== Mapping Scenario 2======================== */

}
