package week1.assingments;

import java.util.Arrays;

public class DuplicateNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,5,7,7,5,9,2,3};
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
				}
				
			}
			
		}
		
		//Another Method
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1])
				System.out.println("Duplicate Numbers are: " +nums[i]);
			
		}
	}

}
