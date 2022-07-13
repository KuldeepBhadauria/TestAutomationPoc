package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsProductPage {
	
	WebdriverComponents webdriverComponents = new WebdriverComponents();
	
	private By backToProductsLnk  = By.id("back-to-products");
	
	public void addProductToCartFromProductPage(String productName) {
		By productAddToCartBtn = By.xpath("//button[@id='add-to-cart-" + productName + "']");
		webdriverComponents.clickWebElement(productAddToCartBtn);
	}
	
	public void navigateBackToSearchResultsPageFromBackToProductsLnk() {
		webdriverComponents.clickWebElement(backToProductsLnk);
	}

}
