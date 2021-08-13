package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamObjectDemo {

	public static void main(String[] args) {
		List<Bus> busList=new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
	    List<Bus> kitty=new ArrayList<>();
		for(Bus bus:busList) {
			if(bus.getRatings()>4) {
				kitty.add(bus);
			}
		}
		for(Bus bus:kitty) {
			System.out.println(bus);
		}
		System.out.println("\nusing stream: ");
		busList.stream().filter(e->e.getRatings()>4)
		        .collect(Collectors.toList())
				.forEach(System.out::println);
		
		float total=busList.parallelStream().map(e->e.getRatings())
				.reduce(0.0f,(sum, element)->sum+element);
		System.out.println("\naverage : "+total/busList.size());
		
		float AbcTravelstr=busList.stream()
					.filter(e->e.getProvidername().equals("Abc Travels"))
					.map(e->e.getRatings())
					.reduce(0.0f,(sum, element)->sum+element);
		
		float count=busList.stream().filter(e->e.getProvidername().equals("Abc Travels")).count();
		System.out.println("\navg rating of all busses: "+AbcTravelstr/count);
		
		System.out.println("\nOriginal list: ");
		busList.forEach(System.out::println);
	}

}
