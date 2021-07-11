package by.academy.homework1;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int cost = scan.nextInt();
		int age = scan.nextInt();
		
		if (cost < 100) {
			System.out.println(cost * 0.95);
		}
		
		else if (cost >= 100 && cost < 200) {
			System.out.println(cost * 0.93);
		}
		
		else if (cost >= 200 && cost < 300) {
			if (age > 18) {
				System.out.println(cost * 0.84);
			}
			else {
				System.out.println(cost * 0.91);
			}
		}
		
		else if (cost >= 300 && cost < 400) {
			System.out.println(cost * 0.85);
		}
		
		else {
			System.out.println(cost * 0.8);
		}
		
		scan.close();

	}

}
