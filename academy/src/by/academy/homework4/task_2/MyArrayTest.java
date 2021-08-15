package by.academy.homework4.task_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArray<Integer> array = new MyArray<Integer>();
		
		array.add(1);
		array.add(4);
		array.add(5);
		array.add(3);
		array.add(8);
		array.add(10);
		array.add(7);
		System.out.println(Arrays.toString(array.getArray()));
//		System.out.println(array.get(4));
//		System.out.println(array.getLast());
//		System.out.println(array.getFirst());
//		System.out.println(array.getSize());
//		System.out.println(array.getlastIndex());
//		array.removeIndex(4);
//		System.out.println(Arrays.toString(array.getArray()));
//		array.removeObject(4);
//		System.out.println(Arrays.toString(array.getArray()));
		
		MyIterator<Integer> iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
