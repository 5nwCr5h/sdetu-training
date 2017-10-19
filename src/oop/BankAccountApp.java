package oop;

public class BankAccountApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a [new] bank account object >> think instantiate an object 
		// we create an object from a class by instantiating a new BankAccount object 
		// When we create that object [java] calls its constructor (Java provides empty default constructor if none created
		// Cpnstructor is called automatically as soon as we create an object. (see BankAccount class)
		
		BankAccount acc1 = new BankAccount(); // <== Q: why () after BankAccount? 
		// Now we can call any of the BankAccount methods available to us ==> acc1.
		
		// NOte: we do NOT have access to compount() method in cd1.compount or interestRate() method as does not work the other way around
		// ***** ON THE Static keyword *****
		
		// Lec 3 Sec 22 Encapsulation — so the below is not good practice eg acc1.name = "Roger Hue"; should be (below)
		// clients should not be able to define variables however they want.
	    //   acc1.name = "Roger Hue"; this now becomes 
		// With encapsulation : think public API methods. Encap is all about hiding—
		acc1.setName("Roger Hue"); //setter
		System.out.println(acc1.getName()); // getter prints out Roger Hue
		
		// ssn encapsulation
		acc1.setSsn("234567891");
		System.out.println("SSN: " + acc1.getSsn()); // getter prints out Roger Hue

		acc1.accountNumber = "4367389994";
//		acc1.routingNumber = "632983"; NOTE: Can no longer make this assignment WHEN routingNumber is declared static final in BankAccount
		
		acc1.balance = 10000;
		
		// interface
		acc1.setRate();
		acc1.increaseRate();
		
		// 
		acc1.deposit(1000);
		acc1.deposit(2000);
		acc1.deposit(3000);
		acc1.withdraw(2000);
			
		// Sec 3 Lec 24 below is also example of polymorphism 
		// Sec 3 Lec 22 Encapsulation - main idea is to make variables private so we have private properties
		// and we'll interact with them through public methods.
		
		// Access Modifiers Sec 3 Lec 21 — since we made showActivity() mwthod in BankAccount private
		// acc1.showActivity() does NOT appear iw is NOT available to us since WE'RE NOT IN THAT CLASS ANYMORE
		
		// Inheritance Section 3 Lecture 20
		// also polymorphism through overriding
		System.out.println(acc1.toString()); // Note: inherited from the object parent class and produces this: oop.BankAccount@6d06d69c
		    // we can use the toString() method for our own purposes. so create a void toString method in BankAccount class
		
		
		
		// instantiate 2nd constructor 
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account"); // not this maps to public BankAccount(String accountType) constructor
		acc2.accountNumber = "4367389994";
	//	acc2.routingNumber = "632893"; // What doesn't make sense if we have account1.routingNumber changes wtih account2.routingNumber
		                               // That wouldn't make any sense...as we want the routing number to be the same for each bank account
										// so make the variable static in the BankAccount class. 
		                                // NOTE: THis value is overriding the static assigned value in BankAccount class!?!?
		                                // NOTE: Can no longer make this assignment WHEN routingNumber is declared static final in BankAccount
		
		// Polymorphism through overloading
		// instantiate 3rd constructor (Overloaded constructor b/c 
		BankAccount acc3 = new BankAccount("Savings Account", 5000 );
		acc3.accountNumber = "4367389994";
		acc3.checkBalance();
		
		
		
		
		// If we print out routing numbner from this class the static routingNumber is output
		
	/*	System.out.println("acct1 routing number :" + acc1.routingNumber); // acc1.routingNumber = "632983"; prints out 632893
		System.out.println("acct2 routing number :" + acc2.routingNumber); // acc2.routingNumber = "632893"; prints out 632893
		System.out.println("acct3 routing number :" + acc3.routingNumber);*/ // not defined in BankAccoutApp but is as static inBankAccount
																		   // prints out 632893 (static defined value).
		
		// Demo for inheritance Sec 3 Lec 20
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
	//	cd1.name = "Juan"; // name is now private so is not available through this method
	    cd1.accountType = "CD Account"; // 
		System.out.println(cd1.toString()); //  will inherit the bank account toSting() method
		cd1.compount();
	}

}
