package com.Sakiv.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {

	WebDriver driver;

	public Menu(WebDriver driver) {
		this.driver = driver;
	}

	public void doSignOff() {
		driver.findElement(By.xpath(BasePage.OR.getProperty("SignOff"))).click();
	}
}