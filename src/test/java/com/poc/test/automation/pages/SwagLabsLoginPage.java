package com.poc.test.automation.pages;

import org.openqa.selenium.By;
import com.poc.test.automation.utils.WebdriverComponents;

public class SwagLabsLoginPage {
	
    WebdriverComponents webdriverComponents = new WebdriverComponents();
	
    private By usernameTxtBox = By.xpath("//input[@data-test='username']");
    private By passwordTxtBox = By.id("password");
    private By logInBtn = By.xpath("//input[@id='login-button']");
    private By loginErrorMsgTxt = By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']");
	

	public void enterUserName(String username) {
		webdriverComponents.enterValue(usernameTxtBox, username);		
	}
	
	public void enterPassword(String password) {
		webdriverComponents.enterValue(passwordTxtBox, password);		
	}
	
	public void login() {
		webdriverComponents.clickWebElement(logInBtn);	
	}
	
	public String getLoginErrorMessage() {
		String errorMessage = webdriverComponents.getText(loginErrorMsgTxt);
		return errorMessage.trim();
	}

}
