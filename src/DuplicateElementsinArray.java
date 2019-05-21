import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names= new ArrayList<String>(Arrays.asList("pradeep", "praveen", "pradeep", "Junaid","Pradeep"));
		Set<String> store= new HashSet<String>();
		
		for(String name:names) {
			if(store.add(name)== false)
				System.out.println("The Duplicate String is : "+name);
			//else
				//System.out.println("There is no Duplicate String");
		}
	}

}
