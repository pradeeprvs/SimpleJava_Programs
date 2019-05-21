import java.io.*; 
class Emp { 

// static variable salary 
 static double salary; 
 static String name;
public Emp(double salary, String name) {
	super();
	double salary1 = salary;
	String name1 = name;
} 
void display() {
	System.out.println("The employee name and Salary are "+salary+" and "+name);
}
} 

public class Substring 
{ 
	public static void main(String args[]) { 
		
	//accessing static variable without object		 
		Emp e1=new Emp(1200, "Pradeep");
		Emp e2= new Emp(1400, "Praveen");
		e1.display();
		e2.display();
} 
	
} 
