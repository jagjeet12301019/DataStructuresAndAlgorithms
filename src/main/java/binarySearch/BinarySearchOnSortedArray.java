package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchOnSortedArray {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int check = returnIndex(81);
		System.out.println("Indesx of element is :: " + check);
	}

	public static int returnIndex(int n) {
		int[] targetArray = {1,2,3,5,65,70,78,80,84,88,89};

		int key = n;
		int low = 0;
		int high = targetArray.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == targetArray[mid]) {
				return mid;
			} else if (key > targetArray[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
