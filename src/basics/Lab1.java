
package basics;

import java.util.*;

public class Lab1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1. Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println("Sum(9) = " + Sum(9)); // 1
		System.out.println("fac(1) = " + fac(4)); // 2
		
		
		int[] numbers = {4, 500, 74, 66, 0};
		System.out.println("Minimum value of array is :" + min(numbers));
		System.out.println("Average value of array is :" + avg(numbers));
		System.out.println("Maximum value of array is :" + max(numbers));
		
		}	
	
	public static int Sum(int n){
	int result=0;
	for (int i=1; i<=n; i++){
	 result += i;
	
	}
	return result;
		

	}
	
	
/*	2. Write a function that computes the factorial value
	Definition: n! = n*(n-1)! , where 0! = 1
	1! = 1
	2! = 2 * 1!
	3! = 3 * 2!
	4! = 4 * 3!
	Hint: use the recursive method that was used to calculate Fibonnaci number*/
	
	public static int fac(int f) {
		
		if (f == 0){
			
			return 1;
		} 
		else if (f == 1){
			return 1;
		}
		return ( ((fac(f-1)) * f) ); // recursion
		
	}
	
	/*3. Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
			Hint: this should be static functions with a return type of the same data type as the array declaration.*/

	public static int min(int[] numbers) {
		
		int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
	}
	public static int avg(int[] numbers) {
		
		  int avgValue = 0;
		  for(int i=0;i < numbers.length;i++){
			  
			avgValue += numbers[i];

			}
	
		  return avgValue/numbers.length;
		
	}
	public static int max(int[] numbers) {
		
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		
	}
}
