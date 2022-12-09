package week1.assingments;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details = "Amazon has 11400 employees in chennai";
		char[] charArray = details.toCharArray();
		String replace = details.replace("Amazon","");
		String onlywords = details.replaceAll("[0-9]", "");
		String onlyNum = details.replaceAll("[a-z A-Z]", "");
		String OnlyNum1 = details.replaceAll("[^0-9]", "");
		System.out.println("Only Words: " +onlywords);
		System.out.println("Only Nums: " +onlyNum);
		System.err.println(replace);
		System.out.println("Remove otherthan Nums: " +OnlyNum1);
		//using ASCII values
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] >=48 && charArray[i]<=57) {
				System.out.print(charArray[i]);
			}
		}
	}

}
