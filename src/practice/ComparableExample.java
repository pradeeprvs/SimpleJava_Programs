package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud= new ArrayList<>();
		stud.add(new Student(10, "Pradeep", "Tenth"));
		stud.add(new Student(12, "Praveen", "Tenth"));
		TreeSet<Student> ts=new TreeSet<>(stud);
		Iterator<Student> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().age+" "+itr.next().name);
		}
		
		for(Student s: stud) {
		System.out.println(s.age+""+s.name+""+s.sclass);
		}
		Collections.sort(stud);
		System.out.println(stud);
	}

}
