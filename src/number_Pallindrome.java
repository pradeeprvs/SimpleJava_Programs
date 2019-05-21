
public class number_Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pallindrome Number
		int n=545, temp=0, sum = 0,rem;
		temp=n;
		
		while(n>0) {
			rem=n%10;
			System.out.println(sum=(sum*10)+rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("The given Number "+temp+" is a Pallindrome");
			}
		else	
			System.out.println("The given Number "+temp+" is not a Pallindrome");
	}
}
