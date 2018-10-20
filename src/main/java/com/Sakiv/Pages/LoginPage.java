package com.Sakiv.Pages;

public class LoginPage extends BasePage {
	public ReservationPage doLogin(String uName, String password) {
		setValueinTextBox(OR.getProperty("UserName"), uName);
		setValueinTextBox(OR.getProperty("Password"), password);
		clickButton(OR.getProperty("Submit"));
		log.debug("Login successful");
		return new ReservationPage();
	}
}