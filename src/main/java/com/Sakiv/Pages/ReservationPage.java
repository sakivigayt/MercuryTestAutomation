package com.Sakiv.Pages;

public class ReservationPage extends BasePage {
	public void selectFlightDetails() {

		selectRadioButton(OR.getProperty("TripType"));
		selectValueFromDropDown(OR.getProperty("PassCount"), "1");
		selectValueFromDropDown(OR.getProperty("FromPass"), "Zurich");
		selectValueFromDropDown(OR.getProperty("FromMonth"), "May");
		selectValueFromDropDown(OR.getProperty("FromDay"), "5");
		selectValueFromDropDown(OR.getProperty("ToPass"), "Sydney");
		selectValueFromDropDown(OR.getProperty("ToMonth"), "June");
		selectValueFromDropDown(OR.getProperty("ToDay"), "9");
		log.debug("Flight Details Selected");
	}

	public void selectPreferences() {
		selectRadioButton(OR.getProperty("Pref"));
		log.debug("User Preference Selected");
	}

	public void submitDetails() {
		clickButton(OR.getProperty("SubmitDetails"));
		log.debug("Flight details submitted");
	}

	public void signOff() {
		menu.doSignOff();
	}
}
