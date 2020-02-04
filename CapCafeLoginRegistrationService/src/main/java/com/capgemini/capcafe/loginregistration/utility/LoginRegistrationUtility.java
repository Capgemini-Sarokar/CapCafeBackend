package com.capgemini.capcafe.loginregistration.utility;

import java.util.Calendar;

public class LoginRegistrationUtility {

	public static String calendarToString (Calendar someCalendarInstance) {
		return someCalendarInstance.get(Calendar.DATE) + "-" + 
				someCalendarInstance.get(Calendar.MONTH) + "-" + someCalendarInstance.get(Calendar.YEAR);
	}
	
}
