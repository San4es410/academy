package by.academy.homework2;

import java.util.Scanner;

public class Task_2 {

	public static int getNumberDifChars(String word) { // метод выводит количество разных символов в слове
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) != word.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}

	public static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите целое число: ");

		if (scan.hasNextInt()) {
			n = scan.nextInt();
		} else {
			System.out.println("Вы ввели не целое число");
			return;
		}

		String[] words = new String[n];
		String s = scan.nextLine();

		for (int i = 0; i < words.length; i++) {
			System.out.print("Введите строку: ");
			words[i] = scan.nextLine();
		}

		int[] numberDifChars = new int[n];

		for (int i = 0; i < numberDifChars.length; i++) {
			numberDifChars[i] = getNumberDifChars(words[i]);
		}

		int index = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (numberDifChars[i] < numberDifChars[j]) {
					index = i;
				}
			}
		}

		System.out.println(words[index]);
		scan.close();

	}
}
