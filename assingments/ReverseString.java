package week1.assingments;

public class ReverseString {

	public static void main(String[] args) {
	
		String name="ReverseString"; //gnirtsesrever
		char[] charArray = name.toCharArray();
		
		System.out.println(charArray.length);
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			
		}
	}

}
