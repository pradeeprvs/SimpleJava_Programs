
public class fibbonacciSeries {
/*The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. 
 * Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so forth */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,range=10;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<range;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
