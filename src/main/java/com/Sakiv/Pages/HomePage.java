package com.Sakiv.Pages;

public class HomePage extends BasePage {

	public LoginPage launchApplication() {
		String AppURL = OR.getProperty("AppURL");
		navigateToPage(AppURL);
		log.debug("Navigated to :" + AppURL);
		return new LoginPage();
	}
}