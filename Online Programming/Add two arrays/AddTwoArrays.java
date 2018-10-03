// Problem: Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100.
// 1<=N<=100

// Solution:

import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = 0;
		// Reading integer from input
		do {
			System.out.println("Enter the size of array (greater than Zero) \n");
			N = s.nextInt();
		} while (N <= 0);

		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];

		// Read numArray1
		System.out.println("Enter values for array 1");
		for (int i = 0; i < N; i++) {
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		System.out.println("Enter values for array 2");
		for (int i = 0; i < N; i++) {
			numArrayB[i] = s.nextInt();
		}

		// Write your logic here:
		System.out.println("Resultant Array is: ");
		for (int i = 0; i < N; i++) {
			sumArray[i] = numArrayA[i] + numArrayB[i];
		}

		// Print the sumArray
		for (int i = 0; i < N; i++) {
			System.out.print(sumArray[i] + " ");
		}
	}
}
