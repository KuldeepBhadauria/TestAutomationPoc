package com.poc.test.automation.steps;

import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.pages.SwagLabsBillingAddressPage;
import io.cucumber.java.en.When;

public class SwagLabsBillingAddressPageSteps {

	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsBillingAddressPage swagLabsBillingAddressPage = new SwagLabsBillingAddressPage();
	
	
	@When("^User enters billing information$")
	public void enterBillingInformation() {
		swagLabsBillingAddressPage.enterFirstName(configProvider.getProperty("billing.address.first.name"));
		swagLabsBillingAddressPage.enterLastName(configProvider.getProperty("billing.address.last.name"));
		swagLabsBillingAddressPage.enterPostalCode(configProvider.getProperty("billing.address.postal.code"));
	}
	
	@When("^User navigates to payment summary page$")
	public void navigateToPaymentInfoPage() {
		swagLabsBillingAddressPage.navigateToPaymentInformationPage();
	}


}
