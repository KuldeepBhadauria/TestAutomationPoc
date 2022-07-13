package com.poc.test.automation.steps;

import org.junit.Assert;
import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.pages.SwagLabsOrderConfirmationPage;
import io.cucumber.java.en.Then;

public class SwagLabsOrderConfirmationPageSteps {
	
	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsOrderConfirmationPage swagLabsOrderConfirmationPage = new SwagLabsOrderConfirmationPage();
	
	
	@Then("^User validates Thank You For Your Order message is displayed$")
	public void validateThankYouMessage() {
		String expectedMessage = configProvider.getProperty("order.summary.thank.you.message");
		String actualMessage = swagLabsOrderConfirmationPage.getOrderConfirmationTxt();
		Assert.assertTrue("Thank You For Your Order Message not displayed as expected: " +  expectedMessage+ " while actual message displayed is: " + actualMessage ,
				expectedMessage.equalsIgnoreCase(actualMessage));
	}
	
	@Then("^User validates Order Dispatched message is displayed$")
	public void validateOrderDispatchMessage() {
		String expectedMessage = configProvider.getProperty("order.summary.dispatch.message");
		String actualMessage = swagLabsOrderConfirmationPage.getOrderDispatchTxt();
		Assert.assertTrue("Order Dispatch Message not displayed as expected: " +  expectedMessage+ " while actual message displayed is: " + actualMessage ,
				expectedMessage.equalsIgnoreCase(actualMessage));
	}

}
