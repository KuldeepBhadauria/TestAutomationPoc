package com.poc.test.automation.steps;

import org.junit.Assert;

import com.poc.test.automation.config.ConfigProvider;
import com.poc.test.automation.impl.AppAccess;
import com.poc.test.automation.pages.SwagLabsLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsLogInSteps {
	
	AppAccess appAccess = new AppAccess();
	ConfigProvider configProvider = new ConfigProvider();
	SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage();
	
	
	@Given("^User is on SwagLabs login page$")
	public void launchHomePage() {
		appAccess.launchApplication(configProvider.getProperty("swaglabs.homepage.url"));			   
	}
	
	@When("^User enters username as (.*) and password as (.*)$")
	public void enterUsernameAndPassword(String username, String Password) {
		swagLabsLoginPage.enterUserName(username);
		swagLabsLoginPage.enterPassword(Password);
	}
	
	@When("^User logs in to the application$")
	public void loginToApplication() {
		swagLabsLoginPage.login();
		
	}
	
	@Then("^User validates error message displayed is (.*)$")
	public void validateLoginErrorMessage(String errMsg) {
		String expectedMessage = errMsg;
		String actualMessage = swagLabsLoginPage.getLoginErrorMessage();
		Assert.assertTrue("Expected Error Message is: " +  expectedMessage+ " while actual message displayed is: " + actualMessage ,
				actualMessage.contains(expectedMessage));
		
	}

}
