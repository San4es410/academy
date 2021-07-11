package by.academy.homework1;

import java.io.IOException;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		
		switch (type) {
		case "int":
			int x = scan.nextInt();
			System.out.println(x % 2);
			break;
		case "double":
			double v = scan.nextDouble();
			System.out.println(v * 0.7);
			break;
		case "float":
			float y = scan.nextFloat();
			System.out.println(y * y);
			break;
		case "char":
			int z = System.in.read();
			System.out.println(z);
			break;
		case "String":
			String u = scan.nextLine();
			System.out.println("Hello " + u);
			break;
		default:
			System.out.println("Unsupported type");
		}
		scan.close();
		

	}

}
