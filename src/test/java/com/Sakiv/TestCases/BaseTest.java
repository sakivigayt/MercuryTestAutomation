package com.Sakiv.TestCases;

import org.testng.annotations.AfterSuite;
import com.Sakiv.Pages.BasePage;

public class BaseTest extends BasePage {

	@AfterSuite
	public void tearDown() {
		BasePage.quitBrowser();
	}

}
