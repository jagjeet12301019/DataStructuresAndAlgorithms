package binarySearch;

public class BinarySearchUsingRECURSION {

	public static void main(String[] args) {
		int[] arr = {1,4,5,5,6,7,8,9};
		System.out.println("INDEX FOUND AS : " +getIndexOfKthElement(arr, 6, 0,arr.length - 1));

	}
	
	static int getIndexOfKthElement(int[] arr, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int mid= (low+high)/2;
		if(arr[mid] == key) {
			return mid;
		}else if(arr[mid] > key) {
			return getIndexOfKthElement(arr, key, low, mid-1);
		}else {
			return getIndexOfKthElement(arr, key, mid+1, high);
		}
	}

}
