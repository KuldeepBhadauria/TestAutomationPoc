package com.poc.test.automation.steps;

import org.junit.Assert;
import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.pages.SwagLabsPaymentInformationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsPaymentInformationPageSteps {
	
	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsPaymentInformationPage swagLabsPaymentInformationPage = new SwagLabsPaymentInformationPage();
	
	
	@Then("^User validates card used for payment ends with (.*)$")
	public void validateCardInformation(String cardNumberLastDigits) {
		String expectedCardNumber = cardNumberLastDigits;
		String actualCardNumber = swagLabsPaymentInformationPage.getCardNumberTxt();
		Assert.assertEquals("Mismatch in card Number Used For Payment, Expected card number should end with: " + expectedCardNumber + " while actual card number ends with: " + actualCardNumber ,
				expectedCardNumber, actualCardNumber);
	}
	
	@When("^User navigates to order confirmation page$")
	public void navigateToOrderConfirmationPage() {
		swagLabsPaymentInformationPage.navigateToOrderConfirmationPage();
	}


}
