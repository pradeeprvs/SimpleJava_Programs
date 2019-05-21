package practice;

public class Student implements Comparable<Student>{
	
	int age;
	String name;
	String sclass;
	public Student(int age, String name, String sclass) {
		super();
		this.age = age;
		this.name = name;
		this.sclass = sclass;
	}
	@Override
	public int compareTo(Student S) {
		// TODO Auto-generated method stub
		if(age>S.age) {
			return 1;
		}
		else if(age<S.age) {
			return -1;
		}
		else 
			return 0;
		
	}
	
}
