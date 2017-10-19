package oop;


// we'll create a blueprint which is called a class
class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
		
	}
	void eat() {
		System.out.println(email);
		
	}
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
	
}

public class Demo {

/*	public Demo() {
		// TODO Auto-generated constructor stub
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// So instead of all the below code (now commented out) we'll create a new person as follows:
		
		// instantiating an object
		Person person1 = new Person(); // we create a variable person1 new keyword Java allocates space for new v
		                               // variable person1
		
		// define properties 
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "1112223333";
		
		
		// Abstraction
		person1.walk(); // this iis all we need now
		
		// later on well call the below methods person1.sleep, etc. 
		// abstraction is the ability at any time be able to abstract or get information from that object or 
		//   only the parts that we want.
		
/*		person1.sleep();
		person1.eat();
		*/
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		
		// Person
		// attributes, variables, adjectives, descriptors
		/*String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "1234567891";
				
		// Action, acrtivity, behavior
	//System.out.println(name + " is walking");	so instead of printing this we'll call the walking function
		walking(name);
		System.out.println(name + " is eating");	
				
		// what if we wanted to do this for another person?
		// copy paste above and create for new person
		
		// Person
		// attributes, variables, adjectives, descriptors
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "9876543210";
				
		// Action, acrtivity, behavior
		// System.out.println(name2 + " is walking");	so instead of printing this we'll call the walking function
		walking(name2);
		System.out.println(name2 + " is eating");	*/
	}
	// still not an ideal object-oriented programming solution
	
	// What about binding attributes and properties together?
	// How do we ensure that the right methods go with the right properties?
	// ==> Create a class Person (at top)
	

		// Enhance by adding functions to minimize code
/*		static void walking(String name){
			System.out.println(name + " is walking");
			
		}*/
}


