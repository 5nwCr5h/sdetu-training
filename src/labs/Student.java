package labs;

public class Student {	
	private static int iD = 0;
	//private static final String iD = "12345";
	// private String userId;
	private String userId;
	private String name;
	private String ssn;
	private String phone;
	private String city;
	private String state;
	private String[] courses = new String[] { "MAT272", "PHY150", "CSE205" };
	private double balance;
	private String email;

	// Constructor

	public Student(String name, String ssn) {
		iD++;
		this.ssn = ssn;
		this.name = name;
		setEmail();
		setUserId();
	//	String email = this.name + "@asu.edu";
	//	System.out.println(email);
	}

	// getters setters

	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getPhone(){
		return phone; // return instance variable name
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city) {
		this.name = city;
	}
	
	public String getState(){
		return state;
	}

	public void setState(String state) {
		this.name = state;
	}

	
/*		 * Generate a user ID that is combination of Static ID, random 4-digit
	 * number between 1000 and 9000, and last 4 of SSN*/
	 
	private void setUserId() {
		/*int random = (int) (Math.random() * 10000);
		 System.out.println("Random =: " + random);
	     userId = iD + "" + random + SSN.substring(6);
	     System.out.println("Your User ID: " + userId); // in-line testing
*/		
		
		int max=9000;
		int min=1000;
		int randNum = (int) (Math.random()*((max-min)));
		randNum = randNum + min; // ???
		//System.out.println(randNum);
		userId = iD + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
	}

/*	public String getEmail(){
		return email;
	}
	private void setEmail(String name) {
		this.name = name;
		email = name + "@asu.edu";
		System.out.println("email: " + email);

	}*/

	// methods

	public void enroll() {

	}

	public void pay(double amount) {
		balance -= amount;
		System.out.println("Pay: " + amount);
		checkBalance();
	}

	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public String toString() {

		return "[Name: " + name + " ]\n[User ID: " + userId + "]\n" + "[email: " + email + "]\n" + "[Balance: "
				+ balance + "]";
	}

	public void showCourses() {
		for (int i = 0; i < courses.length; i++){

			System.out.println("Courses I Have: " + courses[i]);}
	}
}
