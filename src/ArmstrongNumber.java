
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,temp = 0,rem,sum=0;
		temp=n;
		
		while(n>0) {
			rem=n%10;
			System.out.println(sum=sum+(rem*rem*rem));
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("The given Number "+ temp+" is a Armstrong Number");
		}
		else {
			System.out.println("The given Number "+ temp +" is NOT a Armstrong Number");
		}
	}

}
