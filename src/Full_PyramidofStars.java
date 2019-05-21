
public class Full_PyramidofStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		//For Right angled Triangle
		for(int i =1;i<=rows;++i) {
			for(int j=1;j<i;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//For Equivalent Triangle
		int k=0;
		for(int i=1;i<=rows;++i,k=0) {
			for(int space=1;space<=rows-i;++space) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("*");
				++k;
			}
			System.out.println();
		}
	}

}
