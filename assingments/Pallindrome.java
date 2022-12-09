package week1.assingments;

public class Pallindrome {

	public static void main(String[] args) {
	
		String name="ReverseString"; //gnirtsesrever
		String ReverseString=" ";
		char[] charArray = name.toCharArray();
		
		System.out.println(charArray.length);
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			ReverseString=ReverseString+charArray[i];
			
		}
		System.out.println("String Name: " +name);
		System.out.println("Reverse String: " +ReverseString);
		if(name.equals(ReverseString)) {
			System.out.println("It is Pallindrome");
		}else
		{
			System.out.println("Not a Pallindrome");
		}
	}

}
