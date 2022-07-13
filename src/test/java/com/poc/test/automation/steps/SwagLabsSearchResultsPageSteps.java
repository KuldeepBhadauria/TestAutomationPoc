package com.poc.test.automation.steps;

import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.pages.SwagLabsSearchResultsPage;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsSearchResultsPageSteps {

	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsSearchResultsPage swagLabsSearchResultsPage = new SwagLabsSearchResultsPage();
	
	@Then("^User is on search results page$")
	public void validateUserOnSearchPage() {
		Assert.assertTrue("User Not Landed on Search Results Page",
				swagLabsSearchResultsPage.validateCartIconOnSearchResultPage());

	}

	@When("^User navigates to product page for product \"(.*)\"$")
	public void naviagateToProductPage(String productName) {
		swagLabsSearchResultsPage.navigateToProductPageForProduct(productName);

	}
	
	@When("^User adds product \"(.*)\" to cart from search results page$")
	public void addProductToCartFromSearchPage(String productName) {
		swagLabsSearchResultsPage.addProductToCartFromSearchResultPage(productName);

	}
	
	
	@When("^User navigates to cart from search results page$")
	public void navigateToCartFromSearchPage() {
		swagLabsSearchResultsPage.navigateToCartFromSearchResultPage();

	}
}
