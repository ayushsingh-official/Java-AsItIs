package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);

		List<Integer> stream = list.stream().sorted(Collections.reverseOrder()).toList();
		
		System.out.println(stream);

	}

}
