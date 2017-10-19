package oop;

// A class is a construct that enables creation of objects
// This will be our blueprint class to instantiate BankAccount objects

public class BankAccount implements IRate { // Use of Interface IRate which REQUIRES IMPLEMENTATION OF ALL IRate methods
	// Define variables
	String accountNumber;
	
	// THE BIG IDEA HERE IS:
	// static >> will say belongs to class and not the object instance
	// final >> is like our CONSTANT (often used/seen as: static final)
	// *****************************************************************
	//
	// Whenver you inssstantiate an object and want to use that property uniquely to that new object you don't want to 
	// use static. If you want to access something directly as pertaining to the class not a specific instance then you're
	// going to use the static keyword. 
	
	// static variable BUT should be private as an access modifier
	 //  so what static is saying is routingNumber variable belongs to the class itslef and
	// NOT the particular object. We can go one step further and declare it as static final
	
	private static final String routingNumber = "444582"; // Note discussion in BankAccountApp re Static keyword linew 25-27
	
	// instance variables
	
	// Sec 3 Lec 22 Encapsulation make name privtae
	private String name;   // so need to add getters and setters after constructor(s) 
	private String ssn;                             
	String accountType;
	double balance=0; // declare balance var outside all the ethods so is at clas level so all have access
	
	// Let's talk about Constructor's
	// Constructor definition: unique methods
	// 1. They are used to define and setup and initialize properties of an object
	// 2. Constructor's are IMPLICITLY called upon INSTANTIATION.
	       // BankAccount acc1 = new BankAccount(); in BankAccountApp
	// 3. Has the SAME name as the class itself
	// 4. Constructor's have NO return type at all
	// NOTE: Constructor's are a big concept you need to learn when interviewing

	
	// Polymorphism Sec 3 Lecture 24 - Polymorhism says we can have the same method name but we call it different code
	//     depending upon the parameter. 
	
	// BankAccount Constructor
	public BankAccount() { // [Default] Constructpr has same name as class itself Note Constructor is a method so has "()" at end
		// TODO Auto-generated constructor stub
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Sec 3 Lec 22 Encapsulation - main idea is to make variables private so we have private properties
			// and we'll interact with them through public methods.
	
	// Overloading: is when you call same method name with different arguments — this can be applied to 
	//     any method or constructor which is a special method
	
	// Constructor #2 — so let's create an other constructor 
	
	public BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("ROUTING NUMBER: " + routingNumber); // why is this printing out "632983" when defined as static "444582"?
	
	}
	
	// Constructor #3
	public BankAccount(String accountType, double initDeposit){
		
		// initDepost, accountType, msg are all local variables 
		
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF $" + initDeposit);
		
		// Scope of variables - sec 3, lec 19
		String msg=null; // var msg only available within this block of code
		if (initDeposit < 1000){
			msg = "ERROR: Miniimum deposit must be at least $1,000.00";
		} else {
			
			System.out.println("Thanks for your initial deposit of: $" + initDeposit);
		}
		System.out.println (msg); //
		balance+=initDeposit;
	}
	
	// GETTERS AND SETTERS < == > ENCAPSULATION SEE LINE 28 where we start defining private instance variables
	//    allow user to define the name
	
	// getter
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = "Mr. "+ name; // this.name is the local variable name where parameter name is the private declared instance variable name
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Interface methods
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
		
	}
	// Define methods
	// Access Modifiers private ==> default ==> protected (similar to default except thru inheritance) ==> public 
	public void deposit(double amount){ // public class means its available anywhere in the *** project *** eg oop in this case
		
		// scope of variables Sec 3 Lecture 19
		//System.out.println(initDeposit); // note this method does NOT recognize var initDeposit (above) b/c this var was defined in anoher method
		       							 // only accesible wihtin the block it was defined
		
		// Access Modifiers 
		balance += amount;
		showActivity("DEPOSIT");
		 
	}
	
	void withdraw(double withdraw) { // the default (no) modifier means anywhere in the *** package *** 
		balance -= withdraw;
		showActivity("WITHDRAW");
		
	}
	
	
	// private >> can only be called within the class
	private void showActivity(String activity) { // private is only available within the BankAccount class
	//	System.out.println("Showing recent activity");
		
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
		
	}
	
	void checkBalance() {

		// we can now access balance globally declared line 22 at class level 
		System.out.println("Balance is: " + balance);
		
	}
	
	void getStatus() {
		
		
	}
	
	// Override 
	@Override // @Override annotation means we are calling toString() methid in BankAccount class and not from the Object class
	public String toString() {
		return "[ NAME:"+ name + ", ACCOUNT#: " + accountNumber + ", ROUTING# " + routingNumber + "BALANCE: $" + balance + " ]";
		
		
	}

/*	public BankAccount() {
		// TODO Auto-generated constructor stub
	}*/

	
}
