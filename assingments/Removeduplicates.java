package week1.assingments;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 	 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text= "We learn java basics as part of java sessions in java week1";
		int count=0;
		text.toLowerCase();
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length-1; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
				}	
			}
			if(count>1) {
				text=text.replace(words[i],"");
				count=0;
			}
		}
		System.out.println("String without duplicated words: " +text);
	}

}
