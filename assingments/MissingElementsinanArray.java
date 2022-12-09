package week1.assingments;

import java.util.Arrays;

public class MissingElementsinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// Sort the array	
				// loop through the array (start i from arr[0] till the length of the array)
				// check if the iterator variable is not equal to the array values respectively
				// print the number
				// once printed break the iteration
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=(i+1)) {
				System.out.println("Missing number is: " + (i+1));
				break;
			}
			
		}
	}

}
