package by.academy.homework4.task_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	static Pattern pattern = Pattern.compile("^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-(\\d\\d\\d\\d)$");

	public static boolean validate(String date) {
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}

}
