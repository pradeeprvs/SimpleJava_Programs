
public class string_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "abcddcba";
		String rev="";
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.reverse())) {
			System.out.println("Given string is pallindrome");
		}
		
		
		
		//System.out.println(str.charAt(3));//Prints the Character at a particular Index
		//System.out.println(str.indexOf("d"));//Prints the Index of that Parcticular Character
		
		for(int i=str.length()-1;i>=0;i--) {
			//char Str1= str.charAt(i);
			//System.out.print("\t"+str.charAt(i));
			rev= rev + str.charAt(i);
		}	
		System.out.println("\n\t The Reversed String is "+rev);
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("The given String is a Pallindrome");
		}
		else {
			System.out.println("The given String is a NOT A Pallindrome");
		}
	}

}
