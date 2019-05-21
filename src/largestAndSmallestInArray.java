import java.util.Arrays;

public class largestAndSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {-10, 15, 55,-88, 6666, 85874};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
				largest=numbers[i];
			else if(numbers[i]<smallest)
			    smallest=numbers[i];
		}
		System.out.println("The Given Array is "+Arrays.toString(numbers));
		System.out.println("The Largest Number is : "+largest+" and \nThe Smallest Number is : "+smallest);

	}
	
}
