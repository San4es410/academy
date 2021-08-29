package by.academy.homework6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task_3 {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("Петя", "Петров", 34));
		list.add(new User("Иван", "Иванов", 20));
		list.add(new User("Маша", "Захаренко", 28));
		list.add(new User("Катя", "Быкова", 37));
		list.add(new User("Юра", "Зайцев", 17));
		list.add(new User("Валера", "Курагин", 45));
		list.add(new User("Лёша", "Лихачев", 36));
		list.add(new User("Настя", "Рыбкина", 56));
		list.add(new User("Костя", "Белый", 22));
		list.add(new User("Юля", "Сычёва", 39));

		for (User user : list) {
			writeInfo(user);

		}
	}

	public static void writeInfo(User user) {
		String path = "D:\\Files\\users\\" + user.getFirstName() + "_" + user.getSecondName() + ".txt";
		File file = new File(path);
		file.getParentFile().mkdirs();
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		try (FileOutputStream output = new FileOutputStream(file);
				ObjectOutputStream output1 = new ObjectOutputStream(output)) {
			output1.writeObject(user);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
