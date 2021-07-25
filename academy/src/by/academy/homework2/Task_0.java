package by.academy.homework2;

import java.util.Scanner;

public class Task_0 {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					pairsCount++;
				}
			}
		}
		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];

		if (n < 2 || n > Math.pow(10, 5)) {
			System.out.println("Недопустимое значение n");
			return;
		}

		if (k <= 0 || k > Math.pow(10, 9)) {
			System.out.println("Недопустимое значение k");
			return;
		}

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("каждое значение массива arr[i] должно быть уникальным");
					return;
				}
			}
		}

		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();

	}
}
