package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

public class SearchProduct {

	private WebDriver driver = DriverFactory.covertToWebdriver();
	public List<WebElement> suggestionList, productNames;
	By searchSuggestion = By.xpath(
			"//div[@class='autocomplete-results-container']//div[@class='s-suggestion-container']/div[@class='s-suggestion s-suggestion-ellipsis-direction']");

	// Search the product from search bar(HomePage)
	public void searchProduct(String productName) {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
	}

	// Gets the dynamic suggestions displayed for the searched product in search bar
	public void searchedProductSuggestionList() {

		suggestionList = driver.findElements(searchSuggestion);
		System.out.println(suggestionList.size());

		for (WebElement e : suggestionList) {

			String s = e.getText();
			System.out.println("the suggestion displayed are :" + s);
		}

	}

	public void clickItemFromSuggestionList() {

		String suggestedproductname = suggestionList.get(3).getText();
		suggestionList.get(3).click();
		System.out.println(suggestedproductname);

	}

	public void findallproducts() {

		productNames = driver.findElements(By.xpath("//img[@class='s-image']"));
		System.out.println(productNames.size());

		for (WebElement e : productNames) {

			String s = e.getAttribute("alt");
			System.out.println(s);

		}

	}

	public void clickItemFromResultPage() {

			String name = productNames.get(6).getText();
			productNames.get(6).click();
		  
			System.out.println(name);
	}


}
