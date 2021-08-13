package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(7);
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		
		System.out.println("printing using stream limit: ");
		numbers.stream().limit(3).forEach(System.out::println);
		
		System.out.println("\ncreating stream of squares: ");
		numbers.stream().map(e->e*e).forEach(e->System.out.println(e));
		
		System.out.println("\nconverting a stream to list: ");
		List<Integer> numlist=numbers.stream().map(e->e*e).collect(Collectors.toList());
		numlist.forEach(System.out::println);
		System.out.println("\nfilering the list: ");
		numbers.stream().filter(e->e>5).forEach(System.out::println);
		
		System.out.println("\nsort using stream: ");
		numbers.stream().sorted().forEach(System.out::println);
		
	}

}
