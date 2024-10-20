package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import practice.Employee;

public class EmployeeObjectManipulation {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		createEmployee(list);

		// List of Employee to Map (Key - Value)
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap((employee) -> employee.age, (employee) -> employee.name));

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}

		// Max/Min age sort Employee.
		list.stream().sorted((b, a) -> Integer.compare(b.getAge(), a.age))
				.peek(value -> System.out.println("Sorted Name : " + value.getName())).toList()
				.forEach(ans -> System.out.println("Final Answer : " + ans.getName()));
		;

//		System.out.println("min : " + sortedListReverse.get(0).getName());
//		System.out.println("max : " + sortedListReverse.get(sortedListReverse.size() - 1).getName());

	}

	private static List<Employee> createEmployee(List<Employee> list) {

		Employee e1 = new Employee(10, "ram");
		Employee e2 = new Employee(20, "Shyam");
		Employee e3 = new Employee(30, "Mohan");
		Employee e4 = new Employee(40, "Hero");
		Employee e5 = new Employee(50, "Heroine");

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		return list;

	}

}
