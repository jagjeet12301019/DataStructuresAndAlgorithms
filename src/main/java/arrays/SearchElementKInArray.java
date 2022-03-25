package arrays;

// An Element K is given || Find if this element is present in array ? || if yes return index of element || if No return -1
// This APplies when the array is Sorted.

public class SearchElementKInArray {

	public static void main(String[] args) {
		int[] arrayVar = {1,4,5,6,7,9};
		System.out.println(returnIndex(arrayVar));
	}

	public static int returnIndex(int[] arrayVar) {
		int elementToFind = 10;
		int low = 0;
		int high = arrayVar.length - 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(elementToFind==arrayVar[mid]) {
				return mid;							
			}else if(elementToFind<arrayVar[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
}