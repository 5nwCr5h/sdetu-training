package labs;

public class Lab2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a student
		Student1 stu1 = new Student1 ("Janelle", "321456837");
		Student1 stu2 = new Student1 ("Thomas", "421368314");
		Student1 stu3 = new Student1 ("Elizabeth", "690456832");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
	//	stu1.showCourses();
	//	stu1.checkBalance();
		stu1.payTuition(600);
	//	stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}

class Student1 {
	// Properties - private to preserve encapsulation
	private static int iD=0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;// cost belongs to Int not the student
	private int balance=0;
	
	// constructor
	public Student1 (String name, String ssn){
		iD++; // increment each new student id by 1
		this.name = name;
		this.ssn = ssn;
		setUserId();
	//	setAccountId();
		setEmail();
	}
	
	
	
	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	private void setEmail(){	
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail(){
		return email;
	}
	
	private void setUserId(){
		int max=9000;
		int min=1000;
		int randNum = (int) (Math.random()*((max-min)));
		randNum = randNum + min; // ???
		//System.out.println(randNum);
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	// methods
	public void enroll(String course){
		this.courses = this.courses + " " + course; // add a course everytine we enroll
	//	System.out.println(courses);
		balance += costOfCourse;
	}
	
	public void payTuition(int amount){
		System.out.println("Payment: " + amount);
		balance -= amount;
		
	}
	
	public void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	
	
	public void showCourses(){
		System.out.println("Courses: $" + courses);
	}
	
	@Override
	public String toString(){
		
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";
		
	}
	
	
}