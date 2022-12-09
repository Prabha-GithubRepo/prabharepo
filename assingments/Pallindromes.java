package week1.assingments;

public class Pallindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str="madam";
		char[] charArray = str.toCharArray();
		String rev="";
		for (int i = charArray.length-1;i>=0; i--) {
			System.out.print(charArray[i]);
			System.out.println();
			rev=rev+charArray[i];
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string " +str+ " is Pallindrome");
		}else
		{
			System.out.println("Given string " +str+ " is not a Pallindrome");
		}
		
	}

}
