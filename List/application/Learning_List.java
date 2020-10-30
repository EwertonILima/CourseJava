package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Learning_List {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add("Pedro");
		list.add("Jose");
		
		System.out.println("List Size: " + list.size());
		System.out.println();
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-----------List Remove by Name: Pedro -------------");
		list.remove("Pedro");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-----------List Remove by Position: 5 -------------");
		list.remove(5);
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-----------List Remove by name beginning with 'M'-------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("--------Find a position------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("--------If not find, return:");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println();
		System.out.println("-------Filter by names with 'A'----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("----Filter the first name beginning with 'A'----");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("----If not find, return:");
		name = list.parallelStream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
