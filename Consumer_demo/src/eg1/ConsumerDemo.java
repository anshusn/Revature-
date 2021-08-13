package eg1;

import java.util.ArrayList;
import java.util.List;

public class ConsumerDemo {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(1);
		numbers.add(6);
		numbers.add(3);
		numbers.add(7);
		
	for(Integer number:numbers) {
		System.out.println(number);
	}
	System.out.println("\nprinting using forEach(): ");
	numbers.forEach(e->System.out.println(e));
		
	System.out.println("\nprinting using method reference:");
	numbers.forEach(System.out::println);
		
	}

}
