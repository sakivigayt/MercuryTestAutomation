package com.Sakiv.TestCases;

import org.testng.annotations.Test;

import com.Sakiv.Pages.ReservationPage;

public class ReservationTest {

	@Test
	public void bookReservation() {
		ReservationPage rp = new ReservationPage();
		rp.selectPreferences();
		rp.selectFlightDetails();
		rp.submitDetails();
		rp.signOff();
	}
}
