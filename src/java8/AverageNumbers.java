package java8;

import java.util.Arrays;
import java.util.List;

public class AverageNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);
		double average = 0;

		// method 1
		average = list.stream().mapToDouble(i -> i).average().getAsDouble();
		System.out.println(average);


		// method 2
		average = list.stream().mapToInt(i -> i).average().getAsDouble();
		System.out.println(average);


		// method 3  
		average = list.stream().reduce((a, b) -> (a + b)).map(a -> a/list.size()).get();   
		System.out.println(average);

	}

}
