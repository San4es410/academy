package by.academy.homework5;

import java.util.Iterator;

public class MyIteratorDemo<T> implements Iterator<T> {
	private T[][] array;
	private int index1;
	private int index2 = -1;

	public MyIteratorDemo(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (++index2 < array[index1].length) {
			return true;
		} else {
			index1++;
			index2 = 0;
		}
		if (index1 < array.length) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		return array[index1][index2];
	}

	public static void main(String... args) {
		Integer[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		MyIteratorDemo<Integer> it = new MyIteratorDemo<>(array);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
