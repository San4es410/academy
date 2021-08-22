package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 10 + 1));
		}
		
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		int maxMark = 0;
		while (it.hasNext()) {
			if (maxMark < it.next()) {
				maxMark = it.next();
			}
		}
		System.out.println(maxMark);
	}

}
