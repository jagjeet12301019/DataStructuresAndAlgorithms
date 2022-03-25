package binarySearch;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Main class to take the input -
public class BinarySearchUsingScannerCLassInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();	
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				System.out.println("Enter element Number: " + i);
				arr[i] = sc.nextInt();
			}
			
		}
		System.out.println("Enter integer to search in above array: ");
		int k = sc.nextInt();
		T--;
	}

}
