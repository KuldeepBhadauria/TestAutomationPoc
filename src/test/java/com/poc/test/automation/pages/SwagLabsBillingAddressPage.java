package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsBillingAddressPage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By firstnameTxtBox = By.xpath("//input[@data-test='firstName']");
    private By lastNameTxtBox = By.xpath("//input[@data-test='lastName']");
    private By postalCodeTxtBox = By.xpath("//input[@id='postal-code']");
    private By continueBtn = By.xpath("//input[@id='continue']");
	

	public void enterFirstName(String firstName) {
		webdriverComponents.enterValue(firstnameTxtBox, firstName);		
	}
	
	public void enterLastName(String lastName) {
		webdriverComponents.enterValue(lastNameTxtBox, lastName);		
	}
	
	public void enterPostalCode(String postalCode) {
		webdriverComponents.enterValue(postalCodeTxtBox, postalCode);		
	}
	
	public void navigateToPaymentInformationPage() {
		webdriverComponents.clickWebElement(continueBtn);
	}
	

}
