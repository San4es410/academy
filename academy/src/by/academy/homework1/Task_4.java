package by.academy.homework1;



public class Task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 2;
		int i = 0;
		
		while (number <= 1_000_000) {
			number = 2 << i;
			System.out.println(number);
			i++;
		}
		
		
			
		}

	

}
