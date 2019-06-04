import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		List<String> names= new ArrayList<String>(Arrays.asList("pradeep", "praveen", "pradeep", "Junaid","Pradeep"));
		//		Set<String> store= new HashSet<String>();
		//		
		//		for(String name:names) {
		//			if(store.add(name)== false)
		//				System.out.println("The Duplicate String is : "+name);
		//else
		//System.out.println("There is no Duplicate String");

		int[] arr= {1,2,3,42,2,1};
		

		for(int i=0,j=i+1;i<arr.length-1;i++) {
			int count=1;
//			System.out.print(arr[i]+" ");
//			System.out.print(arr[i+1]);
			if(arr[i]==arr[j]) {
				count++;
			}	
			if(count>1) 
				System.out.println("Element: "+arr[i]+" and noOfTimesFound : "+count);
		}

	}

}
