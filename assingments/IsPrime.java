package week1.assingments;

public class IsPrime {
	/*Home Assignment 2: Print if the given number is prime

	Goal: To understand the problem solving, looping and conditional statement

	a) Create a class by name: IsPrime
	b) Create a main method using shortcut
	c) Write a logic to find if the given number is prime or not
	d) Print if it is prime or not

	Hint: Iterate through all numbers from 2 to n-1 (input) and 
	for every number check if it divides n (input). 
	If we find any number that divides, print non- prime.
	If nothing divides, then print prime

	Time to given: 15 - 20 minutes.*/
	public static void main(String[] args) {
		int n=24;          //Assign a number
		boolean flag=true;   //set a flag to check if it is prime
		
		for (int i=2;i<n-1;i++) { //iterate till the given num from 2 to n-1 (Eg: 23 = 2 to 22)
			if(n%i==0)         // check if it divides, if not print prime
			{
				System.out.println("Given Number " +n+ " is Not Prime");
				flag=false;   //if it divides, set to false non-prime
				break; 		  //break out of the loop
			}
		}
		if(flag==true) {
			System.out.println("Given Number " +n+ " is Prime");
		}
	}
}
