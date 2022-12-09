package week1.assingments;

import java.util.Iterator;

public class ReverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)	
		d)split the words and have it in an array
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
		String test = "I am a software tester learning Automation in Testleaf";
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(i%2!=0 && words[i].length()>1) {
				char[] charArray = words[i].toCharArray();
				String rev= "";
				for (int j = charArray.length-1; j>=0; j--) {
					rev=rev+ charArray[j];
				}
				System.out.println("Evenly reverse words : " +rev+ " ");
			}
			else 
			{
				System.out.println(words[i]+ " ");
			}
			
		}
		
	}

}
