package arrays;

import java.util.Arrays;
import java.util.HashSet;

// PROBLEM DESCRIPTION - Find if an array have any duplicate element in it- if yes return True elese false;


public class DuplicateElementsInArray {

	public static void main(String[] args) {
		DuplicateElementsInArray dp = new DuplicateElementsInArray();
		int[] nums = {1,2,4,5,6,8,9,9};
//		System.out.println(dp.containsDuplicateBF(nums));
//		System.out.println(dp.containsDuplicateSorted(nums));
		System.out.println(containDup(nums));

	}

// Brute Force but giving error TIME LIMIT EXCEEDED
// O(N2) O(1)
	boolean containsDuplicateBF(int[] nums) {
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
	}
	
// OPTIMAL WAY - we can sort array and compare it's adjacent elements
	boolean containsDuplicateSorted(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}
	
// More Optimal - using Hash Set - 
    public boolean containsDuplicateHS(int[] nums) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }else{
                numbers.add(nums[i]);
            }
        }
        return false;
        
    }
    
// Brute force for duplicate array
    public static boolean containDup(int[] arr) {
    	int n = arr.length;
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; j<n; j++) {
    			if(arr[i]==arr[j]) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
	
}
