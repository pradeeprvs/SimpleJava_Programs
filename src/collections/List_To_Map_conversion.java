package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_To_Map_conversion {
	
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(1001,"Pradeep","Hyderabad"));
		students.add(new Student(1002,"Praveen","VZA"));
		students.add(new Student(1003,"Tester","DEL"));
		
		//To Print these values
		students.forEach(l -> System.out.println(l.getName()+ " " + l.getId()+ " "+l.getAddress() ));
		
		//To convert the List into Map
		Map<Integer, Student> mapOfStudents= students.stream().collect(Collectors.toMap(s->s.getId() , s ->s));
		
		mapOfStudents.forEach(
                (key, value) -> System.out.println("Key: " + key  
                        + "\tValue: "+ value));
	}

}
