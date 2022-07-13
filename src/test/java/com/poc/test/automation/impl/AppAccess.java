package com.poc.test.automation.impl;

import static com.poc.test.automation.variables.DriverVariables.driverInstance;

public class AppAccess {
	
	public void launchApplication(String url) {
		openUrl(url);
	}
	
	public void openUrl(String webPageUrl) {
		driverInstance.get(webPageUrl);
	}

}
