package oop;



// A class is a construct that enables creation of objects
public class CDAccount extends BankAccount implements IRate{ // classes can have multiple interfaces but only one extension
	String interestRate;
	void compount(){
		System.out.println("Compounding interest");
	}
}
