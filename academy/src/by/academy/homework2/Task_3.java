package by.academy.homework2;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String firstWord = scan.nextLine();

		if (firstWord.length() % 2 != 0) {
			System.out.println("Введённое слово должно быть из чётного количества букв!");
			return;
		}

		System.out.println("Введите второе слово: ");

		String secondWord = scan.nextLine();

		if (secondWord.length() % 2 != 0) {
			System.out.println("Введённое слово должно быть из чётного количества букв!");
			return;
		}

		StringBuilder word1 = new StringBuilder(firstWord.substring(0, firstWord.length() / 2));
		StringBuilder word2 = new StringBuilder(secondWord.substring(secondWord.length() / 2, secondWord.length()));
		StringBuilder finalWord = new StringBuilder();
		finalWord = word1.append(word2);
		System.out.println(finalWord.toString());

	}

}
