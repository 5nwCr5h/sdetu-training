package basics;

public class Cities {

	public static void main(String[] args) {
		// Deckare the array implicitly
		
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println ( cities[0]);
		System.out.println ( cities[1]);
		System.out.println ( cities[2]);
		System.out.println ( cities[3]);
		

		
		// declare array
		String[] countries;
		
		// Define the array
		countries = new String[2];
		
		System.out.println("******************");
		
		// Declare & Define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i=0;
		
		// do loop enters the loop then tests condition
		do {
		System.out.println ("STATE: " + states[i]);
		i++;
		} while (i<5);
		
		// other method would be to use the while loop
		// tests condition first then enters loop
		
		System.out.println("******************");
		
		int n=0;
		boolean stateFound = false;
		// while (n<=4){
		 while (!stateFound){
			// System.out.println ("STATE at: " + n + ": " + states[n]);
			 String state = states[n];
			 System.out.println (state);
			 if (state == "Texas"){
				 System.out.println ("STATE FOUND!");
				 stateFound = true;
			 }
			 n++;
		 }
		 
		 // For loop—Best structure for iterating through an array
		 System.out.println ("\nPRINTING WITH FOR LOOP");
		for (int x =0; x<=4;x++){
			 System.out.println (states[x]);
			
		}
		
/*		System.out.println ( states[0]);
		System.out.println ( states[1]);
		System.out.println ( states[2]);
		System.out.println ( states[3]);
		System.out.println ( states[4]);*/
		
		

	}

}
