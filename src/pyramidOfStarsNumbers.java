
public class pyramidOfStarsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=2*i-1;i<5;++i) {
			for(int j=0;j<i;j++) {
				System.out.print("");
			}
		 for (int k=0;k<=i+1;k++) {
			 
			 System.out.print(k);
			 
		 }
		 System.out.println();
		}
	}

}
