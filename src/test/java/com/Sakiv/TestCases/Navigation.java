package com.Sakiv.TestCases;

import org.testng.annotations.Test;

import com.Sakiv.Pages.HomePage;
import com.Sakiv.Pages.LoginPage;

public class Navigation extends BaseTest {

	@Test
	public void navigateToHomePage() {
		HomePage home = new HomePage();
		LoginPage login = home.launchApplication();
	}
}
