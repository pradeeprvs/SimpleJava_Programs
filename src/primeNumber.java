
class primeNumber { 
    public static void main(String[] args) 
    { 
        int n=53;//Take the number here
        int m=n/2;// for the looping purpose take half the given number
        int rem;//to capture the remainder value
        int count = 0;//to count how many times we got 0 as remainder
        
        if(n!=0 && n!=1) {
        	for(int i=1;i<=m;i++) {
        		rem=n%i;
        		System.out.println("Divided by "+i+" and the Remainder is "+rem);
        		if(rem==0) {
        			//System.out.println("The given number is not prime");
        			count= count+1;
        		}
        		
        	}
        	if (count>1)
    			System.out.println("The given number is not prime");
        	else
        		System.out.println("The given number is  prime");
        }
    } 
} 