package by.academy.homework1;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}

	}

}
