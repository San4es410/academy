package by.academy.homework4.task_2;

import java.util.Arrays;

public class MyArray<T>{
	private T[] array;
	private int size;
	private int index = -1;
	public MyIterator<T> iterator;

	public MyArray(int size) {
		super();
		array = (T[]) new Object[size];
	}

	public MyArray() {
		super();
		array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public void add(T object) {
		if (size >= array.length) {
			T[] newArray = Arrays.copyOf(array, array.length * 2 + 1);
			array = newArray;
		}
		array[size++] = object;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			System.out.println("index out of bounds");
			return null;
		}
		return array[index];
	}

	public T getLast() {
		return array[size - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public int getLength() {
		return size;
	}

	public int getlastIndex() {
		return size - 1;
	}

	public void removeIndex(int index) {
		if (index < 0 || index >= size) {
			System.out.println("index out of bounds");
			return;
		}
		System.arraycopy(array, index + 1, array, index, size - index - 1);
		size--;
	}

	public void removeObject(T obj) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(obj)) {
				System.arraycopy(array, i + 1, array, i, size - i - 1);
				size--;
			}
		}
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(array);
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArray other = (MyArray) obj;
		if (!Arrays.deepEquals(array, other.array))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyArray [array=");
		builder.append(Arrays.toString(array));
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

	public MyIterator<T> iterator() {
		MyIterator<T> it = new MyIterator<>() {

			@Override
			public T next() {
				return array[index];
			}

			@Override
			public boolean hasNext() {
				return ++index < size;
			}

			@Override
			public void remove() {
				removeIndex(index);

			}
		};
		return it;

	}

}
