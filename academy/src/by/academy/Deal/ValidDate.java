package by.academy.Deal;

import java.util.regex.Pattern;

public class ValidDate {
	public static String firstFormat = "(0?[1-9]|[12][0-9]|[3][01])-(0?[1-9]|[1-9][0-2])-(([12])\\d\\d";
	public static String secondFormat = "(0?[1-9]|[12][0-9]|[3][01])/(0?[1-9]|[1-9][0-2])/(([12])\\d\\d";

	public boolean isValidFirstFormat(String date) {
		return Pattern.matches(firstFormat, date);
	}

	public boolean isValidSecondFormat(String date) {
		return Pattern.matches(secondFormat, date);
	}
}
