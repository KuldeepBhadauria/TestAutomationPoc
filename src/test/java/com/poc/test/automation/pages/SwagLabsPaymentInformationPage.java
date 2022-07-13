package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsPaymentInformationPage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By cardNumberTxt = By.xpath("//div[text()='Payment Information:']//following-sibling::div[1]");
    private By finishBtn = By.id("finish");
   

	public String getCardNumberTxt() {
		String cardNumber = webdriverComponents.getText(cardNumberTxt);
		String cardNumberLastDigits = cardNumber.trim().substring(11);
		return cardNumberLastDigits;
		
	}
		
	public void navigateToOrderConfirmationPage() {
		webdriverComponents.clickWebElement(finishBtn);
		
	}		

}
