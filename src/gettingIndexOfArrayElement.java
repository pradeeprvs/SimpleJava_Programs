
public class gettingIndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,9,6,7,4};
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==9) {
				System.out.println("The index of 9 is :"+ i);
				break;
			}
		}
	}

}
