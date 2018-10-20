package com.Sakiv.TestCases;

import java.util.Hashtable;
import org.testng.annotations.Test;
import com.Sakiv.Pages.LoginPage;
import com.Sakiv.Utils.TestUtils;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = TestUtils.class, dataProvider = "dp")
	public void loginToApplication(Hashtable<String, String> data) {
		LoginPage login = new LoginPage();
		login.doLogin(data.get("Uname"), data.get("Password"));

	}

	// Implement Chrome Preferences via Chrome Options
}
