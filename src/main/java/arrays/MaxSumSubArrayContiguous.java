package arrays;

import java.util.Scanner;

//PROBLEM DESCRIPTION - find a contiguous subArray having maximum sum among all the sub-array contiguous combinations

public class MaxSumSubArrayContiguous {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String ans = "";
        if(n%2 == 1 || n>= 6 && n<=20){
          ans = "Weird";
        }
        else if (n%2 == 0 || n >= 2 && n <= 5){
            ans = "Not Weird";      
        }
        else{
           ans = "Not Weird"; 
        }
            
      }
// MOST OPTIMAL AFTER MULTIPLE SUBMISSIONS AND GO THROUGHS
		public static int returnSum(int[] nums) {
			int maxSum = nums[0];
			int currSum = 0;
			for(int i=0; i<nums.length; i++) {
				currSum = Math.max(nums[i]+currSum, nums[i]);
				maxSum = Math.max(currSum,maxSum);
			}
			return maxSum;
		}
		
// Brute Force way of finding highest sum contiguous array.	
	public static int getSum(int[] nums) {
		int maxSum = 0;
		for(int i=0; i<nums.length; i++) {
			int currSum = 0;
			for(int j=i; j<nums.length; j++) {
				currSum = currSum + nums[j];
				if(currSum>maxSum) {
					maxSum = currSum;					
				}
			}
			
		}
		return maxSum;
	}

// Kadane's sum -- WRONGLY EXPLAINED BY ANUJ NOT WORKING IN TWO CASES :
	// IF maxSum = 0 then for array = , it is giving zero which is wrong.
	// IF maxSum = array[0] i.e. first element of array then 
	
	public static int returnSumCon(int[] nums) {
		int maxSum = 0; // not working for -1 or any array of negative numbers {-1,-4,-3,-9}
		//int maxSum = nums[0]; //Wrong in case 2- not working for {-3,-2,0,-1}
		int currSum =0;
		for(int i=0; i<nums.length; i++) {
			currSum = currSum + nums[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}else if(currSum < 0) {
				currSum =0;
			}
		}		
		return maxSum;
	}
}
