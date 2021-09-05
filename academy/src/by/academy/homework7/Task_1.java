package by.academy.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Task_1 {

	public static void main(String[] args) {

		List<Long> list = new Random().longs(100, 0, 101)
				.boxed()
				.collect(Collectors.toList());

		List<Integer> intList = list.stream()
				.mapToInt(Long::intValue)
				.boxed().collect(Collectors.toList());

		Stream<Double> stream = intList.stream()
				.map(i -> i * Math.PI - 20)
				.filter(i -> i < 100)
				.distinct()
				.sorted()
				.skip(3);

		Map<Double, String> map = stream.collect(Collectors.toMap(i1 -> i1, i2 -> "Number: " + i2));
		
		System.out.println(map);
	}

}
