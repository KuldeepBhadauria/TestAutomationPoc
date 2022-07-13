package com.poc.test.automation.steps;

import org.junit.Assert;
import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.pages.SwagLabsShoppingCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsShoppingCartPageSteps {
	
	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsShoppingCartPage swagLabsShoppingCartPage = new SwagLabsShoppingCartPage();
	
	@Then("^User Validates (.*) products added to cart successfully$")
	public void validateCountOfProductsInCart(int expectedNumberOfProducts) {
	 int actualValue = swagLabsShoppingCartPage.getCountOfProductsInCart();
	 int expectedValue = expectedNumberOfProducts;
	 Assert.assertEquals("Mismatch in number of Products added to cart, Expected: " + expectedValue + " Actual: " + actualValue ,
			 expectedValue, actualValue);	
	}
	
	@When("^User proceeds to checkout and navigates to billing page$")
	public void navigateToBillingPage() {
		swagLabsShoppingCartPage.checkoutAndNavigateToBillingPage();
	}

}
