package com.gul.hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FindDayOfDate {
	public static void main(String[] args) {
		int month = 8;
		int day = 13;
		int year = 2017;
		String dayName = findDay(month, day, year);
		System.out.println(dayName);
	}

	public static String findDay(int month, int day, int year) {

		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayName = date.getDayOfWeek();
		int ss = dayName.getValue();
		System.out.println(ss);
		String name = "";
		switch (ss) {
		case 1:
			name = "Monday".toUpperCase();
			break;
		case 2:
			name = "Tuesday".toUpperCase();
			break;
		case 3:
			name = "Wednesday".toUpperCase();
			break;
		case 4:
			name = "Thursday".toUpperCase();
			break;
		case 5:
			name = "Friday".toUpperCase();
			break;
		case 6:
			name = "Saturday".toUpperCase();
			break;
		case 7:
			name = "Sunday".toUpperCase();
			break;
		default:
			break;
		}
		return name;
	}
}
