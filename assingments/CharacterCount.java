package week1.assingments;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hexaware";
		char exp='e';
		int count=0;
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(exp==charArray[i]) {
				count++;
			}
		}
		System.out.println("No.of times the expected character " +exp+ " repeated: "+count);
	}

}
