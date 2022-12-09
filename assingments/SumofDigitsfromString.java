package week1.assingments;

public class SumofDigitsfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Method 1
		 * Pseudo Code
		 
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) using replaceAll(), replace all the non-digits into ""
		 * b) Now, convert the String into array
		 * c) Iterate over the array and get each character
		 * d) Using Character.getNumericValue(), Change the char into int
		 * e) Add the values to sum & print
		 * 
		 */
		
		/*
		 * Method 2
		 * Pseudo Code
		 * Declare a String text with the following value
			String text = "Tes12Le79af65";
		   Declare a int variable sum
			int sum = 0;
		 * a) Iterate an  array over the String
		 * b) Get each character and check if it is a number using Character.isDigit()
		 * c) Now covert char to int using Character.getNumericValue() and add it to sum
		 * d) Now Print the value
		 */
		String text = "Tes12Le79af65";
		int sum=0;
		int sum1=0;
		//method 1
		String onlyno = text.replaceAll("[a-z A-Z]", "");
		char[] charArray = onlyno.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			int num = Character.getNumericValue(charArray[i]);
			System.out.print(num);
			sum=sum+num;
		}
		System.out.println();
		System.out.println("Total sum: " +sum);
		
		//method 2
		char[] charArray2 = text.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {
			if(Character.isDigit(charArray2[i])) {
				int num1 = Character.getNumericValue(charArray2[i]);
				System.out.print(num1);
				sum1+=num1;
			}			
		}
		System.out.println();
		System.out.println("Total sum: " +sum1);

	}
}
