package com.Sakiv.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Sakiv.Utils.ExcelReader;

public class BasePage {
	public static WebDriver driver;
	public static Menu menu;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties OR = new Properties();
	public static Properties config = new Properties();
	public static FileInputStream fisConfig;
	public static FileInputStream fisOR;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\Data\\Data.xlsx");

	public BasePage() {

		try {
			if (fisConfig == null) {
				fisConfig = new FileInputStream(
						System.getProperty("user.dir") + ("\\src\\test\\resources\\Properties\\Config.properties"));
				config.load(fisConfig);
				log.debug("Config File Loaded");
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.debug("Unable to load Config File");
		}

		try {
			if (fisOR == null) {
				fisOR = new FileInputStream(
						System.getProperty("user.dir") + ("\\src\\test\\resources\\Properties\\OR.properties"));
				OR.load(fisOR);
				log.debug("OR File loaded");

			}
		} catch (IOException e) {
			log.debug("Unable to load OR File");
			e.printStackTrace();
		}
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\src\\test\\resources\\Executables\\chromedriver.exe"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			menu = new Menu(driver);
			log.debug("Chrome Driver Instantiated");
		}
	}

	public void navigateToPage(String PageUrl) {
		driver.get(PageUrl);
		log.debug("App Launched");
	}

	public void setValueinTextBox(String locator, String value) {
		driver.findElement(By.xpath(locator)).sendKeys(value);
		log.debug(value + " set in :" + locator);
	}

	public void clickButton(String locator) {
		driver.findElement(By.xpath(locator)).click();
		log.debug("button " + locator + "clicked");
	}

	public void selectValueFromDropDown(String locator, String value) {
		Select drpPassenger = new Select(driver.findElement(By.xpath(locator)));
		drpPassenger.selectByVisibleText(value);
		log.debug(value + " selected from " + locator + "drop down");
	}

	public void selectRadioButton(String locator) {
		driver.findElement(By.xpath(locator)).click();
		log.debug("radio button " + locator + "selected");
	}

	public void menuActions() {
		menu.doSignOff();
	}

	public static void quitBrowser() {
		driver.quit();
		log.debug("driver killed");
	}

}