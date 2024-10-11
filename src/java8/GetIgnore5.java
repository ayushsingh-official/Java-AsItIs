package java8;

import java.util.Arrays;
import java.util.List;

public class GetIgnore5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 3, 7, 9, 2, 5, 9, 1, 5);

		// first 5
		List<Integer> stream = list.stream().limit(5).toList();
		System.out.println(stream);

		// last 5
		List<Integer> last5 = list.stream().skip(5).toList();
		System.out.println(last5);

	}

}
