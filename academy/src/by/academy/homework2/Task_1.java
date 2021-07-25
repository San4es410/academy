package by.academy.homework2;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString = scan.nextLine();
		String secondString = scan.nextLine();

		System.out.println(compare(firstString, secondString));
		scan.close();
	}

	public static boolean compare(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) {
			return false;
		}

		int count = 0;
		for (int i = 0; i < firstString.length(); i++) {
			count ^= firstString.charAt(i) ^ secondString.charAt(i);
		}
		return count == 0;

	}

}
