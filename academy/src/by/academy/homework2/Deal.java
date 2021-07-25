package by.academy.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		int numberPlayers = 0;
		String[] suits = { "Черви", "Бубны", "Пики", "Трефы" };
		String[] rating = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		int numberCards = suits.length * rating.length + 2;

		String[] deck = new String[numberCards]; // создаём колоду

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < rating.length; j++) {
				deck[rating.length * i + j] = suits[i] + rating[j];
			}
		}

		deck[52] = "RJ"; // добавляем джокеров
		deck[53] = "BJ";

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число игроков: ");

		if (scan.hasNextInt()) {
			numberPlayers = scan.nextInt();
			if (numberPlayers * 5 >= numberCards) {
				System.out.println("Число игроков слишком большое!");
				return;
			} else if (numberPlayers < 0) {
				System.out.println("Число игроков не может быть отрицательным числом!");
				return;
			} else if (numberPlayers == 0) {
				System.out.println("Никто не хочет играть(");
				return;
			}
		} else {
			System.out.println("Количество игроков должно быть целым числом!");
			return;
		}

		ArrayList<String> randonDeck = new ArrayList<String>(); // шафлим колоду
		for (int i = 0; i < deck.length; i++) {
			randonDeck.add(i, deck[i]);
		}
		Collections.shuffle(randonDeck);

		for (int i = 0; i < numberPlayers; i++) { // сдаём карты
			for (int j = 0; j < 5; j++) {
				System.out.print(randonDeck.get(5 * i + j) + " ");
			}
			System.out.println();
			System.out.println();
		}
		scan.close();
	}

}
