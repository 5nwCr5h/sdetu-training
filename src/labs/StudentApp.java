package labs;
import java.lang.Character.Subset;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student stu1 = new Student("Janelle", "2223334444"); // getting error here???
		
		Student stu1 = new Student ("Janelle", "321456837");
		Student stu2 = new Student ("Thomas", "421368314");
		Student stu3 = new Student ("Elizabeth", "690456832");
																	
		// set values for phone, city, state
		stu1.setPhone("2015551212");
		stu1.setCity("duluth");
		stu1.setState("Michigan");
		stu1.showCourses();
	//	System.out.println(stu1.getEmail());
		
		
		System.out.println(stu1.toString()); // print out Student info per assignment

	}
}
	



