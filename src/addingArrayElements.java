
public class addingArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		int sumOfElements = 0;
		System.out.println("TheElements in the given Array are : " );
		for (int i=0;i< arr.length;i++)
		{
			
			System.out.println(arr[i]);//Prints the individual elements
			sumOfElements=sumOfElements + arr[i];//adds the individual elements it collected
		}
		System.out.println("The Sum of Elements in the given Array are : " +sumOfElements);//prints the sum
	}

}
