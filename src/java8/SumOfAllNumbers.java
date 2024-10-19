package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfAllNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);
		int sum = 0;

		// method 1
		sum = list.stream().mapToInt(i -> i).sum();

		// method 2
		sum = list.stream().reduce((a, b) -> a + b).get();

		System.out.println(sum);

		Integer key = 1;
		Integer value = 5;

		// wrong
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(a -> key + 1, b -> value + 1));

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}

	}

}
