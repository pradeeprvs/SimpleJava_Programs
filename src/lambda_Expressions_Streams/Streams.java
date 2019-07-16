package lambda_Expressions_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicles= new ArrayList<>();
		vehicles.add("Car");
		vehicles.add("Train");
		vehicles.add("Bus");
		vehicles.add("Bike");
		
		//We're introducing a conditional statement inside the for loop
		for(String v:vehicles) {
			if(v.equalsIgnoreCase("Car")) {
				System.out.println(v);
			}
		}
		
		//Now we're using streams to do the same
		vehicles.stream().filter(v -> v.equalsIgnoreCase("Car")).collect(Collectors.toList()).forEach(System.out::println);
		
		//or You can collect the values into a list and then print later
		List<String> newList = vehicles.stream().filter(v -> v.equalsIgnoreCase("Car")).collect(Collectors.toList());
		newList.forEach(l -> System.out.println(l));
	}

}
