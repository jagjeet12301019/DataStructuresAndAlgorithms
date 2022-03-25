package arrays;

import java.util.ArrayList;

public class BinarySearch1FrequencyOfElement {

	public static void main(String[] args) {
		int[] array1 = {1,1,4,4,4,4};
		System.out.println(returnIndexes(array1));
	}
	
	public static ArrayList<Integer> returnIndexes(int[] array1){
		ArrayList<Integer> out = new ArrayList<Integer>();
		for(int i=0; i<array1.length - 1; i++) {
			if(array1[i] == array1[i+1]) {
				out.add(array1[i]);
			}
		}
		return out;
	}
}
