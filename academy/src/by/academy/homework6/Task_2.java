package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {

	public static void main(String[] args) {
		String pathIn = "D:\\Files\\task2\\task.txt";
		String pathOut = "D:\\Files\\task2\\result.txt";
		File file = new File(pathOut);

		file.getParentFile().mkdirs();

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileReader reader = new FileReader(pathIn);
				FileWriter writer = new FileWriter(pathOut);
				BufferedReader bufferReader = new BufferedReader(reader);
				BufferedWriter bufferWriter = new BufferedWriter(writer)) {

			while (bufferReader.ready()) {
				String line = bufferReader.readLine();
				String newLine = line.replaceAll("\\s+","");
				bufferWriter.write(newLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
