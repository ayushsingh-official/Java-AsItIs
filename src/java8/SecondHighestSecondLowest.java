package java8;

import java.util.Arrays;
import java.util.List;

public class SecondHighestSecondLowest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);

		// second highest
		List<Integer> highest = list.stream().skip(1).limit(1).toList();
		System.out.println(highest);

		// second lowest
		List<Integer> lowest = list.stream().limit(list.size() - 1).skip(list.size() - 2).toList();
		System.out.println(lowest);

	}

}
