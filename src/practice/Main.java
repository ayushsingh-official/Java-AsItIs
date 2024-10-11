package practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 150; i++) {
			list.add(i);

		}

		int size = list.size();
		int count = 0;

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		if (size > 100) {

			while (count < 100) {

				list2.add(list.get(count));
				count++;

			}

		} else {
			System.out.println(list);
		}

		System.out.println("size : " + list2.size());

		System.out.println(list2);

	}

}
