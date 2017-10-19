package basics;

public class SalaryCalculator {

	public static void main (String[] args){
		// Let's create a variable to define our career
		// Declare a variable 
		String career; // not initialized
		System.out.println("Program is starting...");
		
		// define variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare and define 
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		// compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
	}

}
