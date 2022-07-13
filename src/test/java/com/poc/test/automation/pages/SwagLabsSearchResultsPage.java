package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsSearchResultsPage {
	
	WebdriverComponents webdriverComponents = new WebdriverComponents();
	
	private By cartIcon = By.xpath("//div[@id='shopping_cart_container']//a[@class='shopping_cart_link']");
	
	
	public void navigateToProductPageForProduct(String productName) {
		By productNameLnk = By.xpath("//div[@class='inventory_item_name' and text()='" + productName + "']");
		webdriverComponents.clickWebElement(productNameLnk);
	}
	
	public void addProductToCartFromSearchResultPage(String productName) {
		By productAddToCartBtn = By.xpath("//button[@id='add-to-cart-" + productName + "']");
		webdriverComponents.clickWebElement(productAddToCartBtn);
	}
	
	public void navigateToCartFromSearchResultPage() {
		webdriverComponents.clickWebElement(cartIcon);
	}
	
	public boolean validateCartIconOnSearchResultPage( ) {
		return webdriverComponents.checkObjectExist(cartIcon);
	}
}
