package labs;

import java.lang.Character.Subset;

public class BankAccountApp {	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("2223334444", 1000.50); // calls constructor lines 33-40 SSN 
		BankAccount acc2 = new BankAccount("3334445555", 2000);
		BankAccount acc3 = new BankAccount("4445556666", 2500);
		
		// set name via encapsulation
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue(); // call accrue() methid in IInterest Interface
		
		System.out.println(acc1.toString()); // print (Sysout) and call toString() method
	}
	
	// need a toString() method for after each transaction 
	


}

class BankAccount implements IInterest { // Interface IInterest so then must implement method accrue()
	// Properties of bank account
	private static int iD = 1000;				// Internal ID and static so belongs to the class not a particular person
	private String accountNumber; 	// ID + random 2-digit number + 1st two digits of SSN
	private static final String routingNumber = "005400657"; 	// also static since will not be unique to each object—it will be the case for all classes, all objects, all accounts
																// final so value cannot be changed 
	private String name;
	private String SSN; // no getters/setters needed for SSN as SSN is created in the constructor
	private double balance;


	// Constructors
	public BankAccount(String SSN, double initDeposit){
	//	System.out.println("New account created");
		
		balance = initDeposit; // pull initDeposit from constructor 
		this.SSN = SSN; // set value of instance variable SSN to local variable SSN.
		iD++;
		// System.out.println(iD); // Every time a new account is created iD will increnment each time b/c iD is staying with the class
								// and not the object
		setAccountNumber(); // set account number in private method
	}
	
	// getters and setters
	
	private void setAccountNumber(){
		int random = (int)(Math.random() * 100); // this will generate a random 2 digit number
	//	System.out.println(random); // in-line testing 
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber); // in-line testing 
	}
	
	// set name
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name; // return instance variable name
	}
	
	// methods
	
	public void payBill(double amount){
		balance -= amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount){
		balance+=amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}

	@Override  // added unimplented Interface method! (see below deleted method)
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1+ (rate/100));
		showBalance();
	}
	
	
/*	public void accrueInterest(){
		
	}*/
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}

}
