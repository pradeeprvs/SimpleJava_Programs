package lambda_Expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambda_Expressions {

	public static void main(String[] args) {
		
		List<String> vehicles= new ArrayList<>();
		vehicles.add("Car");
		vehicles.add("Train");
		vehicles.add("Bus");
		vehicles.add("Bike");
		
		//in order to print the above values, We have
		
		//1. Traditional for loop
		System.out.println("Printing in the For Loop : ");
		for(int i=0;i<vehicles.size();i++) {
			System.out.println(vehicles.get(i));
		}
		
		//2. Enhanced for loop
		System.out.println("\nPrinting in the Enhanced For Loop : ");
		for(String v: vehicles) {
			System.out.println(v);
		}
		
		//3.Iterator
		System.out.println("\nPrinting in the Iterator format");
		Iterator<String> itr= vehicles.iterator();
		while(	itr.hasNext()) {
			System.out.println(itr.next());		
		}
		
		//4.Using Lambda Expression
		System.out.println("\nPrinting in the Lambda expression format");
		vehicles.forEach(transport -> System.out.println(transport));
		
		//5.If our purpose is only to print, we can print the values like this as well
		System.out.println("\nIf our purpose is only to print, we can print the values like this as well");
		vehicles.forEach(System.out::println);

	}

}
