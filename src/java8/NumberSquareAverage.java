package java8;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);
		double ans = 0;

		// method1
		ans = list.stream().map(a -> a * a).peek(a -> System.out.println("peek value : " + a)).reduce((a, b) -> (a + b))
				.map(a -> a / list.size()).get();

		System.out.println(ans);

		// method 2
		ans = list.stream().map(a -> a * a).mapToInt(i -> i).peek(a -> System.out.println("peek value : " + a))
				.average().getAsDouble();

		System.out.println(ans);

	}

}
