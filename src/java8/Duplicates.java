package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);

		Set<Integer> set = new HashSet<>();
		List<Integer> stream = list.stream().filter(x -> !set.add(x)).toList();

		System.out.println(stream);

	}
}
