package com.poc.test.automation.steps;

import com.poc.test.automation.pages.SwagLabsProductPage;
import io.cucumber.java.en.When;

public class SwagLabsProductPageSteps {
	
	SwagLabsProductPage swagLabsProductPage = new SwagLabsProductPage();

	@When("^User adds product \"(.*)\" to cart from product page$")
	public void addProductToCartFromProductPage(String productName) {
		swagLabsProductPage.addProductToCartFromProductPage(productName);

	}	
	
	@When("^User navigates back to search results page from product page$")
	public void navigateToSearchPageFromProductPage() {
		swagLabsProductPage.navigateBackToSearchResultsPageFromBackToProductsLnk();

	}

}
