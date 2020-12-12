package student;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

	public static void main(String[] args) {
		
	List<Student>  list=new ArrayList<Student>();
	Student st=new Student("Krishna", "123456", 545, "Hindu college", "B.sc");
	Student st1=new Student("Reddy", "12345678", 545, "Hindu Degree college ", "B.sc");
	
	list.add(st);
	list.add(st1);
	
	
	for(Student student:list) {
		System.out.println(student.getName()+" "+student.getPhone()+" "+student.getRoll()+" "+student.getCollege()+" "+student.getBranch());
		
	}
	

	}

}
