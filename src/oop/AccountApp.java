package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmortSchedule();
		la.setTerm(20);

		// another form of polymorphism
		// Polymorphism ==> changes where we are pointing 
		
		IRate account1 = new LoanAccount(); // ??? 
		// will call the increaseRate and setRate methods in the LoanAccount 
		account1.increaseRate();
		account1.setRate(); 
		
			
	}

}
