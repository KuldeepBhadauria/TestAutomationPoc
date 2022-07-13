package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsShoppingCartPage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
	private By checkoutBtn = By.id("checkout");
	private By productNameInCart = By.xpath("//div[@class='inventory_item_name']");
	
	
	public void checkoutAndNavigateToBillingPage() {
		webdriverComponents.clickWebElement(checkoutBtn);
	}
	
	public int getCountOfProductsInCart() {
		int countOfItemsInCart = webdriverComponents.getElementCount(productNameInCart);
		return countOfItemsInCart;
	}	

}
