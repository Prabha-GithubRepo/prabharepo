package week1.assingments;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the length of the array
		// declare an int variable named count
		// iterate from 0 to the array length-1 (outer loop starts here)
		// assign 0 to count 	
		// iterate from i to the length of the array by adding 1 to it (inner loop starts here)	
		// compare both the loop variables & check they're equal
		// print the matching value
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		System.out.println("Array length: " +arr.length);
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.println("Duplicate numbers are: " +arr[i]);
				}
				
			}
			
		}
	}

}
