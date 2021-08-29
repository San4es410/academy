package by.academy.homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task_4 {

	public static void main(String[] args) {
		String path = "D:\\Files\\task4";
		File fileIn = new File("D:\\Files\\task2\\task.txt");
		File result = new File("D:\\Files\\task4\\result.txt");

		for (int i = 1; i <= 100; i++) {
			String pathEnd = path + "\\" + i + ".txt";
			File fileOut = new File(pathEnd);
			fileOut.getParentFile().mkdirs();
			try {
				fileOut.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try (FileReader input = new FileReader(fileIn);
					FileWriter output = new FileWriter(fileOut);
					) {

				char[] chars = new char[(int) fileIn.length()];
				int numberChars = input.read(chars, 0, (int) fileIn.length());
				int randomNumber = new Random().nextInt((int) fileIn.length());
				System.out.println(randomNumber);
				output.write(chars, 0, randomNumber);
				

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try (FileWriter resultWriter = new FileWriter(result, true)){
				resultWriter.write(i + ".txt" + " - " + fileOut.length() + " байтов");
				resultWriter.append('\n');
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}

}
