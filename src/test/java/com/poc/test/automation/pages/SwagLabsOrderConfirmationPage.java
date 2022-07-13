package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsOrderConfirmationPage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By thankYouForOrderTxt = By.xpath("//div[@id='checkout_complete_container']//h2[@class='complete-header']");
    private By orderDispatchAndArriveTxt = By.xpath("//div[@id='checkout_complete_container']//div[@class='complete-text']");
   

	public String getOrderConfirmationTxt() {
		String orderConfirmationTxt = webdriverComponents.getText(thankYouForOrderTxt).trim();
		return orderConfirmationTxt;
	}

	
	public String getOrderDispatchTxt() {
		String orderDispatchTxt = webdriverComponents.getText(orderDispatchAndArriveTxt).trim();
		return orderDispatchTxt;
	}
	
}
