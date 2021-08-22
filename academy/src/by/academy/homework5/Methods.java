package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Methods {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(); // проверка task_1
//		list.add(1);
//		list.add(2);
//		list.add(6);
//		list.add(2);
//		list.add(4);
//		Set set = getUniqueList(list);
//		System.out.println(set.toString());
//
//		List<Integer> arrayList = new ArrayList<>(); // проверка task_2
//		List<Integer> linkedList = new LinkedList<>();
//
//		addElements(arrayList, linkedList);
//		getRandomElement(arrayList, linkedList);

		String text = "Я видел чудное мгновение, передо мною явилась ты"; // task_5
		StringBuffer buffer = new StringBuffer(text);

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 1;

		while (buffer.length() != 0) {
			for (int i = 1; i < buffer.length(); i++) {
				if ((buffer.charAt(0) == buffer.charAt(i))) {
					count++;
				}
			}
			map.put(buffer.charAt(0), count);
			remoreChar(buffer, buffer.charAt(0));
			count = 1;
		}

		System.out.println(map);

	}

	public static Set getUniqueList(Collection<?> list) { // task_1
		Set set = new HashSet(list);
		for (Object i : list) {
			set.add(i);
		}
		return set;
	}

	public static void addElements(List<Integer> arrayList, List<Integer> linkedList) { // task_2 метод первый
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			arrayList.add(i);
		}
		System.out.println(System.currentTimeMillis() - start);

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			linkedList.add(i);
		}
		System.out.println(System.currentTimeMillis() - start2);
	}

	public static void getRandomElement(List<Integer> arrayList, List<Integer> linkedList) { // task_2 метод второй
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			arrayList.get((int) (Math.random() * 1_000_000));
		}
		System.out.println(System.currentTimeMillis() - start);

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			linkedList.get((int) (Math.random() * 1_000_000));
		}
		System.out.println(System.currentTimeMillis() - start2);
	}

	public static void remoreChar(StringBuffer text, char ch) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				text.replace(i, i + 1, "");
			}
		}
	}

}
