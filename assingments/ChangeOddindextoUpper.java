package week1.assingments;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class ChangeOddindextoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String test= "changeme";
		String veri= "12345678";
		String resu= "cagm";
		char[] charArray = test.toCharArray();
		for (int i = 0; i <charArray.length; i++) {
			if(i%2==0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			}
			
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}

}
