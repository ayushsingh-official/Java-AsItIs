package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);

		List<Integer> ans = list.stream().filter(a -> a % 2 == 0).toList();
		
		System.out.println(ans);

	}

}
