
public class StaticMethodInClass {

	public static String toString(){
		System.out.println("Test toString called");
		return "";
	}
	
	public static void main(String args[]){
		System.out.println(toString());
	}
}
