package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//import javafx.util.Pair;

public class Map_To_List_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> rankCompany = new HashMap<Integer, String>(); 

		// adding key-value pairs to HashMap object
		rankCompany.put(1, "IBM");
		rankCompany.put(2, "Microsoft");
		rankCompany.put(3, "Accenture");
		rankCompany.put(4, "Oracle");
		rankCompany.put(5, "Hewlett Packard");
		rankCompany.put(6, "SAP");
		rankCompany.put(7, "TCS");
		
		System.out.println(rankCompany);
		
//		 List<Pair<Integer, String>> entryList = rankCompany
//	                .entrySet()
//	                .stream()
//	                .map(e -> new Pair<Integer, String>(
//	                        e.getKey(), e.getValue()))
//	                .collect(Collectors.toList());

	}

}
