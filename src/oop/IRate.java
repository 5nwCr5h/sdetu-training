package oop;


// Interfaces are helpful to use 
public interface IRate { // Interface "has a" interest rate whereas Inheritcance "is a" eg CDAccount "is a" BankAccount
	                     // LoanAccount "has an" Irate
	
	// We can write the class outline (below) and basically have all of our classes implement an interface
	// ie leave all the implementation up to that specific class
	public void setRate();
	public void increaseRate();
}
