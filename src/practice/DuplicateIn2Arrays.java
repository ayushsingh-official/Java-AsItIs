package practice;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateIn2Arrays {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4, 5 };

		int[] a2 = { 2, 7, 8, 9, 3 };

		HashSet<Object> set1 = new HashSet<>(Arrays.asList(a1));

		HashSet<Object> set2 = new HashSet<>(Arrays.asList(a2));

		for (Object value : set2) {

//			System.out.println(a2[i]);

			if (set1.contains(value)) {
				
				System.out.println("true");

			}

		}

	}

}
