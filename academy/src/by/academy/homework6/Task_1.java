package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		String path = "D:\\Files\\task1\\task.txt";
		File file = new File(path);
		file.getParentFile().mkdirs();
		
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try (FileWriter writer = new FileWriter(file, true); Scanner scanner = new Scanner(System.in)) {

			String string = scanner.nextLine();

			while (!string.equals("stop")) {
				writer.write(string);
				writer.append('\n');
				string = scanner.nextLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
